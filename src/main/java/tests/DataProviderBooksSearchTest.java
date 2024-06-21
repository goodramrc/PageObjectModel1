package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.MenuPage;
import selenium.utils.BaseTest;

import static org.testng.AssertJUnit.assertTrue;

public class DataProviderBooksSearchTest extends BaseTest {

    @Test(dataProviderClass = DataProvider.class, dataProvider = "booksNameAndPictureProvider")
    public void searchBookAndAssertPicture(String bookName, String bookPicture) throws InterruptedException {

        MenuPage menu = new MenuPage(driver);
        menu.search(bookName);

        Thread.sleep(3000);

        WebElement element = driver.findElement(By.cssSelector("div[data-image*='"+bookPicture+"']"));

        assertTrue(element.isDisplayed());

    }
}
