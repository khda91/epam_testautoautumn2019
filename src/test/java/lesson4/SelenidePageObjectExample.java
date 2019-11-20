package lesson4;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.checked;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class SelenidePageObjectExample {

    @Test
    public void contactFormTest1() {
        open("https://epam.github.io/JDI/index.html");

        HomePage homePage = new HomePage();
        homePage.login("epam", "1234");
        $(By.linkText("Contact form")).click();

        ContactFormPage contactFormPage = page(ContactFormPage.class);
        contactFormPage.fillNameTextField("some name");
        contactFormPage.selectPassportCheckBox();

        contactFormPage.getNameTextField().shouldHave(value("some name"));
        contactFormPage.getPassportCheckBox().shouldBe(checked);
    }
}
