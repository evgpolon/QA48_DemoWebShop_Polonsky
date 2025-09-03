package com.telran.demoshop.qa48.models;

public class Login {
    private String email;
    private String password;

    public Login setEmail(String email) {
        this.email = email;
        return this;
    }

    public Login setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}