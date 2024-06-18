package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class JavascriptExecutorExample extends BaseTest{

//    @Test
    public void example1() {

        JavascriptExecutor jse = (JavascriptExecutor) driver;

	/*	jse.executeScript("", obj1, obj2, obj3); //Object...args  {obj1, obj2, obj3}
												//	index   		0		1	2

		jse.executeScript("arguments[1]", obj1, obj2, obj3);*/
	/*
		//alternativa pentru click()
		jse.executeScript("arguments[0].click()", app.getWebElement(app.menu.searchIcon));
		//alternativa pentru sendKeys()
		jse.executeScript("arguments[0].value='Storm'", app.getWebElement(app.menu.searchInput));
		//alternativa pentru click()
		jse.executeScript("arguments[0].click()", app.getWebElement(app.menu.searchIcon));
	*/

	/*	jse.executeScript("arguments[0].click();"
				+ "arguments[1].value='Storm';"
				+ "arguments[0].click();",
				app.getWebElement(app.menu.searchIcon),
				app.getWebElement(app.menu.searchInput));

	*/
        jse.executeScript("document.getElementsByClassName('icon-search')[0].click();"
                + "document.getElementsByClassName('search_field')[0].value='cooking';"
                + "document.getElementsByClassName('icon-search')[0].click();");


        //alternativa pentru isDisplayed()
       String visible = jse.executeScript("return document.getElementsByClassName('post_title')[0].childNodes[0].checkVisibility()")
               .toString();

        System.out.println(visible);

        assertEquals(visible, "true");

        boolean isVisble = Boolean.parseBoolean(visible);
        assertTrue(isVisble);

        //alternativa pentru getText()

        String bookTitle = jse.executeScript( "return document.getElementsByClassName('post_title')[0].childNodes[0].innerText")
                .toString();

        System.out.println(bookTitle);

        jse.executeScript( "document.getElementsByClassName('post_title')[0].childNodes[0].click()");

        //alternativa pentru getCurrentURL()
        //driver.getCurrentUrl();
        String currentUrl = jse.executeScript("return document.URL").toString();
        System.out.println(currentUrl);
        //alternativa pentri getTitle();
        String currentPageTitle = jse.executeScript("return document.Title").toString();
        System.out.println(currentPageTitle);


        jse.executeScript("windows.scrollBy(0, 800)");
        jse.executeScript("document.getElementById('tab-title-reviews').children[0].click()");
        //alternativa pentru isSelected();
        String isSelected = jse.executeScript("return document.getElementById('wp-comment-cookies-consent').checked")
                .toString();

        System.out.println(isSelected);

        //alternativa la isEnabled();
        String isEnabled = jse.executeScript("return document.getElementById('author').disabled")
                .toString();

        System.out.println(isEnabled);




    }

    public void example2() {

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        String alertaJs = "window.obj = function() {alert('Alerta!!!')}; windows.obj.call();";

        jse.executeScript(alertaJs);

    }



}
