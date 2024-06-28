package tests;

import static org.testng.Assert.assertTrue;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

import framework.utils.PropertiesFileProcessor;
import pageObjects.LoginPage;
import pageObjects.MenuPage;
import selenium.utils.BaseTest;

public class CookiesLogin extends BaseTest{

    Set<Cookie> cookies;

    String USER = PropertiesFileProcessor.readPropertiesFile("user", "credentials.properties");
    String PASS = PropertiesFileProcessor.readPropertiesFile("pass", "credentials.properties");

    @Test(priority=1)
    public void loginTest() {

        MenuPage menu = new MenuPage(driver);
        LoginPage login = new LoginPage(driver);
        menu.click(menu.loginLink);
        login.loginInApp(USER, PASS);
        assertTrue(login.checkMsgIsDisplayed(login.successLoginMsg));

        cookies = driver.manage().getCookies();

    }

    @Test(priority=2)
    public void cookiesLogin() throws InterruptedException {

        MenuPage menu = new MenuPage(driver);
        menu.click(menu.loginLink);

        for(Cookie cookie : cookies) {
            driver.manage().addCookie(cookie);
        }

        menu.click(menu.contactsLink);

    }


}
