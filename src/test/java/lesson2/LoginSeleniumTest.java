package lesson2;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginSeleniumTest {

    @Test
    public void loginTest() {
//        System.setProperty("webdriver.chrome.driver", this.getClass().getClassLoader()
//                .getResource("driver/chromedriver").getPath());
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().pageLoadTimeout(20000, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().setScriptTimeout(30000, TimeUnit.MILLISECONDS);

        driver.get("https://epam.github.io/JDI/index.html");
        driver.findElement(By.id("user-icon")).click();
        driver.findElement(By.cssSelector("#name")).sendKeys("epam");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1234");
        driver.findElement(By.id("login-button")).click();

        WebElement loginedUserName = null;
        try {
            loginedUserName = new WebDriverWait(driver, 15)
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("user-name")));
        } catch (Exception e) {
            TakesScreenshot sc = (TakesScreenshot)driver;
            File screensFile = sc.getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(screensFile, new File("./my.png"));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println(loginedUserName.getText());
        assertEquals(loginedUserName.getText().trim(), "PITER CHAILOVSKII");
        driver.close();
    }
}
