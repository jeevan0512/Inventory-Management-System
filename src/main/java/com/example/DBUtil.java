package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    private static final String HOST = System.getenv("DB_HOST");       
    private static final String PORT = System.getenv("DB_PORT");       
    private static final String DB_NAME = System.getenv("DB_NAME");    
    private static final String USER = System.getenv("DB_USER");       
    private static final String PASS = System.getenv("DB_PASS");       

    private static final String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DB_NAME + "?useSSL=false&serverTimezone=UTC";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }
}
