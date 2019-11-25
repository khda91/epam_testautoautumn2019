package lesson5.steps;

import io.qameta.allure.Step;
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

    @Step("I open EPAM JDI Site")
    public void openEpamJdiSite() {
        homePage.open();
    }

    @Step("I login as '{0}' with password '{1}'")
    public void login(final String username, final String password) {
        homePage.userIconClick();
        homePage.steTextUsernameTextField(username);
        homePage.steTextPasswordTextField(password);
        homePage.clickLoginButton();
    }

    @Step("Username should be '{0}' on the Home Page")
    public void usernameOnTheHomePageShouldBe(final String username) {
        assertEquals(homePage.getUsernameLabelText(), username);
    }

}
