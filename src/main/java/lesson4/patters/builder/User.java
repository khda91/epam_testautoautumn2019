package lesson4.patters.builder;

public class User {

    private String username;
    private String fistName;
    private String lastName;
    private int age;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;

    private User(String username, String fistName, String lastName, int age, int dayOfBirth, int monthOfBirth, int yearOfBirth) {
        this.username = username;
        this.fistName = fistName;
        this.lastName = lastName;
        this.age = age;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
    }

    public String getUsername() {
        return username;
    }

    public String getFistName() {
        return fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public static UserBuilder userBuilder() {
        return new UserBuilder();
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", fistName='" + fistName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", dayOfBirth=" + dayOfBirth +
                ", monthOfBirth=" + monthOfBirth +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }

    public static class UserBuilder {
        private String username;
        private String fistName;
        private String lastName;
        private int age;
        private int dayOfBirth;
        private int monthOfBirth;
        private int yearOfBirth;

        private UserBuilder() {
        }

        public UserBuilder setUsername(String username) {
            this.username = username;
            return this;
        }

        public UserBuilder setFistName(String fistName) {
            this.fistName = fistName;
            return this;
        }

        public UserBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder setDayOfBirth(int dayOfBirth) {
            this.dayOfBirth = dayOfBirth;
            return this;
        }

        public UserBuilder setMonthOfBirth(int monthOfBirth) {
            this.monthOfBirth = monthOfBirth;
            return this;
        }

        public UserBuilder setYearOfBirth(int yearOfBirth) {
            this.yearOfBirth = yearOfBirth;
            return this;
        }

        public User build() {
            return new User(this.username, this.fistName, this.lastName,
                    this.age, this.dayOfBirth, this.monthOfBirth, this.yearOfBirth);
        }
    }
}
