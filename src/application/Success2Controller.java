package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Success2Controller {
	
    @FXML
    private Button goBack;

    @FXML
    void goBack(ActionEvent event) throws IOException {
    	Parent root =  FXMLLoader.load(getClass().getResource("MainPage.fxml"));
    	Stage stage = (Stage) goBack.getScene().getWindow();
    	stage.setScene(new Scene(root,450,580));

    }

}

