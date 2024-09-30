package com.metrostate.edu.booknow.controllers;

import com.metrostate.edu.booknow.models.Restaurant;
import com.metrostate.edu.booknow.services.RestaurantService;
import com.metrostate.edu.booknow.services.ReservationService;
import com.metrostate.edu.booknow.utils.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

import java.util.List;

public class BookNowController {

    @FXML
    private Label lbl_welcome;

    @FXML
    private ComboBox<String> locationComboBox;

    @FXML
    private ComboBox<String> cb_cuisineType;

    @FXML
    private ComboBox<String> cb_rating;

    @FXML
    private ComboBox<String> cb_priceRange;

    @FXML
    private DatePicker checkInDate;

    @FXML
    private Button guestButton;

    @FXML
    private VBox restaurantListVBox;

    @FXML
    private VBox guestSelectionVBox;

    @FXML
    private Label adultsLabel;

    @FXML
    private Label childrenLabel;

    @FXML
    private VBox availabilityVBox;

    @FXML
    private Button leaveReviewButton;

    @FXML
    private ComboBox<Restaurant> restaurantComboBox;

    @FXML
    private VBox reservationHistoryVBox;

    @FXML
    private TextArea reviewTextArea;

    @FXML
    private ComboBox<String> cb_reviewRating;

    @FXML
    private ComboBox<String> cb_reservationToCancel;

    private RestaurantService restaurantService = new RestaurantService();
    private ReservationService reservationService = new ReservationService();

    @FXML
    public void onGuestButtonAction() {
        // Handle guest selection
    }

    @FXML
    public void onSearchButtonClick() {
        // Handle search button click
        List<Restaurant> availableRestaurants = restaurantService.searchRestaurants(
                locationComboBox.getValue(),
                cb_cuisineType.getValue(),
                checkInDate.getValue().toString()
        );

        if (availableRestaurants.isEmpty()) {
            onNoRestaurantsFound();
        } else {
            displaySearchRestaurants(availableRestaurants);
        }
    }

    @FXML
    public void onNoRestaurantsFound() {
        Alerts.showErrorAlert("No restaurants found", "Try broadening your search criteria.");
    }

    @FXML
    public void onRestaurantSelected() {
        // Assuming you set up an action event for restaurant selection
        Restaurant selectedRestaurant = restaurantComboBox.getValue();
        if (selectedRestaurant != null) {
            displayRestaurantDetails(selectedRestaurant);
        }
    }

    @FXML
    public void onConfirmReservation() {
        // Handle reservation confirmation
    }

    @FXML
    public void onViewReservationHistory() {
        // Handle viewing reservation history
    }

    @FXML
    public void onSubmitReview() {
        // Handle submitting a review
    }

    @FXML
    public void onCancelReservation() {
        // Handle reservation cancellation
    }

    @FXML
    public void increaseAdults() {
        // Increase the number of adults
    }

    @FXML
    public void decreaseAdults() {
        // Decrease the number of adults
    }

    @FXML
    public void increaseChildren() {
        // Increase the number of children
    }

    @FXML
    public void decreaseChildren() {
        // Decrease the number of children
    }

    @FXML
    public void displaySearchRestaurants(List<Restaurant> availableRestaurants) {
        // Display the list of searched restaurants in the UI
    }

    @FXML
    public void displayRestaurantDetails(Restaurant restaurant) {
        // populate a detail view with the restaurant's information
    }
}
