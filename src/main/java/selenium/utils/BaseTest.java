package selenium.utils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {

    public WebDriver driver;

    @BeforeClass
    public void setup() {
       // sau ChromeDriver()
       //System.set.property("webdriver.chrome.driver", "path to chromedriver.exe");
       driver = new EdgeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.get("https://keybooks.ro/");
    }

    @AfterClass
    public void tearDown() throws InterruptedException {

        Thread.sleep(5000);//bad practice

      //  driver.close(); //inchide tabul curent
        driver.quit(); //inchide fereastra de browser
    }

}
