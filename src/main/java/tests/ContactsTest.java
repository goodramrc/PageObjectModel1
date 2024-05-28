package tests;

import org.testng.annotations.Test;
import selenium.utils.BaseTest;

public class ContactsTest extends BaseTest {

    @Test
    public void sendMessageFromContactFormTest() {

        app.click(app.menu.contactsLink);
        app.sendKeys(app.contacts.nameField, "Harry Potter");
        app.sendKeys(app.contacts.emailField, "harry@hogwarts.com");
        app.sendKeys(app.contacts.subjectField, "Admission");
        app.sendKeys(app.contacts.messageField, "CanI join?");
        app.click(app.contacts.submitBtn);

    }
}
