package tests;

import org.testng.annotations.*;
import selenium.utils.BaseTest;

import static org.testng.Assert.assertEquals;

public class DropDownTest extends BaseTest {

    @Test(priority=1)
    public void selectByValueTest() {

        app.click(app.menu.shopLink);
        app.shop.selectByValue("date");
        assertEquals(app.shop.getSelectedOption(), "Sort by latest");
    }

    @Test(priority=2)
    public void selectByVisibleTextTest() {

        app.click(app.menu.shopLink);
        app.shop.selectByVisbileText("Sort by popularity");
        assertEquals(app.shop.getSelectedOption(), "Sort by popularity");
    }

    @Test(priority=3)
    public void selectByIndex() {

        app.click(app.menu.shopLink);
        app.shop.selectByIndex(5);
        assertEquals(app.shop.getSelectedOption(), "Sort by price: high to low");
    }
}
