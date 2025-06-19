package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    private static final String RAW_URL = System.getenv("DATABASE_URL");
    // Convert the URL to JDBC format and add SSL options
    private static final String String jdbcUrl = "jdbc:mysql://hopper.proxy.rlwy.net:32474/railway" +
                 "?useSSL=true" +
                 "&requireSSL=true" +
                 "&verifyServerCertificate=false" +
                 "&user=root" +
                 "&password=DqbhgwJBrvvGgHnLgAHcIXVKCLXghbnR";


    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL);
    }

    // Helper method to convert the DATABASE_URL to JDBC format
    private static String convertToJdbcUrl(String url) {
        // Example: mysql://user:pass@host:port/db
        if (url == null) return null;
        String jdbcUrl = url.replace("mysql://", "jdbc:mysql://");
        // Add SSL options
        if (!jdbcUrl.contains("?")) {
            jdbcUrl += "?useSSL=true&requireSSL=true&verifyServerCertificate=false";
        } else {
            jdbcUrl += "&useSSL=true&requireSSL=true&verifyServerCertificate=false";
        }
        return jdbcUrl;
    }
}
