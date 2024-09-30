package com.metrostate.edu.booknow.controllers;

import com.metrostate.edu.booknow.models.Customer;
import com.metrostate.edu.booknow.services.CustomerService;
import com.metrostate.edu.booknow.utils.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class CreateAccountController {

    @FXML
    private TextField tf_Username;

    @FXML
    private PasswordField pf_Password;

    @FXML
    private PasswordField pf_ConfirmPassword;

    // handle customer-related operations
    private CustomerService customerService = new CustomerService();

    // Called when "Create New Account" button is pressed
    @FXML
    public void onCreateAccountButtonAction() {
        String username = tf_Username.getText();
        String password = pf_Password.getText();
        String confirmPassword = pf_ConfirmPassword.getText();

        // Check if any fields are empty
        if (username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            Alerts.showErrorAlert("Error", "All fields must be filled.");
            return;
        }

        // Validate password length
        if (password.length() < 8) {
            Alerts.showErrorAlert("Error", "Password must be at least 8 characters long.");
            return;
        }

        // Check if passwords match
        if (!password.equals(confirmPassword)) {
            Alerts.showErrorAlert("Error", "Passwords do not match.");
            return;
        }

        // Check if username is already taken
        if (customerService.isUsernameTaken(username)) {
            Alerts.showErrorAlert("Error", "Username is already taken.");
            return;
        }

        // Create the new customer account
        boolean accountCreated = customerService.addCustomer(new Customer(username, password));
        if (accountCreated) {
            Alerts.showInfoAlert("Success", "Account created successfully!");
            // Redirect to login or main dashboard
            loadLoginView();  // Placeholder for loading the next view
        } else {
            Alerts.showErrorAlert("Error", "Failed to create account. Please try again.");
        }
    }

    // Called when "Log in" button is pressed
    @FXML
    public void onButton_Login() {

        Alerts.showInfoAlert("Info", "Redirect to login logic placeholder.");
    }

    //  load the login view
    private void loadLoginView() {

    }
}
