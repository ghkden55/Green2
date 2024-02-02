package com.example.myWeb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBcon {

    private static Connection conn;

    public static Connection getConnection() {

        String driver = "org.mariadb.jdbc.Driver";
        String url = "jdbc:mariadb://localhost:3307/green";
        String uid = "root";
        String pw = "1234";

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, uid, pw);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }
}
