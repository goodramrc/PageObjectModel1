package selenium.utils;

import pageObjects.ContactsPage;
import pageObjects.LoginPage;
import pageObjects.MenuPage;

public class BasePage extends SeleniumWrappers{

    public MenuPage menu = new MenuPage(driver);
    public LoginPage login = new LoginPage(driver);
    public ContactsPage contacts = new ContactsPage(driver);


}
