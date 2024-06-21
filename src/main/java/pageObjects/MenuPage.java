package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import selenium.utils.SeleniumWrappers;

public class MenuPage extends SeleniumWrappers{

    public WebDriver driver;

    public MenuPage(WebDriver driver) {
        this.driver =  driver;
    }

    //locatori/webelements
    /*
     * driver.findElement(By.linkText("Login"))
     */
    public By loginLink = By.linkText("Login");
    public By contactsLink = By.linkText("CONTACTS");
    public By shopLink = By.linkText("BOOKS");
    public By blogLink = By.linkText("BLOG");
    public By aboutLink = By.linkText("ABOUT");
    public By blogSubMenuClassic = By.linkText("Classic");
    public By searchIcon = By.cssSelector("button[class*='icon-search']");
    public By searchInput = By.cssSelector("input[class='search_field']");

    public void search(String value) {

        click(searchIcon);
        sendKeys(searchInput, value);
        click(searchIcon);
    }

    //WebElement loginButton = driver.findElement(By.linkText("Login"));
    //WebElement contactsButton = driver.findElement(By.linkText("CONTACTS"));

    //metode specifice functionalitatii pe care o au
	/*public WebElement loginButton() {
		return driver.findElement(By.linkText("Login"));
	}*/

    //loginButton().click()

/*	public void navigateTo(By locator) {
		driver.findElement(locator).click();
	} */

    //navigateTo(contactsLink)
    //navigateTo(loginLink)

/*	public void navigateToLogin() {
		loginButton.click();
	}
	public void navigateToContacs() {
		loginButton.click();
	}*/
}
