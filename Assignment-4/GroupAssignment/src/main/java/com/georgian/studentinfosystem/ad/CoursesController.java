//GROUP 2: AARSH PARIMAL PATEL - STUDENT ID: 200520260, DAXIL ASHISHKUMAR PATEL - STUDENT ID: 200520270
//STUDENT INFORMATION SYSTEM
//ASSIGNMENT 4

package com.georgian.studentinfosystem.ad;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CoursesController {

    // FXML fields for the input text fields in the UI
    @FXML
    private TextField StudentID;
    @FXML
    private TextField ProfessorID;
    @FXML
    private TextField CourseID;
    @FXML
    private TextField CourseName;
    @FXML
    private TextField CourseInstructor;
    @FXML
    private TextField CourseDescription;
    @FXML
    private TextField CourseDelivery;
    @FXML
    private TextField CourseCapacity;
    @FXML
    private TextField CourseCredits;

    // This method is called when the "Close" button is clicked
    @FXML
    void OnClose(ActionEvent event) throws IOException {
        // Load the "hello-view.fxml" file and create a new scene with it
        Parent member_loader = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        Scene member_scene = new Scene(member_loader);
        // Get the current stage (window) from the event and set the new scene to it
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(member_scene);
        // Set the title of the window
        app_stage.setTitle("Student Information System");
        // Display the new scene
        app_stage.show();
    }

    // This method is called when the "Display" button is clicked
    @FXML
    void onDisplay(ActionEvent event) {
        // Retrieve the values entered in the text fields
        String studentID = StudentID.getText();
        String professorID = ProfessorID.getText();
        String courseID = CourseID.getText();
        String courseName = CourseName.getText();
        String courseInstructor = CourseInstructor.getText();
        String courseDescription = CourseDescription.getText();
        String courseDelivery = CourseDelivery.getText();
        String courseCapacity = CourseCapacity.getText();
        String courseCredits = CourseCredits.getText();

        // Print the values to the console
        System.out.println("Student ID: " + studentID);
        System.out.println("Professor ID: " + professorID);
        System.out.println("Course ID: " + courseID);
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Instructor: " + courseInstructor);
        System.out.println("Course Description: " + courseDescription);
        System.out.println("Course Delivery: " + courseDelivery);
        System.out.println("Course Capacity: " + courseCapacity);
        System.out.println("Course Credits: " + courseCredits);
    }
}
