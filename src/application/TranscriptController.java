package application;

import java.io.IOException;
import java.util.ArrayList;

import Buisnesslogic.Course;
import Buisnesslogic.Grade;
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

public class TranscriptController {
	
	AcademicOffice ac = new AcademicOffice();
	DBHandler db = new DBHandler();
	ArrayList<Course> courseList = new ArrayList<Course>();
	ArrayList<Grade> gradeList = new ArrayList<Grade>();

    @FXML
    private Label cgpa;

    @FXML
    private Label course1;

    @FXML
    private Label course2;

    @FXML
    private Label course3;

    @FXML
    private Label course4;

    @FXML
    private Label course5;

    @FXML
    private Label crdHrs1;

    @FXML
    private Label crdHrs2;

    @FXML
    private Label crdHrs3;

    @FXML
    private Label crdHrs4;

    @FXML
    private Label crdHrs5;

    @FXML
    private Label grade1;

    @FXML
    private Label grade2;

    @FXML
    private Label grade3;

    @FXML
    private Label grade4;

    @FXML
    private Label grade5;

    @FXML
    private Label sgpa;

    @FXML
    private Label type1;

    @FXML
    private Label type2;

    @FXML
    private Label type3;

    @FXML
    private Label type4;

    @FXML
    private Label type5;
    
    @FXML
    private Button goBack;
    
    @FXML
    private Button view;
    

    @FXML
    void view(ActionEvent event) {
    	courseList = db.readCourse();
    	gradeList = db.readGrade();
    	
    	course1.setText(courseList.get(0).getName());
    	course2.setText(courseList.get(1).getName());
    	course3.setText(courseList.get(2).getName());
    	course4.setText(courseList.get(3).getName());
    	course5.setText(courseList.get(4).getName());
    	
    	crdHrs1.setText(courseList.get(0).getCreditHrs());
    	crdHrs2.setText(courseList.get(1).getCreditHrs());
    	crdHrs3.setText(courseList.get(2).getCreditHrs());
    	crdHrs4.setText(courseList.get(3).getCreditHrs());
    	crdHrs5.setText(courseList.get(4).getCreditHrs());
    	
    	type1.setText(courseList.get(0).getType());
    	type2.setText(courseList.get(1).getType());
    	type3.setText(courseList.get(2).getType());
    	type4.setText(courseList.get(3).getType());
    	type5.setText(courseList.get(4).getType());
    	
    	grade1.setText(gradeList.get(0).getGrade());
    	grade2.setText(gradeList.get(1).getGrade());
    	grade3.setText(gradeList.get(2).getGrade());
    	grade4.setText(gradeList.get(3).getGrade());
    	grade5.setText(gradeList.get(4).getGrade());
    	
    	sgpa.setText(ac.generateSGPA(courseList,gradeList));
    	cgpa.setText("3.605");
    }
    
    @FXML
    void goBack(ActionEvent event) throws IOException {
    	Parent root =  FXMLLoader.load(getClass().getResource("StudentOptions.fxml"));
    	Stage stage = (Stage) goBack.getScene().getWindow();
    	stage.setScene(new Scene(root,450,580));

    }

}
