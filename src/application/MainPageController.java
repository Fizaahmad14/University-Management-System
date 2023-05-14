package application;

import java.io.IOException;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainPageController {

    @FXML
    private Button StudLogin;

    @FXML
    private Button admission;

    @FXML
    private Button facLogin;

    @FXML
    void StudLogin(ActionEvent event) throws IOException {
    	Parent root =  FXMLLoader.load(getClass().getResource("StudentLogin.fxml"));
    	Stage stage = (Stage) StudLogin.getScene().getWindow();
    	stage.setScene(new Scene(root,450,580));
    	

    }

    @FXML
    void admission(ActionEvent event) throws IOException {
    	Parent root =  FXMLLoader.load(getClass().getResource("Sample.fxml"));
    	Stage stage = (Stage) admission.getScene().getWindow();
    	stage.setScene(new Scene(root,450,580));

    }

    @FXML
    void facLogin(ActionEvent event) throws IOException {
    	Parent root =  FXMLLoader.load(getClass().getResource("FacultyLogin.fxml"));
    	Stage stage = (Stage) facLogin.getScene().getWindow();
    	stage.setScene(new Scene(root,450,580));

    }

}
