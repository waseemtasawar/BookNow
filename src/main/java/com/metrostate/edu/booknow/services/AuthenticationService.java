package com.metrostate.edu.booknow.services;

import com.metrostate.edu.booknow.utils.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthenticationService {

    // Method to authenticate a user by checking credentials in the database
    public boolean authenticate(String username, String password) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            // Establish connection to the database
            connection = DatabaseConnection.connect();

            // SQL query to find a user with the provided username and password
            String sql = "SELECT * FROM customers WHERE username = ? AND password = ?";
            statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);

            // Execute the query and check if a matching user exists
            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                // User found, authentication successful
                return true;
            } else {
                // No matching user, authentication failed
                return false;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return false;  // Return false if there's an error during authentication
        } finally {
            // Close resources
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
