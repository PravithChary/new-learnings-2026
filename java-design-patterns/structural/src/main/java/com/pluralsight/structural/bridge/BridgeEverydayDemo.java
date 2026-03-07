package com.pluralsight.structural.bridge;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BridgeEverydayDemo {

    public static void main(String[] args) {
        try{
            // H2 in memory database
            String dbUrl = "jdbc:h2:mem:codejava;DB_CLOSE_DELAY=-1";
            Connection conn = DriverManager.getConnection(dbUrl);
            Statement sta = conn.createStatement();

            // This client is an abstraction and can work with any database that has a driver
            sta.executeUpdate(
                    "CREATE TABLE address(" +
                            "id INT PRIMARY KEY, " +
                            "streetName VARCHAR(20), " +
                            "city VARCHAR(20))"
            );

            System.out.println("Table created");
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
