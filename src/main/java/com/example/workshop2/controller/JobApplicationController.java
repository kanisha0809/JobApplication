package com.example.workshop2.controller;

import com.example.workshop2.model.Applicant;
import com.example.workshop2.model.JobRole;
import com.example.workshop2.view.JobApplicationView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.ArrayList;
import java.util.List;

public class JobApplicationController {
    private JobApplicationView view;
    private List<Applicant> applicants;

    public JobApplicationController(JobApplicationView view) {
        this.view = view;
        this.applicants = new ArrayList<>();
        setupHandlers();
    }

    private void setupHandlers() {
        // Submit Application Button
        view.getSubmitButton().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String name = view.getNameField().getText();
                String phone = view.getPhoneField().getText();
                String skills = view.getSkillsField().getText();
                String jobRole = view.getJobRoleComboBox().getValue();

                if (name.isEmpty() || phone.isEmpty() || jobRole == null) {
                    // Display error message if necessary fields are missing
                    System.out.println("Please fill out all fields.");
                } else {
                    Applicant applicant = new Applicant(name, phone);
                    applicant.addSkill(skills);
                    System.out.println("Application submitted for: " + name);
                    applicants.add(applicant);
                }
            }
        });

        // View Job Details Button
        view.getViewDetailsButton().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String jobRole = view.getJobRoleComboBox().getValue();
                if (jobRole != null) {
                    String description = getJobDetails(jobRole);
                    view.getJobDetailsArea().setText(description);
                }
            }
        });

        // Clear Button
        view.getClearButton().setOnAction(event -> clearForm());

        // Exit Button
        view.getExitButton().setOnAction(event -> System.exit(0));
    }

    // Method to clear the form fields
    private void clearForm() {
        view.getNameField().clear();
        view.getPhoneField().clear();
        view.getSkillsField().clear();
        view.getJobRoleComboBox().setValue(null);
        view.getJobDetailsArea().clear();
    }

    // Dummy method to simulate job role details
    private String getJobDetails(String jobRole) {
        switch (jobRole) {
            case "Software Developer":
                return "A Software Developer writes code for applications.";
            case "Data Analyst":
                return "A Data Analyst interprets data and generates insights.";
            case "Product Manager":
                return "A Product Manager oversees the development of products.";
            default:
                return "No details available.";
        }
    }
}

