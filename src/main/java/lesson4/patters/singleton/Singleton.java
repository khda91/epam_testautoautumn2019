package lesson4.patters.singleton;

public class Singleton {

    private static Singleton instance;

    private String value;

    private Singleton() {
    }

    public static Singleton getInstance() {
        System.out.println("check");
        if (instance == null) {
            System.out.println("Create new instance");
            instance = new Singleton();
        }
        return instance;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        System.out.println("sds");
        this.value = value;
    }
}
