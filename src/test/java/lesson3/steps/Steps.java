package lesson3.steps;

import lesson3.composite.ContactFormPage;
import lesson3.composite.HomePage;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;

public class Steps {

    private HomePage homePage;

    private ContactFormPage contactFormPage;

    public Steps(WebDriver driver) {
        this.homePage = new HomePage(driver);
        this.contactFormPage = new ContactFormPage(driver);
    }

    public void openEpamJdiSite() {
        homePage.open();
    }

    public void login(final String username, final String password) {
        homePage.userIconClick();
        homePage.steTextUsernameTextField(username);
        homePage.steTextPasswordTextField(password);
        homePage.clickLoginButton();
    }

    public void usernameOnTheHomePageShouldBe(final String username) {
        assertEquals(homePage.getUsernameLabelText(), username);
    }

}
