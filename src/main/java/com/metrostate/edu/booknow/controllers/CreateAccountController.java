package com.metrostate.edu.booknow.controllers;

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

        Alerts.showInfoAlert("Info", "Create account logic placeholder.");
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
