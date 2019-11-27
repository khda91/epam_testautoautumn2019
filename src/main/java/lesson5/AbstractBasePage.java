package lesson5;

import lesson5.enums.HeaderMenuItem;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractBasePage {

    protected WebDriver driver;

    protected AbstractBasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void headerMenuItemClick(final String menuItemName) {
        driver.findElement(By.linkText(menuItemName)).click();
    }

    public void headerMenuItemClick(HeaderMenuItem headerMenuItem) {
        driver.findElement(By.linkText(headerMenuItem.getLinkName())).click();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
}
