package com.metrostate.edu.booknow.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    // Database connection details
    private static String url = "";
    private static String username = "";
    private static String password = "";

    // Method to establish the connection to the MySQL database
    public static Connection connect() throws SQLException {
        Connection connection = null;
        try {
            // Establish the connection to the MySQL database
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection to MySQL database successful!");
        } catch (SQLException e) {
            System.out.println("Failed to connect to MySQL database.");
            e.printStackTrace();
            throw e;  // Rethrow the exception so the calling method knows the connection failed
        }
        return connection;
    }
}
