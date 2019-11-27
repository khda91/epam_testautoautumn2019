package lesson6.cucumber1.steps;

import cucumber.api.java.en.When;
import java.util.List;
import java.util.Map;
import lesson5.ContactFormPage;
import lesson5.data.ContactFormData;
import lesson5.enums.HeaderMenuItem;
import lesson6.cucumber1.TestStorage;
import lesson6.cucumber1.WebDriverSingleton;

public class ActionStep extends AbstractBaseStep {

    @When("^I login as user '([^\"]+)' with password '([^\"]+)' on the Home page$")
    public void iLoginAsUserWithPasswordOnTheHomePage(String username, String password) {
        homePage.login(username, password);
    }

    @When("^I click '(HOME|CONTACT_FORM|SERVICE)' link in the Left menu on the Home page$")
    public void iClickLinkInTheLeftMenuOnTheHomePage(HeaderMenuItem headerMenuItem) {
        homePage.headerMenuItemClick(headerMenuItem);
    }

    @When("^I click '([^\"]+)' link on the Home page$")
    public void iClickLinkOnTheHomePage(HeaderMenuItem headerMenuItem) {
        homePage.headerMenuItemClick(headerMenuItem);
    }

    @When("^I set values to the Contact Form Page$")
    public void iSetValuesToTheContactFormPage(List<Map<String, String>> values) {
        contactFormPage = new ContactFormPage(WebDriverSingleton.INSTANCE.getDriver());
        Map<String, String> inputValues = values.get(0);
        contactFormPage.fillNameTextField(inputValues.get("name"));
        contactFormPage.fillLastNameTextField(inputValues.get("last_name"));
        contactFormPage.fillPositionTextField(inputValues.get("position"));
        TestStorage.INSTANCE.setData("contact_form_data", inputValues);
    }

    @When("^I set data to the Contact Form Page$")
    public void iSetDataToTheContactFormPage(List<ContactFormData> values) {
        contactFormPage = new ContactFormPage(WebDriverSingleton.INSTANCE.getDriver());
        ContactFormData inputValues = values.get(0);
        contactFormPage.fillNameTextField(inputValues.getName());
        contactFormPage.fillLastNameTextField(inputValues.getLast_name());
        contactFormPage.fillPositionTextField(inputValues.getPosition());
        TestStorage.INSTANCE.setData("contact_form_data", inputValues);
    }

    @When("I click 'Submit' button on the Contact Form page")
    public void iClickSubmitButton() {
        contactFormPage.clickSubmitButton();
    }
}
