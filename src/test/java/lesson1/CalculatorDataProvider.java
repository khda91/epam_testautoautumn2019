package lesson1;

import org.testng.annotations.DataProvider;

public class CalculatorDataProvider {

    @DataProvider(name = "Multiply Data Provider")
    public Object[][] multiplyTestDataProvider() {
        return new Object[][]{
                {2, 2, 4},
                {3, 5, 15},
                {7, 10, 70}
        };
    }
}
