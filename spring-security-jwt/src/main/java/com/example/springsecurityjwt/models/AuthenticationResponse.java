package com.example.springsecurityjwt.models;

public class AuthenticationResponse {

    private final String  jwt;
    private final String  username;

    public AuthenticationResponse(String username, String jwt) {
        this.username = username;
        this.jwt = jwt;
    }

    public String getUsername() {
        return username;
    }

    public String getJwt() {
        return jwt;
    }
}
