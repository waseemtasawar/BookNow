package com.metrostate.edu.booknow.utils;

import javafx.scene.control.Alert;

public class Alerts {
    // Method to show an information alert
    public static void showInfoAlert(String title, String message) {
        showAlert(Alert.AlertType.INFORMATION, title, message);
    }

    // Method to show an error alert
    public static void showErrorAlert(String title, String message) {
        showAlert(Alert.AlertType.ERROR, title, message);
    }

    // General method to show an alert
    private static void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}

