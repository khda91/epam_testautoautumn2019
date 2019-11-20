package lesson4.singleton;

import lesson4.patters.singleton.Singleton;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

    @BeforeMethod
    public void setUp() {
        Singleton.getInstance().setValue("value1");
    }
}
