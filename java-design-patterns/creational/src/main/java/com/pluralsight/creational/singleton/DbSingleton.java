package com.pluralsight.creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {

    private Connection conn = null;

    // Lazy loading and thread safety
    // not creating the instance until the object is called
    private static class LazyHolder {
        static final DbSingleton INSTANCE = new DbSingleton();
    }

    // Constructor has to be private
    private DbSingleton() {
        try{
            String jdbcURL = "jdbc:h2:mem:test";
            conn = DriverManager.getConnection(jdbcURL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static DbSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    public Connection getConnection() {
        return conn;
    }

}
