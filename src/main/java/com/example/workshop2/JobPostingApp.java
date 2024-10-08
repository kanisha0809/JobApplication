//Course:<subject type> - Semester
//        Name: Kanisha
//        ID: 111877221
//        Section: NAA
//        This assignment represents my own work in accordance with Seneca Academic
//        Policy.


package com.example.workshop2;


import com.example.workshop2.controller.JobApplicationController;
import com.example.workshop2.view.JobApplicationView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class JobPostingApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        JobApplicationView view = new JobApplicationView();
        JobApplicationController controller = new JobApplicationController(view);

        Scene scene = new Scene(view, 300, 400);
        primaryStage.setTitle("Job Posting Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

