package com.metrostate.edu.booknow.controllers;

import com.metrostate.edu.booknow.models.Restaurant;
import com.metrostate.edu.booknow.services.RestaurantService;
import com.metrostate.edu.booknow.services.ReservationService;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
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
    private ComboBox<Restaurant> restaurantComboBox;  // Dropdown for available restaurants

    @FXML
    private VBox reservationHistoryVBox;  // VBox to display past reservations

    private RestaurantService restaurantService = new RestaurantService();  // Restaurant service instance
    private ReservationService reservationService = new ReservationService(); // Reservation service instance


    @FXML
    public void onGuestButtonAction() {
    }


    @FXML
    public void onSearchButtonClick() {
        String location = locationComboBox.getValue();
        String cuisine = cb_cuisineType.getValue();
        String time = checkInDate.getValue().toString(); // Convert DatePicker value to String

        List<Restaurant> availableRestaurants = restaurantService.searchRestaurants(location, cuisine, time);
    }

    @FXML
    public void onRestaurantSelected() {
        // will fetch available times for the selected restaurant
        // and populate availabilityVBox with the times
    }

    @FXML
    public void onConfirmReservation() {
        // Logic to confirm and record the reservation
    }

    // fetch and display reservation history for the customer
    @FXML
    public void onViewReservationHistory() {

    }

    @FXML
    public void onLeaveReview() {

    }


    @FXML
    public void onCancelReservation() {
        // handle reservation cancellation
    }

    //  increase the number of adults
    @FXML
    public void increaseAdults() {
    }

    //  decrease the number of adults
    @FXML
    public void decreaseAdults() {
    }

    // increase the number of children
    @FXML
    public void increaseChildren() {
    }

    // decrease the number of children
    @FXML
    public void decreaseChildren() {
      // decreasing the number of children
    }
    @FXML
    public void displayRestaurants(List<Restaurant> availableRestaurantsList) {
        // Update the UI with the list of available restaurants
    }
}
