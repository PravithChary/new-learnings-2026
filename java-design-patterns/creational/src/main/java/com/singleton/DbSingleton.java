package main.java.com.singleton;

public class DbSingleton {
    // This has to be private instance
    private static DbSingleton instance = new DbSingleton();

    // Constructor has to be private
    private DbSingleton() {

    }

    public static DbSingleton getInstance() {
        return instance;
    }

}
