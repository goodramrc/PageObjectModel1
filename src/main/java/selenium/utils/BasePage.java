package selenium.utils;

import pageObjects.*;

public class BasePage extends SeleniumWrappers{

    public MenuPage menu = new MenuPage(driver);
    public LoginPage login = new LoginPage(driver);
    public ContactsPage contacts = new ContactsPage(driver);
    public ShopPage shop = new ShopPage(driver);
    public HomePage home =  new HomePage(driver);
    public GenericEventsPage genericEvent = new  GenericEventsPage(driver);



}
