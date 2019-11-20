package lesson3.inheretence;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactFormPage extends AbstractBasePage {

//    @FindBy(id = "name")
    @FindBy(xpath = "//div[@class='col-sm-4']//input[@id='name']")
    private WebElement nameTextField;

    @FindBy(name = "passport")
    private WebElement passportCheckBox;

    public ContactFormPage(WebDriver driver) {
        super(driver);
    }

    public void fillNameTextField(String name) {
        nameTextField.sendKeys(name);
    }

    public String getNameTextFieldValue() {
        return nameTextField.getAttribute("value");
    }

    public void selectPassportCheckBox() {
        passportCheckBox.click();
    }

    public boolean isPassportCheckBoxSelected() {
        return passportCheckBox.isSelected();
    }
}
