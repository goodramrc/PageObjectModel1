package selenium.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    public static WebDriver driver;
    public BasePage app;

	/*@BeforeClass
	public void deleteCookies() {
		driver.manage().deleteAllCookies();
	}*/


    @BeforeClass(alwaysRun = true)
    public void setup() {
        //FirefoxDriver()
        //EdgeDriver()
        //System.set.property("webdriver.chrome.driver", "path to chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://keybooks.ro/");

        app = new BasePage();

    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);//bad practice
        //driver.close();//inchide tab-ul curent
        driver.quit();//inchide fereastra de browser

    }

}
