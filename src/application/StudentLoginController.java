package application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
import javafx.scene.*;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
import javafx.scene.control.*;
//import javafx.scene.control.TextField;
import javafx.stage.*;
import java.io.IOException;
import java.util.ArrayList;

import Buisnesslogic.StudentAccount;
import database.DBHandler;
import javafx.event.*;

public class StudentLoginController {

	DBHandler db = new DBHandler();
	public StudentLoginController() {
		// TODO Auto-generated constructor stub
	}
	@FXML
    private Label message;
	
	@FXML
    private PasswordField password;

    @FXML
    private Button login;

    @FXML
    private TextField username;
    
    @FXML
    private Button goBack;
    @FXML
    void goBack(ActionEvent event) throws IOException {
   
    	
    	Parent root =  FXMLLoader.load(getClass().getResource("MainPage.fxml"));
    	Stage stage = (Stage) goBack.getScene().getWindow();
    	stage.setScene(new Scene(root,450,580));

    }

    @FXML
    void login(ActionEvent event) throws IOException 
    {
    	
    	ArrayList<StudentAccount> s = new ArrayList<StudentAccount>();
    	s = db.readStudentAccount();
		Boolean checkUsername = false;
    	for(int i=0; i<s.size(); i++)
    		{
	    		if(username.getText().isEmpty()==false || password.getText().isEmpty()==false)
	    			message.setText("Enter data in all fields");
				if(s.get(i).getUsername().equals(username.getText()) && s.get(i).getPassword().equals(password.getText()))
	    			{
	    				checkUsername = true;
	    			}
    		}
    	if(checkUsername == false)
    		message.setText("Wrong username/password");
    	else
    	{
    		Parent root =  FXMLLoader.load(getClass().getResource("StudentOptions.fxml"));
    		Stage stage = (Stage) login.getScene().getWindow();
    		stage.setScene(new Scene(root,450,580));
    	}
    	
    }
    	
    	

}


