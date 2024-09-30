package com.metrostate.edu.booknow.models;

public class Restaurant {
    private String name;
    private String location;
    private float rating;
    private float price;

    // Constructor
    public Restaurant(String name, String location, float rating, float price) {
        this.name = name;
        this.location = location;
        this.rating = rating;
        this.price = price;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
