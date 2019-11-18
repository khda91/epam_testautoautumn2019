package lesson3.composite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.How.CSS;
import static org.openqa.selenium.support.How.ID;

public class HomePage extends AbstractBasePage {

    private static final String URL = "https://epam.github.io/JDI/index.html";

    @FindBy(id = "user-icon")
    private WebElement userIcon;

    @FindBy(how = CSS, using = "#name")
    private WebElement usernameTextField;

    @FindBy(id = "password")
    private WebElement passwordTextField;

    @FindBy(how = ID, using = "login-button")
    private WebElement loginButton;

    @FindBy(id = "user-name")
    private WebElement usernameLabel;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(URL);
    }

    public void userIconClick() {
        userIcon.click();
    }

    public void steTextUsernameTextField(String username) {
        usernameTextField.sendKeys(username);
    }

    public void steTextPasswordTextField(String password) {
        passwordTextField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public String getUsernameLabelText() {
        return usernameLabel.getText();
    }

}
