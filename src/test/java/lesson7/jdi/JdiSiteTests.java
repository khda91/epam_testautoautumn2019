package lesson7.jdi;

import com.epam.jdi.light.driver.WebDriverUtils;
import com.epam.jdi.light.elements.init.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static java.lang.String.*;

public class JdiSiteTests {

    public static final int EXPECTED_BENEFITS = 4;

    @BeforeSuite(alwaysRun = true)
    public void beforeSuite() {
        PageFactory.initSite(JdiSite.class);
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite() {
        WebDriverUtils.killAllSeleniumDrivers();
    }

    @Test
    public void jdiHomePageBenefitsTest() {
        /*
        1. Open Home page
        2. Check benefits count
         */
        JdiSite.open();
        int actualCount = JdiSite.jdiHomePage.getBenefitsCount();
        Assert.assertEquals(actualCount, EXPECTED_BENEFITS,
                format("Expected benefits: %s, but actual: %s", actualCount, EXPECTED_BENEFITS));
    }

}
