package com.metrostate.edu.booknow.services;

import com.metrostate.edu.booknow.models.Restaurant;

import java.util.List;

public class RestaurantService {

    // fetching restaurants by location
    public List<Restaurant> getRestaurantsByLocation(String location) {
        return null;
    }

    // fetching restaurants by cuisine type
    public List<Restaurant> getRestaurantsByCuisine(String cuisine) {
        return null;
    }

    //fetching restaurants by rating
    public List<Restaurant> getRestaurantsByRating(int rating) {

        return null;
    }

    // fetching restaurants
    public List<Restaurant> getRestaurantsByPriceRange(String priceRange) {
        return null;
    }
    // submit a review for a restaurant
    public boolean submitReview(Restaurant restaurant, String review, int rating) {
        return false;
    }

    // searching restaurants based on location, cuisine, and time
    public List<Restaurant> searchRestaurants(String location, String cuisine, String time) {
        return null;
    }

}
