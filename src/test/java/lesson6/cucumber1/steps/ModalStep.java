package lesson6.cucumber1.steps;

import cucumber.api.java.en.Given;
import lesson5.HomePage;
import lesson6.cucumber1.WebDriverSingleton;
import lesson6.cucumber1.hooks.CucumberHooks;

public class ModalStep extends AbstractBaseStep {

    @Given("^I open EPAM JDI Site$")
    public void iOpenEpamJdiSite() {
        homePage = new HomePage(WebDriverSingleton.INSTANCE.getDriver());
        homePage.open();
    }
}
