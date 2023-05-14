package application;
import java.io.IOException;
import java.util.ArrayList;
import Buisnesslogic.FacultyAccount;
import database.DBHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FacultyLoginController {
	
	DBHandler db = new DBHandler();
	@FXML
    private Button goBack;
	
	@FXML
    private PasswordField password;

    @FXML
    private Button signin;

    @FXML
    private TextField username;
    
    @FXML
    private Label message;

    @FXML
    void signin(ActionEvent event) throws IOException {
    	ArrayList<FacultyAccount> f = new ArrayList<FacultyAccount>();
    	f = db.readFacultyAccount();
		Boolean checkUsername = false;
    	for(int i=0; i<f.size(); i++)
    		{
	    	//	System.out.println("s = "+username.getText()+" s = "+ password.getText());
			//	System.out.println("u = "+f.get(i).getUsername()+" p = "+ f.get(i).getPassword());
				if(f.get(i).getUsername().equals(username.getText()) && f.get(i).getPassword().equals(password.getText()))
				{
					checkUsername = true;
				}
    		}
    	if(checkUsername == false)
    		message.setText("Wrong username/password");
    	else
    	{
    		Parent root =  FXMLLoader.load(getClass().getResource("FacultyOptions.fxml"));
    		Stage stage = (Stage) signin.getScene().getWindow();
    		stage.setScene(new Scene(root,450,580));
    	}
    		
    }
    
    @FXML
    void goBack(ActionEvent event) throws IOException {
    	Parent root =  FXMLLoader.load(getClass().getResource("MainPage.fxml"));
    	Stage stage = (Stage) goBack.getScene().getWindow();
    	stage.setScene(new Scene(root,450,580));
    }

}
