package lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public abstract class AbstractBaseTest {

    protected WebDriver driver;

    @BeforeSuite
    public void suiteSetUp() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().pageLoadTimeout(20000, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().setScriptTimeout(30000, TimeUnit.MILLISECONDS);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
