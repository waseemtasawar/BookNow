package com.metrostate.edu.booknow.services;

import com.metrostate.edu.booknow.models.Restaurant;

import java.util.List;

public class RestaurantService {

    // Fetches a list of restaurants by location
    public List<Restaurant> getRestaurantsByLocation(String location) {
        // Logic for retrieving restaurants based on their location
        return null;
    }

    // Fetches a list of restaurants by cuisine type
    public List<Restaurant> getRestaurantsByCuisine(String cuisine) {
        // Logic for retrieving restaurants based on their cuisine type
        return null;
    }

    // Fetches a list of restaurants by rating
    public List<Restaurant> getRestaurantsByRating(int rating) {
        // Logic for retrieving restaurants based on their rating
        return null;
    }

    // Fetches a list of restaurants by price range
    public List<Restaurant> getRestaurantsByPriceRange(String priceRange) {
        // Logic for retrieving restaurants based on their price range
        return null;
    }

    // Searches restaurants based on location, cuisine type, and reservation time
    public List<Restaurant> searchRestaurants(String location, String cuisine, String time) {
        // Logic for searching restaurants based on the provided filters
        return null;
    }

    // Allows users to submit a review for a restaurant
    public boolean submitReview(Restaurant restaurant, String review, int rating) {
        // Logic for submitting a review and rating for a restaurant
        return false;
    }
}
