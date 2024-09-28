package com.metrostate.edu.booknow.services;

public class AuthenticationService {

    public boolean authenticate(String username, String password) {
        return "admin".equals(username) && "password".equals(password); // example
    }
}

