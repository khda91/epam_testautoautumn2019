package lesson3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// Without Page Factory inside ContactFormPage page object
public class ContactFormWOPFPage {

    private WebElement passport;

    public void selectPassportCheckBox() {
        passport.click();
    }

    public boolean isPassportCheckBoxSelected() {
        return passport.isSelected();
    }
}
