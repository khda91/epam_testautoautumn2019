package lesson3;

import lesson3.inheretence.HomePage;
import lesson3.steps.Steps;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class StepsTest extends AbstractBaseTest {

    private Steps steps;

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        steps = new Steps(driver);
    }

    @Test
    public void loginTest() {
        steps.openEpamJdiSite();
        steps.login("epam", "1234");
        steps.usernameOnTheHomePageShouldBe("PITER CHAILOVSKII");
    }
}
