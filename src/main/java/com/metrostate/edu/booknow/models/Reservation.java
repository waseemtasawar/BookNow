package com.metrostate.edu.booknow.models;

import java.time.LocalDateTime;

public class Reservation {
    private Customer customer;
    private Restaurant restaurant;
    private LocalDateTime reservationDateTime;
    private int numberOfGuests;

    // Constructor
    public Reservation(Customer customer, Restaurant restaurant, LocalDateTime reservationDateTime, int numberOfGuests) {
        this.customer = customer;
        this.restaurant = restaurant;
        this.reservationDateTime = reservationDateTime;
        this.numberOfGuests = numberOfGuests;
    }

    // Getters and setters
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public LocalDateTime getReservationDateTime() {
        return reservationDateTime;
    }

    public void setReservationDateTime(LocalDateTime reservationDateTime) {
        this.reservationDateTime = reservationDateTime;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }
}
