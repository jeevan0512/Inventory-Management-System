/*package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    // Use the PUBLIC URL for external access (e.g., from your local machine or server)
    private static final String URL = "mysql://root:DqbhgwJBrvvGgHnLgAHcIXVKCLXghbnR@hopper.proxy.rlwy.net:32474/railway";
    private static final String USER = "root"; 
    private static final String PASS = "DqbhgwJBrvvGgHnLgAHcIXVKCLXghbnR"; 

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Ensure you have the MySQL Connector/J in your project
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }
}
*/
package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    private static final String URL = "jdbc:mysql://hopper.proxy.rlwy.net:32474/railway?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
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
