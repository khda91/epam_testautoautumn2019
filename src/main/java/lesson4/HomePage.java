package lesson4;

import com.codeborne.selenide.SelenideElement;
import lesson3.inheretence.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;
import static org.openqa.selenium.support.How.CSS;
import static org.openqa.selenium.support.How.ID;

public class HomePage {

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
    private SelenideElement usernameLabel;

    public HomePage() {
        page(this);
    }

    public void login(final String username, final String password) {
        userIcon.click();
        usernameTextField.sendKeys(username);
        passwordTextField.sendKeys(password);
        loginButton.click();
    }

    public SelenideElement getUsernameLabelText() {
        return usernameLabel;
    }

}
