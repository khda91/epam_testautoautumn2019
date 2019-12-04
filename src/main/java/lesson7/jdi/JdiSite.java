package lesson7.jdi;

import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import lesson7.jdi.entities.JdiUser;
import lesson7.jdi.pages.JdiHomePage;

@JSite("https://jdi-testing.github.io/jdi-light/")
public class JdiSite {

    @Url("index.html")
    public static JdiHomePage jdiHomePage;

    public static void open() {
        jdiHomePage.open();
    }

    public static void login(JdiUser jdiUser) {
        jdiHomePage.login(jdiUser);
    }
}
