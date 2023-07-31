//GROUP 2: AARSH PARIMAL PATEL - STUDENT ID: 200520260, DAXIL ASHISHKUMAR PATEL - STUDENT ID: 200520270
//STUDENT INFORMATION SYSTEM
//ASSIGNMENT 4

package com.georgian.studentinfosystem.ad;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 362, 476);
        stage.setTitle("Student Information System");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}