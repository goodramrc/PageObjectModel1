package tests;


import org.testng.annotations.Test;
import selenium.utils.BaseTest;

import static org.testng.Assert.assertTrue;


public class RefactorLoginTest extends BaseTest {

    @Test
    public void loginTest() {

        app.click(app.menu.loginLink);
        app.login.loginInApp("Test","Test");
        assertTrue(app.login.checkMsgIsDisplayed(app.login.errorLoginMsg));

    }
}