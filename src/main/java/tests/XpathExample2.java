package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.utils.BaseTest;

public class XpathExample2 extends BaseTest {

    @Test
    public void xpathExample() {

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        //parent
        /*
            selectam un element pe baza elementului copil
            1 --> folosing parrent::
            2 --> folosind /..
         */

        //  1 --> folosing parrent::
        driver.findElement
                (By.xpath("//a[@href='#popup_login']/parent::li[@class='menu_user_login']")).click();

        //2 --> folosind /..
        WebElement loginForm = driver.findElement(By.xpath("//ul//div[contains(@class, 'login_field')]/.."));

        jse.executeScript("arguments[0].setAttribute('style', 'background:yellow ;border:10px solid green')",
                loginForm);
    }

}
