package lesson3.inheretence;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactFormPage extends AbstractBasePage {

    @FindBy(id = "name")
    private WebElement nameTextField;

    @FindBy(name = "passport")
    private WebElement passportCheckBox;

    public ContactFormPage(WebDriver driver) {
        super(driver);
    }

    public void fillNameTextField(String name) {
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].setAttribute('value', '" + name + "')",
                        nameTextField);
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
