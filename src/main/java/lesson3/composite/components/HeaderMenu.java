package lesson3.composite.components;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderMenu {

    private WebDriver driver;

    @FindBy(xpath = "//nav[@role='navigation']//ul//li")
    private List<WebElement> navigationHeader;

    public HeaderMenu(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void headerMenuItemClick(final String menuItemName) {
        for (WebElement menuHeaderItem : navigationHeader) {
            if (menuItemName.equals(menuHeaderItem.getText())) {
                menuHeaderItem.click();
                break;
            }
        }
    }
}
