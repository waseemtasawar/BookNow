package com.metrostate.edu.booknow.services;

import com.metrostate.edu.booknow.models.Reservation;
import com.metrostate.edu.booknow.models.Restaurant;
import com.metrostate.edu.booknow.models.Customer;
import java.util.List;

public class ReservationService {

    // confirm a reservation (create a new reservation)
    public boolean confirmReservation(Reservation reservation) {
        // This will save the reservation details (such as customer, restaurant, time) in the system
        return false;
    }

    // fetch reservations made by a specific customer (view reservation history)
    public List<Reservation> getReservationsByCustomer(Customer customer) {
        // This will retrieve all reservations made by the customer
        return null;
    }

    // fetch available reservation times for a specific restaurant
    public List<String> getAvailableTimes(Restaurant restaurant) {
        // This will fetch available time slots for the selected restaurant
        return null;
    }

    // cancel an existing reservation
    public boolean cancelReservation(String reservationId) {
        // This will cancel the reservation with the provided reservation ID
        return false;
    }
}
