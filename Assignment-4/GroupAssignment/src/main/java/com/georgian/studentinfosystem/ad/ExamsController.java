//GROUP 2: AARSH PARIMAL PATEL - STUDENT ID: 200520260, DAXIL ASHISHKUMAR PATEL - STUDENT ID: 200520270
//STUDENT INFORMATION SYSTEM
//ASSIGNMENT 4

package com.georgian.studentinfosystem.ad;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ExamsController {

    // FXML fields for the input text fields in the UI
    @FXML
    private TextField StudentID;
    @FXML
    private TextField ProfessorID;
    @FXML
    private TextField ExamID;
    @FXML
    private TextField CourseID;
    @FXML
    private TextField ExamName;
    @FXML
    private TextField ExamType;
    @FXML
    private TextField ExamDate;

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
        String examID = ExamID.getText();
        String courseID = CourseID.getText();
        String examName = ExamName.getText();
        String examType = ExamType.getText();
        String examDate = ExamDate.getText();

        // Print the values to the console
        System.out.println("Student ID: " + studentID);
        System.out.println("Professor ID: " + professorID);
        System.out.println("Exam ID: " + examID);
        System.out.println("Course ID: " + courseID);
        System.out.println("Exam Name: " + examName);
        System.out.println("Exam Type: " + examType);
        System.out.println("Exam Date: " + examDate);
    }
}
