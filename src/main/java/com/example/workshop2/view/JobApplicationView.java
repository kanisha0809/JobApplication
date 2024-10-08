package com.example.workshop2.view;

import javafx.scene.control.*;
import javafx.scene.layout.Pane;

public class JobApplicationView extends Pane {
    private TextField nameField;
    private TextField phoneField;
    private TextField skillsField;
    private ComboBox<String> jobRoleComboBox;
    private TextArea jobDetailsArea;
    private Button submitButton;
    private Button viewDetailsButton;
    private Button clearButton;
    private Button exitButton;

    public JobApplicationView() {
        // Applicant information fields
        Label nameLabel = new Label("Name:");
        nameLabel.relocate(10, 10);
        nameField = new TextField();
        nameField.relocate(100, 10);

        Label phoneLabel = new Label("Phone:");
        phoneLabel.relocate(10, 40);
        phoneField = new TextField();
        phoneField.relocate(100, 40);

        Label skillsLabel = new Label("Skills:");
        skillsLabel.relocate(10, 70);
        skillsField = new TextField();
        skillsField.relocate(100, 70);

        // Job role dropdown
        Label jobRoleLabel = new Label("Job Role:");
        jobRoleLabel.relocate(10, 100);
        jobRoleComboBox = new ComboBox<>();
        jobRoleComboBox.relocate(100, 100);
        jobRoleComboBox.getItems().addAll("Software Developer", "Data Analyst", "Product Manager");

        // Buttons
        submitButton = new Button("Submit Application");
        submitButton.relocate(10, 140);

        viewDetailsButton = new Button("View Job Details");
        viewDetailsButton.relocate(150, 140);

        clearButton = new Button("Clear");
        clearButton.relocate(10, 180);

        exitButton = new Button("Exit");
        exitButton.relocate(150, 180);

        // Job details area
        jobDetailsArea = new TextArea();
        jobDetailsArea.relocate(10, 220);
        jobDetailsArea.setPrefSize(280, 150);

        // Adding components to the pane
        getChildren().addAll(nameLabel, nameField, phoneLabel, phoneField, skillsLabel, skillsField,
                jobRoleLabel, jobRoleComboBox, submitButton, viewDetailsButton, clearButton, exitButton, jobDetailsArea);
    }

    // Public methods to access the components
    public TextField getNameField() {
        return nameField;
    }

    public TextField getPhoneField() {
        return phoneField;
    }

    public TextField getSkillsField() {
        return skillsField;
    }

    public ComboBox<String> getJobRoleComboBox() {
        return jobRoleComboBox;
    }

    public Button getSubmitButton() {
        return submitButton;
    }

    public Button getViewDetailsButton() {
        return viewDetailsButton;
    }

    public Button getClearButton() {
        return clearButton;
    }

    public Button getExitButton() {
        return exitButton;
    }

    public TextArea getJobDetailsArea() {
        return jobDetailsArea;
    }
}
