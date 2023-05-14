package application;

import java.io.IOException;
import java.util.ArrayList;

import Buisnesslogic.Student;
import Buisnesslogic.studentCard;
import database.DBHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class StudentCardController extends StudentCardFormController {
	ArrayList<studentCard> sc = new ArrayList<studentCard>();
	ArrayList<Student> student = new ArrayList<Student>();
	DBHandler db = new DBHandler();

    @FXML
	protected Label Bal;

    @FXML
    protected Label memberships;

    @FXML
    protected Label name;

    @FXML
    protected Label rollNo;
    
    @FXML
    protected Button goBack;
    
    @FXML
    private Button show;

    @FXML
    void show(ActionEvent event) {
    	
    	sc = db.readCard();
    	student = db.readStudent();
    	studentCard obj = new studentCard();
    	Student objSt = new studentCard();
    	obj = sc.get(sc.size()-1);
    	objSt = student.get(student.size()-1);
    	//String Balance ;
    	Bal.setText(obj.getBalance());
    	memberships.setText(obj.getMemberShips());
    	name.setText(objSt.getName());
    	rollNo.setText(objSt.getRollNo());
    }
    
    @FXML
    void goBack(ActionEvent event) throws IOException {
    	Parent root =  FXMLLoader.load(getClass().getResource("StudentOptions.fxml"));
    	Stage stage = (Stage) goBack.getScene().getWindow();
    	stage.setScene(new Scene(root,450,580));

    }

}
