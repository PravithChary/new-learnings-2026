package main.java.com.singleton;

public class DbSingleton {
    // Lazy loading and thread safety
    // not creating the instance until the object is called
    private static class LazyHolder {
        static final DbSingleton INSTANCE = new DbSingleton();
    }

    // Constructor has to be private
    private DbSingleton() {

    }

    public static DbSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }

}
