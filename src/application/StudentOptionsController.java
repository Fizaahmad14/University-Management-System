package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class StudentOptionsController {

    @FXML
    private Button attendance;

    @FXML
    private Button card;

    @FXML
    private Button course;

    @FXML
    private Button fee;

    @FXML
    private Button transcript;
    
    @FXML
    private Button viewCard;
   

    @FXML
    void attendance(ActionEvent event) throws IOException {
    	Parent root =  FXMLLoader.load(getClass().getResource("viewAttendance.fxml"));
    	Stage stage = (Stage) attendance.getScene().getWindow();
    	stage.setScene(new Scene(root,450,580));

    }

    @FXML
    void card(ActionEvent event) throws IOException {
    	Parent root =  FXMLLoader.load(getClass().getResource("studentCardForm.fxml"));
    	Stage stage = (Stage) card.getScene().getWindow();
    	stage.setScene(new Scene(root,450,580));
    }

    @FXML
    void course(ActionEvent event) throws IOException {
    	Parent root =  FXMLLoader.load(getClass().getResource("registerCourse.fxml"));
    	Stage stage = (Stage) course.getScene().getWindow();
    	stage.setScene(new Scene(root,450,580));

    }

    @FXML
    void fee(ActionEvent event) throws IOException {
    	Parent root =  FXMLLoader.load(getClass().getResource("Fee.fxml"));
    	Stage stage = (Stage) fee.getScene().getWindow();
    	stage.setScene(new Scene(root,450,580));

    }

    @FXML
    void transcript(ActionEvent event) throws IOException {
    	Parent root =  FXMLLoader.load(getClass().getResource("transcript.fxml"));
    	Stage stage = (Stage) transcript.getScene().getWindow();
    	stage.setScene(new Scene(root,450,580));

    }
    
    @FXML
    void viewCard(ActionEvent event) throws IOException {
    	Parent root =  FXMLLoader.load(getClass().getResource("StudentCard.fxml"));
    	Stage stage = (Stage) viewCard.getScene().getWindow();
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
