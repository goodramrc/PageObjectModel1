package tests;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class CookieHandling extends BaseTest{

    @Test(priority=1)
    public void addCookie() {

        Cookie cookie = new Cookie("MyCustomCookie", "My super custom cookie value");

        driver.manage().addCookie(cookie);
        //driver.manage().addCookie(new Cookie("My custom cookie", "My super custom cookie value"));
    }

    @Test(priority=2)
    public void getCookieNamed() {

        Cookie cookie = driver.manage().getCookieNamed("MyCustomCookie");
        Cookie cookie2 = driver.manage().getCookieNamed("PHPSESSID");

        System.out.println(cookie);
        System.out.println(cookie2);

    }

    @Test(priority=3)
    public void getAllCookies() {

        Set<Cookie> allCookies = driver.manage().getCookies();
        System.out.println(allCookies);

    }

    @Test(priority=4)
    public void deleteCookies() {

        driver.manage().deleteCookieNamed("MyCustomCookie");

        System.out.println("--------------------------------");

        Set<Cookie> allCookies = driver.manage().getCookies();
        System.out.println(allCookies);

        System.out.println("--------------------------------");

        driver.manage().deleteAllCookies();

        Set<Cookie> allCookies2 = driver.manage().getCookies();
        System.out.println(allCookies2);
    }


    //driver.manage().deleteAllCookies()


}
