package lesson4;

import lesson4.patters.builder.User;
import org.testng.annotations.Test;

public class UserBuilderTest {


    @Test
    public void testBuilder1() {
        User user = User.userBuilder()
                .setFistName("name")
                .setDayOfBirth(12)
                .setMonthOfBirth(11)
                .build();
        System.out.println(user);
    }

    @Test
    public void testBuilder2() {
        User user = User.userBuilder()
                .setFistName("name1")
                .setDayOfBirth(13)
                .setMonthOfBirth(10)
                .setLastName("name last")
                .build();
        System.out.println(user);
    }
}
