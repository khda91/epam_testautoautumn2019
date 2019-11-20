package lesson4;

import com.codeborne.selenide.SelenideElement;
import lesson3.inheretence.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactFormPage {

    @FindBy(xpath = "//div[@class='col-sm-4']//input[@id='name']")
    private SelenideElement nameTextField;

    @FindBy(name = "passport")
    private SelenideElement passportCheckBox;

    public void fillNameTextField(String name) {
        nameTextField.sendKeys(name);
    }

    public SelenideElement getNameTextField() {
        return nameTextField;
    }

    public void selectPassportCheckBox() {
        passportCheckBox.click();
    }

    public SelenideElement getPassportCheckBox() {
        return passportCheckBox;
    }
}
