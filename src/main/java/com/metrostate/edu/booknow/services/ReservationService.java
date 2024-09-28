package com.metrostate.edu.booknow.services;

import com.metrostate.edu.booknow.models.Reservation;
import com.metrostate.edu.booknow.models.Restaurant;
import com.metrostate.edu.booknow.models.Customer;

import java.util.List;

public class ReservationService {

    //
    public boolean SelectReservation(Reservation reservation) {
        // logic selecting a reservation
        return false;
    }

    // fetching reservations by customer
    public List<Reservation> getReservationsByCustomer(Customer customer) {
        return null;
    }

    // fetching available times for a restaurant
    public List<String> getAvailableTimes(Restaurant restaurant) {

        return null;
    }
    // cancel a reservation
    public boolean cancelReservation(Reservation reservation) {
        return false;
    }

}
