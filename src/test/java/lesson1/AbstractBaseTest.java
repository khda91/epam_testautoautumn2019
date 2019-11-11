package lesson1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class AbstractBaseTest {

    protected Calculator calculator;

    @BeforeSuite
    public void suiteSetUp() {
        System.out.println("Before Suite");
    }

    @BeforeTest
    public void testSetUp() {
        System.out.println("Before Test Annotation");
    }

    @BeforeMethod
    public void setUp() {
        System.out.println("Before Method");
        this.calculator = new Calculator();
    }

    @AfterMethod
    public void tearDown() {
        calculator = null;
        System.out.println("After Method");
    }
}
