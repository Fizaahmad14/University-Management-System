package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class FacultyOptionsController {

    @FXML
    private Button attendance;

    @FXML
    private Button grade;

    @FXML
    void attendance(ActionEvent event) throws IOException {
    	Parent root =  FXMLLoader.load(getClass().getResource("attendanceTable.fxml"));
    	Stage stage = (Stage) attendance.getScene().getWindow();
    	stage.setScene(new Scene(root,450,580));

    }

    @FXML
    void grade(ActionEvent event) throws IOException {
    	Parent root =  FXMLLoader.load(getClass().getResource("markGradeTable.fxml"));
    	Stage stage = (Stage) grade.getScene().getWindow();
    	stage.setScene(new Scene(root,450,580));

    }
    @FXML
    private Button goBack;
    
    @FXML
    void goBack(ActionEvent event) throws IOException {
    	Parent root =  FXMLLoader.load(getClass().getResource("MainPage.fxml"));
    	Stage stage = (Stage) goBack.getScene().getWindow();
    	stage.setScene(new Scene(root,450,580));

    }

}
