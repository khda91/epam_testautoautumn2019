package lesson4.singleton;

import lesson4.patters.singleton.Singleton;
import org.testng.annotations.Test;

public class SingletonTestA extends BaseTest {

    @Test
    public void testName1() {
        System.out.println("testName1");
        System.out.println(Singleton.getInstance().getValue());
    }

    @Test
    public void testName2() {
        System.out.println("testName2");
        System.out.println(Singleton.getInstance().getValue());
        Singleton.getInstance().setValue("value2");
        System.out.println("==========");
        System.out.println(Singleton.getInstance().getValue());
    }
}
