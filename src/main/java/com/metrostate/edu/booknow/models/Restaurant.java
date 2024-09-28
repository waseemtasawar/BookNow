package com.metrostate.edu.booknow.models;

public class Restaurant {
    private int id;
    private String name;
    private String location;
    private String imagePath;
    private String description;
    private float rating;
    private int numberOfReviews;
    private float price;

    // Constructor
    public Restaurant(int id, String name, String location, String imagePath, String description, float rating, int numberOfReviews, float price) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.imagePath = imagePath;
        this.description = description;
        this.rating = rating;
        this.numberOfReviews = numberOfReviews;
        this.price = price;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getNumberOfReviews() {
        return numberOfReviews;
    }

    public void setNumberOfReviews(int numberOfReviews) {
        this.numberOfReviews = numberOfReviews;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
