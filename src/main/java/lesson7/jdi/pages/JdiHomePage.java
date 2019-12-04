package lesson7.jdi.pages;

import com.epam.jdi.light.elements.complex.WebList;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.common.Text;
import lesson7.jdi.entities.JdiUser;
import lesson7.jdi.forms.LoginForm;

//@SuppressWarnings("")
public class JdiHomePage extends WebPage {

    public LoginForm loginForm;

    @FindBy(css = ".benefit")
    WebList benefits;

    @Css("#user-name")
    private Text userName;

    @Css("#user-icon")
    private Button userIcon;

    public int getBenefitsCount() {
        return benefits.size();
    }

    public String getUserName() {
        return userName.getText();
    }

    public void login(JdiUser jdiUser) {
        userIcon.click();
        loginForm.login(jdiUser);
    }
}
