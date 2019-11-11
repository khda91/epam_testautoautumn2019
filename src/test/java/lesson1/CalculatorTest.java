package lesson1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;

public class CalculatorTest extends AbstractBaseTest {

    @Test
    public void sumTest() {
        System.out.println("Sum test");
        int expected = 4;
        int actual = calculator.sum(2, 2);
        assertEquals(actual, expected);
    }

    @Test
    public void multiplyTest() {
        System.out.println("Multiply test");
        int expected = 6;
        int actual = calculator.multiply(2, 3);
        assertEquals(actual, expected);
    }

    @Test
    public void multipleOperationsTest() {
        System.out.println("Operations test");
        SoftAssert sa = new SoftAssert();
        int actual1 = calculator.sum(3, 3);
        sa.assertEquals(actual1, 5);
        int actual2 = calculator.multiply(actual1, 4);
        sa.assertEquals(actual2, 20);
        int actual3 = calculator.sum(actual2, 10);
        sa.assertEquals(actual3, 30);
        sa.assertAll();
    }

}
