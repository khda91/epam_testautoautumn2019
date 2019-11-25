package lesson3;

import lesson3.inheretence.ContactFormPage;
import lesson3.inheretence.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginSeleniumTest extends AbstractBaseTest {

    @Test
    public void loginTest() {
        HomePage homePage = new HomePage(driver);

        homePage.open();
        homePage.login("epam", "1234");

        assertEquals(homePage.getUsernameLabelText(), "PITER CHAILOVSKII");
    }

    @Test
    public void contactFormTest() {
        HomePage homePage = new HomePage(driver);
        homePage.open();
        homePage.login("epam", "1234");
        homePage.headerMenuItemClick("Contact form");

        ContactFormWOPFPage contactFormPage = PageFactory
                .initElements(driver, ContactFormWOPFPage.class);
        contactFormPage.selectPassportCheckBox();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertTrue(contactFormPage.isPassportCheckBoxSelected());
    }

    @Test
    public void contactFormTest1() {
        HomePage homePage = new HomePage(driver);
        homePage.open();
        homePage.login("epam", "1234");
        homePage.headerMenuItemClick("Contact form");

        ContactFormPage contactFormPage = new ContactFormPage(driver);
        contactFormPage.fillNameTextField("some name");
        contactFormPage.selectPassportCheckBox();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals(contactFormPage.getNameTextFieldValue(), "some name");
        assertTrue(contactFormPage.isPassportCheckBoxSelected());
    }

    @Test
    public void ttt() {
        HomePage homePage = new HomePage(driver);
        homePage.open();
        homePage.login("epam", "1234");
        homePage.headerMenuItemClick("Service");

//        driver.findElement(By.xpath("//li[contains(@class, 'menu-title')]"))

        driver.findElement(By.xpath("//div[@name='navigation-sidebar']//li[8]//a[1]")).click();

        driver.findElement(By.xpath("//div[@class='main-content']//div[2]//label[1]")).click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("//label[conatins(text(),'Water')] -> " + driver.findElement(By.xpath("//div[@class='main-content']//div[2]//label[1]")).isSelected());
        System.out.println("//label[text()='Water']/input -> " + driver.findElement(By.xpath("//div[@class='main-content']//div[2]//label[1]/input")).isSelected());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
