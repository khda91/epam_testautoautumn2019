package lesson5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactFormPage extends AbstractBasePage {

    //    @FindBy(id = "name")
    @FindBy(xpath = "//div[@class='col-sm-4']//input[@id='name']")
    private WebElement nameTextField;

    @FindBy(xpath = "//div[@class='col-sm-4']//input[@id='last-name']")
    private WebElement lastNameTextField;

    @FindBy(xpath = "//div[@class='col-sm-4']//input[@id='position']")
    private WebElement positionTextField;

    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    private WebElement submitButton;

    @FindBy(name = "passport")
    private WebElement passportCheckBox;

    public ContactFormPage(WebDriver driver) {
        super(driver);
    }

    public void fillNameTextField(String name) {
        nameTextField.sendKeys(name);
    }

    public void fillLastNameTextField(String lastName) {
        lastNameTextField.sendKeys(lastName);
    }

    public void fillPositionTextField(String position) {
        positionTextField.sendKeys(position);
    }

    public String getNameTextFieldValue() {
        return nameTextField.getAttribute("value");
    }

    public String getLastNameTextFieldValue() {
        return lastNameTextField.getAttribute("value");
    }

    public String getPositionTextFieldValue() {
        return positionTextField.getAttribute("value");
    }

    public void selectPassportCheckBox() {
        passportCheckBox.click();
    }

    public boolean isPassportCheckBoxSelected() {
        return passportCheckBox.isSelected();
    }

    public void clickSubmitButton() {
        submitButton.click();
    }
}
