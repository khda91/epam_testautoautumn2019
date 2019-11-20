package lesson4.patters.startegy;

public class RestCreateUserStrategy implements CreateUserStrategy {

    @Override
    public User createUser(final String username, final String password) {
        sendRequest("http://create.service",
                String.format("{username: '%s', password: '%s', confirmPassword: '%s'}",
                        username, password, password));
        return new User(username, password);
    }

    private void sendRequest(String url, String body) {
        System.out.println("Send request to " + url + " with body " + body);
    }
}
