package com.example.workshop2.model;


public class JobRole {
    private String role;
    private String description;

    public JobRole(String role, String description) {
        this.role = role;
        this.description = description;
    }

    public String getRole() {
        return role;
    }

    public String getDescription() {
        return description;
    }
}

