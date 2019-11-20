package lesson4.patters.startegy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebCreateUserStrategy implements CreateUserStrategy {

    @FindBy(css = "#username")
    private WebElement username;

    @FindBy(css = "#password")
    private WebElement password;

    @FindBy(css = "#confirmPassword")
    private WebElement confirmPassword;

    @FindBy(css = "#createButton")
    private WebElement createButton;

    @Override
    public User createUser(final String username, final String password) {
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        this.confirmPassword.sendKeys(password);
        this.createButton.click();
        return new User(username, password);
    }
}
