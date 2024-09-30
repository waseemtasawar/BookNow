package com.metrostate.edu.booknow.services;

import com.metrostate.edu.booknow.models.Customer;
import java.util.ArrayList;
import java.util.List;

public class CustomerService {

    // Simulated database of customers (in-memory for now)
    private List<Customer> customerDatabase = new ArrayList<>();

    // Add a new customer to the database
    public boolean addCustomer(Customer customer) {
        // Check if username is already taken
        if (isUsernameTaken(customer.getUsername())) {
            return false;  // Username already exists, account creation failed
        }
        // Add the customer to the "database"
        customerDatabase.add(customer);
        return true;  // Account created successfully
    }

    // Check if the username is already taken
    public boolean isUsernameTaken(String username) {
        // Iterate over the "database" to check if the username already exists
        for (Customer existingCustomer : customerDatabase) {
            if (existingCustomer.getUsername().equalsIgnoreCase(username)) {
                return true;  // Username is already taken
            }
        }
        return false;  // Username is available
    }

    // Additional methods added here if needed

}
