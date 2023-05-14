package application;

import java.io.IOException;

import Buisnesslogic.studentCard;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class StudentCardFormController{
	
	studentCard s = new studentCard();
	
    @FXML
    private MenuItem ai;

    @FXML
    protected TextField balance;

    @FXML
    private MenuItem cs;

    @FXML
    private MenuItem cys;

    @FXML
    private SplitMenuButton degree;

    @FXML
    private MenuItem gym;

    @FXML
    private SplitMenuButton membership;

    @FXML
    private MenuItem se;

    @FXML
    private MenuItem sport;

    @FXML
    private Button submit;

    @FXML
    void ai(ActionEvent event) {
    	degree.setText("BSAI");

    }

    @FXML
    void cs(ActionEvent event) {
    	degree.setText("BSCS");

    }

    @FXML
    void cys(ActionEvent event) {
    	degree.setText("BSCYS");
    }

    @FXML
    void gym(ActionEvent event) {
    	membership.setText("Gym");
    }

    @FXML
    void se(ActionEvent event) {
    	degree.setText("BSSE");
    }

    @FXML
    void sport(ActionEvent event) {
    	membership.setText("Sports"); 	
    }
    @FXML
    private Button goBack;
    
    @FXML
    void goBack(ActionEvent event) throws IOException {
    	Parent root =  FXMLLoader.load(getClass().getResource("StudentOptions.fxml"));
    	Stage stage = (Stage) goBack.getScene().getWindow();
    	stage.setScene(new Scene(root,450,580));

    }

    @FXML
    void submit(ActionEvent event) throws IOException {
    	
    	s.setStudentCard(balance.getText(), membership.getText(), degree.getText());
    	Parent root =  FXMLLoader.load(getClass().getResource("success1.fxml"));
    	Stage stage = (Stage) submit.getScene().getWindow();
    	stage.setScene(new Scene(root,450,580));

    }

}
