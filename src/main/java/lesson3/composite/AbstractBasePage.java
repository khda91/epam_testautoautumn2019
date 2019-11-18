package lesson3.composite;

import lesson3.composite.components.HeaderMenu;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractBasePage {

    protected WebDriver driver;

    private HeaderMenu headerMenu;

    protected AbstractBasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        headerMenu = new HeaderMenu(driver);
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public HeaderMenu getHeaderMenu() {
        return headerMenu;
    }
}
