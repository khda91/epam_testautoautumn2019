package lesson4;

import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideExample {

    @BeforeMethod
    public void setUp() {
        Configuration.browser = Browsers.CHROME;
        Configuration.timeout = 4000;
//        Configuration.headless = true;
    }

    @Test
    public void selenideLoginTest() {
        open("https://epam.github.io/JDI/index.html");

        $("#user-icon").click();
        $(By.id("name")).sendKeys("epam");
        $(By.xpath("//input[@id='password']")).sendKeys("1234");
        $("#login-button").click();

        $("#user-name").shouldHave(text("Piter Chailovskii"));
    }

    @Test
    public void selenideLoginFailTest() {
        open("https://epam.github.io/JDI/index.html");

        $("#user-icon").click();
        $(By.id("name")).sendKeys("epam");
        $(By.xpath("//input[@id='password']")).sendKeys("1234");
        $("#login-button").click();

        $("#user-name").shouldHave(text("Piter Chailovskii1"));
    }
}
