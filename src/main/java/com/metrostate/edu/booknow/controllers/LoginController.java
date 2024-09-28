package com.metrostate.edu.booknow.controllers;

import com.metrostate.edu.booknow.services.AuthenticationService;
import com.metrostate.edu.booknow.utils.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField tf_username;

    @FXML
    private PasswordField pf_password;

    private AuthenticationService authenticationService = new AuthenticationService();

    // Called when the user presses the "Login" button
    @FXML
    public void onLoginButtonAction() {
        String username = tf_username.getText();
        String password = pf_password.getText();

        if (username.isEmpty() || password.isEmpty()) {
            Alerts.showErrorAlert("Error", "Please fill in both fields.");
            return;
        }
        boolean isAuthenticated = authenticationService.authenticate(username, password);
        displayLoginResult(isAuthenticated);
    }

    // Displays the result of the login attempt
    public void displayLoginResult(boolean success) {
        if (success) {
            Alerts.showInfoAlert("Success", "Login successful!");
        } else {
            Alerts.showErrorAlert("Error", "Invalid username or password.");
        }
    }

    // when the user presses the "Create New Account" button
    @FXML
    public void onCreateAccountButtonAction() {
    }
}
