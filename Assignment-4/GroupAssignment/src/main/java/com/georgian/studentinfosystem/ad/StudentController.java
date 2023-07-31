package com.georgian.studentinfosystem.ad;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.ToggleGroup;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// Define the controller class for the JavaFX application
public class StudentController {

    // Define FXML elements in the corresponding FXML file
    @FXML
    private TextField StudentID;

    @FXML
    private TextField Name;

    @FXML
    private TextField Age;

    @FXML
    private TextField Address;

    @FXML
    private RadioButton MaleRadioButton;

    @FXML
    private RadioButton FemaleRadioButton;

    @FXML
    private TextField ContactNumber;

    // Define the connection parameters for MySQL database
    private static final String DB_URL = "jdbc:mysql://localhost:3306/student_info_system"; // Database URL
    private static final String DB_USER = "root"; // Database username
    private static final String DB_PASSWORD = "@Aarsh2003"; // Database password

    private Connection connection; // Database connection object

    // This method is automatically called when the FXML file is loaded
    public void initialize() {
        // Create a toggle group for gender radio buttons to ensure only one can be
        // selected at a time
        ToggleGroup genderToggleGroup = new ToggleGroup();
        MaleRadioButton.setToggleGroup(genderToggleGroup);
        FemaleRadioButton.setToggleGroup(genderToggleGroup);

        // Establish a database connection when initializing the controller
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // This method is called when the "Close" button is clicked
    @FXML
    void OnClose(ActionEvent event) throws IOException {
        // Load the "hello-view.fxml" FXML file and create a new scene
        Parent member_loader = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        Scene member_scene = new Scene(member_loader);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow(); // Get the current stage
        app_stage.setScene(member_scene); // Set the new scene
        app_stage.setTitle("Student Information System"); // Set the stage title
        app_stage.show(); // Display the new scene
    }

    // This method is called when the "Display" button is clicked
    @FXML
    void onDisplay(ActionEvent event) {
        // Get the input data from the text fields and radio buttons
        String studentID = StudentID.getText();
        String name = Name.getText();
        String age = Age.getText();
        String address = Address.getText();
        String gender = MaleRadioButton.isSelected() ? "Male" : "Female";
        String contactNumber = ContactNumber.getText();

        // Print the input data to the console for testing
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Gender: " + gender);
        System.out.println("Contact Number: " + contactNumber);

        // Insert data into the database
        insertData(studentID, name, age, address, gender, contactNumber);

        // Retrieve data from the database and print it to the console
        selectData();
    }

    // This method inserts data into the "student" table of the database
    private void insertData(String studentID, String name, String age, String address, String gender,
                            String contactNumber) {
        // SQL query to insert data into the "student" table
        String query = "INSERT INTO student (studentID, name, age, address, gender, contactNumber) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            // Set the values for each parameter in the SQL query
            statement.setString(1, studentID);
            statement.setString(2, name);
            statement.setString(3, age);
            statement.setString(4, address);
            statement.setString(5, gender);
            statement.setString(6, contactNumber);

            // Execute the SQL query to insert data into the database
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Data inserted successfully!");
            } else {
                System.out.println("Failed to insert data.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // This method selects and prints data from the "student" table of the database
    private void selectData() {
        // SQL query to retrieve all data from the "student" table
        String query = "SELECT * FROM student";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            ResultSet resultSet = statement.executeQuery(); // Execute the query and get the result set
            while (resultSet.next()) {
                // Get data from the result set for each row
                String studentID = resultSet.getString("studentID");
                String name = resultSet.getString("name");
                String age = resultSet.getString("age");
                String address = resultSet.getString("address");
                String gender = resultSet.getString("gender");
                String contactNumber = resultSet.getString("contactNumber");

                // Print the retrieved data to the console
                System.out.println("Student ID: " + studentID);
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Address: " + address);
                System.out.println("Gender: " + gender);
                System.out.println("Contact Number: " + contactNumber);
                System.out.println("-------------------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

