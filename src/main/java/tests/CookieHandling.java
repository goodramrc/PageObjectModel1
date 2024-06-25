package tests;

import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;
import selenium.utils.BaseTest;

public class CookieHandling extends BaseTest {

    @Test(priority=1)
    public void addCookie() {

            Cookie cookie = new Cookie("My custom cookie" , "My super custom cookie value");
            driver.manage().addCookie(cookie);
            //driver.manage().addCookie(new Cookie("My custom cookie" , "My super custom cookie value"));
        }
}
