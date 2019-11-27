package lesson6.cucumber1.steps;

import cucumber.api.java.en.Then;
import java.util.Map;
import lesson5.data.ContactFormData;
import lesson6.cucumber1.TestStorage;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;

public class AssertionStep extends AbstractBaseStep {

    @Then("^username should be '([^\"]+)' on the Home page$")
    public void usernameShouldBeOnTheHomePage(String expectedUsername) {
        assertEquals(homePage.getUsernameLabelText(), expectedUsername);
    }

    @Then("Contact Form page should have entered values")
    public void contactFormPageShouldHaveEnteredValues() {
        Map<String, String> expectedData = TestStorage.INSTANCE.getData("contact_form_data");
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(contactFormPage.getNameTextFieldValue(), expectedData.get("name"));
        sa.assertEquals(contactFormPage.getLastNameTextFieldValue(), expectedData.get("last_name"));
        sa.assertEquals(contactFormPage.getPositionTextFieldValue(), expectedData.get("position"));
        sa.assertAll();
    }

    @Then("Contact Form page should have entered data")
    public void contactFormPageShouldHaveEnteredData() {
        ContactFormData expectedData = TestStorage.INSTANCE.getData("contact_form_data");
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(contactFormPage.getNameTextFieldValue(), expectedData.getName());
        sa.assertEquals(contactFormPage.getLastNameTextFieldValue(), expectedData.getLast_name());
        sa.assertEquals(contactFormPage.getPositionTextFieldValue(), expectedData.getPosition());
        sa.assertAll();
    }
}
