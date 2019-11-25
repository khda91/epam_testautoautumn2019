package lesson4.singleton;

import lesson4.patters.singleton.Singleton;
import org.testng.annotations.Test;

public class SingletonTestB extends BaseTest {

    @Test
    public void testName3() {
        System.out.println("testName3");
        System.out.println(Singleton.getInstance().getValue());
    }

    @Test
    public void testName4() {
        System.out.println("testName4");
        System.out.println(Singleton.getInstance().getValue());
    }
}
