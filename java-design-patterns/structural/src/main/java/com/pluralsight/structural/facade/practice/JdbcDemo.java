package com.pluralsight.structural.facade.practice;

import java.sql.*;

public class JdbcDemo {

    public static void main(String[] args) {
        DbSingleton instance = DbSingleton.getInstance();

        try {
            Connection conn = instance.getConnection();

            Statement sta = conn.createStatement();
            int count = sta.executeUpdate("CREATE TABLE address(id INTEGER, " +
                    "streetName VARCHAR(20), city VARCHAR(20))");
            System.out.println("Table created");
            sta.close();

            sta = conn.createStatement();
            count = sta.executeUpdate("INSERT INTO address(id, streetName, city)" +
                    "VALUES (1, '1234 Some street', 'Kharadi')");
            System.out.println(count + " record(s) created.");
            sta.close();

            sta = conn.createStatement();
            ResultSet rs = sta.executeQuery("SELECT * FROM address");

            while(rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
