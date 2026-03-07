package com.pluralsight.structural.facade.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {
    private static volatile DbSingleton instance;
    private Connection conn;

    private DbSingleton() {

    }

    public static DbSingleton getInstance() {
        if(instance == null) {
            synchronized (DbSingleton.class) {
                if(instance == null) {
                    instance = new DbSingleton();
                }
            }
        }
        return instance;
    }

    public Connection getConnection() throws SQLException {
        if(conn == null || conn.isClosed()) {
            synchronized (DbSingleton.class) {
                if(conn == null || conn.isClosed()) {
                    String dbUrl = "jdbc:h2:mem:codejava;DB_CLOSE_DELAY=-1";
                    conn = DriverManager.getConnection(dbUrl);
                }
            }
        }
        return conn;
    }
}
