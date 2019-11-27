package lesson6.cucumber1;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "classpath:lesson5/cucumber1"
)
public class RunTests extends AbstractTestNGCucumberTests {
}
