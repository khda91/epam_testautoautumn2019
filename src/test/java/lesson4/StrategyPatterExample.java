package lesson4;

import lesson4.patters.startegy.User;
import lesson4.patters.startegy.CreateUserStrategy;
import lesson4.patters.startegy.RestCreateUserStrategy;
import lesson4.patters.startegy.WebCreateUserStrategy;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class StrategyPatterExample {

    private CreateUserStrategy createUserStrategy;

    @BeforeGroups(groups = {"ui"})
    public void setUpGroupUi() {
        createUserStrategy = new WebCreateUserStrategy();
    }

    @BeforeGroups(groups = {"rest"})
    public void setUpGroupRest() {
        createUserStrategy = new RestCreateUserStrategy();
    }

    @Test(groups = {"ui", "rest"})
    public void testStrategy() {
        User user = createUserStrategy.createUser("name1", "pass");
        assertEquals(user, new User("name1", "pass"));
    }
}
