package tests;

import framework.utils.PropertiesFileProcessor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.utils.BaseTest;

public class XpathExample extends BaseTest {

    @Test(priority=1)
    public void xpathExample1() throws InterruptedException {

        String USER = PropertiesFileProcessor.readPropertiesFile("user", "credentials.properties");
        String PASS = PropertiesFileProcessor.readPropertiesFile("pass", "credentials.properties");
        /*
        Comparatie

        CSS:
        li[class='menu_user_login']

        XPATH:
        //li[@class='menu_user_login']
         */

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        WebElement loginBtn = driver.findElement(By.xpath("//li[@class='menu_user_login']"));

        jse.executeScript("arguments[0].setAttribute('style', 'background:yellow ;border:10px solid green')",
                loginBtn);

        loginBtn.click();

        //logical OR

        WebElement userInput = driver.findElement(By.xpath("//ul//input[@id='log' or @name='log']"));

        jse.executeScript("arguments[0].setAttribute('style', 'background:yellow ;border:10px solid green')",
                userInput);

        userInput.sendKeys(USER);

        WebElement passInput = driver.findElement(By.xpath("//ul//input[@type='password' and @name='pwd']"));
        jse.executeScript("arguments[0].setAttribute('style', 'background:yellow ;border:10px solid green')",
                passInput);

        passInput.sendKeys(PASS);

        // direct child

        WebElement submitBtn = driver.findElement(By.xpath("//ul//div[@class='popup_form_field submit_field']/input"));

        submitBtn.click();

        Thread.sleep(5000);

    }

    @Test(priority = 2)
    public void xpathExample2() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        driver.findElement(By.xpath("//span[@class='user_name']"));


        //<a href="https://keybooks.ro/wp-admin/profile.php" class="icon icon-cog">Settings</a>
        /*
         //a[text()='Settings']
         */
        // text()--> referinta catra textul dintre tag-urile HTML

        driver.findElement(By.xpath("/a[text()='Settings']")).click();
    }

   //<a href="https://keybooks.ro/account/orders/">recent orders</a>
   /*
   //a[text()='recent orders']

   //a[contains(text(), 'recent')]

   //a[contains(@href, 'orders')]
    */


}
