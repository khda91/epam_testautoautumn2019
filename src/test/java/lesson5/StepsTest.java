package lesson5;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.testng.AllureTestNg;
import lesson3.AbstractBaseTest;
import lesson5.steps.Steps;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({AllureTestNg.class, AttachmentListener.class})
public class StepsTest extends AbstractBaseTest {

    private Steps steps;

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        steps = new Steps(driver);
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void loginTest() {
        steps.openEpamJdiSite();
        steps.login("epam", "1234");
        steps.usernameOnTheHomePageShouldBe("PITER CHAILOVSKII");
    }

    @Test(testName = "Failed Login Test")
    @Severity(SeverityLevel.CRITICAL)
    public void failedLoginTest() {
        steps.openEpamJdiSite();
        steps.login("epam", "1234");
        steps.usernameOnTheHomePageShouldBe("PITER CHAILOVSKII");
    }
}
