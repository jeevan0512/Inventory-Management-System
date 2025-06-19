
 package com.example; 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    private static final String URL = "mysql://root:DqbhgwJBrvvGgHnLgAHcIXVKCLXghbnR@hopper.proxy.rlwy.net:32474/railway";
    private static final String USER = "root"; 
    private static final String PASS = "DqbhgwJBrvvGgHnLgAHcIXVKCLXghbnR"; 

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
