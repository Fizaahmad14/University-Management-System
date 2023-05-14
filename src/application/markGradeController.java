package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.stage.Stage;

public class markGradeController {

    @FXML
    private Label name1;

    @FXML
    private Label name10;

    @FXML
    private Label name2;

    @FXML
    private Label name3;

    @FXML
    private Label name4;

    @FXML
    private Label name5;

    @FXML
    private Label name6;

    @FXML
    private Label name7;

    @FXML
    private Label name8;

    @FXML
    private Label name9;

    @FXML
    private Button save;

    @FXML
    private MenuButton select;

    @FXML
    private MenuButton select1;

    @FXML
    private MenuButton select2;

    @FXML
    private MenuButton select3;

    @FXML
    private MenuButton select4;

    @FXML
    private MenuButton select5;

    @FXML
    private MenuButton select6;

    @FXML
    private MenuButton select7;

    @FXML
    private MenuButton select8;

    @FXML
    private MenuButton select9;

    @FXML
    void a(ActionEvent event) {

    }

    @FXML
    void b(ActionEvent event) {

    }

    @FXML
    void c(ActionEvent event) {

    }

    @FXML
    void d(ActionEvent event) {

    }

    @FXML
    void f(ActionEvent event) {

    }

    @FXML
    void save(ActionEvent event) {

    }

    @FXML
    void select(ActionEvent event) {

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
