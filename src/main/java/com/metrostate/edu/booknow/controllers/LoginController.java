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

    @FXML
    public void onLoginButtonAction() {
        if (validateInput()) {
            boolean isAuthenticated = authenticationService.authenticate(tf_username.getText(), pf_password.getText());
            handleLoginResult(isAuthenticated);
        }
    }

    private boolean validateInput() {
        if (tf_username.getText().isEmpty() || pf_password.getText().isEmpty()) {
            Alerts.showErrorAlert("Error", "Please fill in both fields.");
            return false;
        }
        return true;
    }

    private void handleLoginResult(boolean isAuthenticated) {
        if (isAuthenticated) {
            Alerts.showInfoAlert("Success", "Login successful!");
            // Navigate to BookNowView
        } else {
            Alerts.showErrorAlert("Error", "Invalid username or password.");
        }
    }
}
