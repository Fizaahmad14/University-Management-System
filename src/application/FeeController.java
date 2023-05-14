package application;

import java.io.IOException;
import java.util.ArrayList;

import Buisnesslogic.Course;
import Buisnesslogic.Student;
import database.DBHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import studentAdmission.AcademicOffice;

public class FeeController extends AcademicOffice{

	ArrayList<Course> courses = new ArrayList<Course>();
	ArrayList<Student> student = new ArrayList<Student>();
	DBHandler db = new DBHandler(); 
	AcademicOffice ac = new AcademicOffice();
	
	@FXML
    private Label degree;
	
    @FXML
    private Label challanNo;

    @FXML
    private Label name;

    @FXML
    private Label rollno;

    @FXML
    private Label total;

    @FXML
    private Label tuition;
    
    @FXML
    private Button goBack;
    
    @FXML
    private Button view;

    @FXML
    void view(ActionEvent event) {
    	
    	courses = db.readCourse();
    	student = db.readStudent();
    	Student obj = new Student();
    	obj = student.get(student.size()-1);
    	
    	name.setText(obj.getName());
    	challanNo.setText(obj.getRollNo());
    	rollno.setText(obj.getRollNo());
    	degree.setText("BSCS");
    	tuition.setText(ac.generateFee(courses));
    	total.setText(ac.generateFee(courses));
    	
    }
    @FXML
    void goBack(ActionEvent event) throws IOException {
    	Parent root =  FXMLLoader.load(getClass().getResource("StudentOptions.fxml"));
    	Stage stage = (Stage) goBack.getScene().getWindow();
    	stage.setScene(new Scene(root,450,580));

    }

}
