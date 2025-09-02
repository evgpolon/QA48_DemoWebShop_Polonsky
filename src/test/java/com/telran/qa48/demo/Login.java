package com.telran.qa48.demo;

public class Login {
    String email; 
    String password;

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