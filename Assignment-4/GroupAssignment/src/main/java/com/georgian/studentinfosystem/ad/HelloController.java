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
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private Button Student;

    @FXML
    private Button Grades;

    @FXML
    private Button Courses;

    @FXML
    private Button Enrollments;

    @FXML
    private Button Exams;

    @FXML
    void onStudentClick(ActionEvent event) throws IOException {
        Parent member_loader = FXMLLoader.load(getClass().getResource("student-view.fxml"));
        Scene member_scene = new Scene(member_loader);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(member_scene);
        app_stage.setTitle("Student Information");
        app_stage.show();

    }

    @FXML
    void onGradesClick(ActionEvent event) throws IOException {
        Parent member_loader = FXMLLoader.load(getClass().getResource("grades-view.fxml"));
        Scene member_scene = new Scene(member_loader);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(member_scene);
        app_stage.setTitle("Grades Information");
        app_stage.show();

    }

    @FXML
    void onCoursesClick(ActionEvent event) throws IOException {
        Parent member_loader = FXMLLoader.load(getClass().getResource("courses-view.fxml"));
        Scene member_scene = new Scene(member_loader);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(member_scene);
        app_stage.setTitle("Courses Information");
        app_stage.show();

    }

    @FXML
    void onEnrollmentsClick(ActionEvent event) throws IOException {
        Parent member_loader = FXMLLoader.load(getClass().getResource("enrollments-view.fxml"));
        Scene member_scene = new Scene(member_loader);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(member_scene);
        app_stage.setTitle("Enrollment Information");
        app_stage.show();

    }

    @FXML
    void onExamsClick(ActionEvent event) throws IOException {
        Parent member_loader = FXMLLoader.load(getClass().getResource("exams-view.fxml"));
        Scene member_scene = new Scene(member_loader);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(member_scene);
        app_stage.setTitle("Exam Information");
        app_stage.show();

    }

    public void onHelloButtonClick(ActionEvent actionEvent) {
    }
}
