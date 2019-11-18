package lesson3.inheretence;

import org.openqa.selenium.By;
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

    public void login(final String username, final String password) {
        userIcon.click();
        usernameTextField.sendKeys(username);
        passwordTextField.sendKeys(password);
        loginButton.click();
    }

    public String getUsernameLabelText() {
        return usernameLabel.getText();
    }

}
