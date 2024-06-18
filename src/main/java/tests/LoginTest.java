package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import framework.utils.PropertiesFileProcessor;
import pageObjects.LoginPage;
import pageObjects.MenuPage;
import selenium.utils.BaseTest;

public class LoginTest extends BaseTest{

    String USER = PropertiesFileProcessor.readPropertiesFile("user", "credentials.properties");
    String PASS = PropertiesFileProcessor.readPropertiesFile("pass", "credentials.properties");

    @Test(priority=1, groups = "UserManagementFunctionality")
    public void loginTest() {

        MenuPage menu = new MenuPage(driver);
        LoginPage login = new LoginPage(driver);

        menu.click(menu.loginLink);
        login.loginInApp(USER, PASS);
        assertTrue(login.checkMsgIsDisplayed(login.successLoginMsg));
        //login.logoutFromApp();
        login.click(login.logoutBtn);
    }

    @Test(priority=2, groups = "UserManagementFunctionality")
    public void invalidloginTest() {

        MenuPage menu = new MenuPage(driver);
        LoginPage login = new LoginPage(driver);

        //menu.navigateTo(menu.loginLink);
        menu.click(menu.loginLink);
        login.loginInApp(USER, "12312313");
        assertTrue(login.checkMsgIsDisplayed(login.errorLoginMsg));
    }

}
