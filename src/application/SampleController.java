package application;

import java.io.IOException;

import Buisnesslogic.Student;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import studentAdmission.AcademicOffice;
import studentAdmission.Admission;

public class SampleController 
{
	public SampleController() {
		super();
	}
	Admission addForm = new Admission();
	Student s = new Student();
	AcademicOffice ac = new AcademicOffice();
    @FXML
    private TextArea address;

    @FXML
    private TextField cnic;
 
	@FXML
    private TextField email;

    @FXML
    private TextField fatherCnic;

    @FXML
    private TextField fatherEmail;

    @FXML
    private TextField fatherName;

    @FXML
    private TextField fatherPhoneNo;

    @FXML
    private SplitMenuButton gender;

    @FXML
    private TextField name;

	@FXML
    private TextField phoneNo;

    @FXML
    private SplitMenuButton preference;
    
    @FXML
    private SplitMenuButton qaulification;
    
    @FXML
    private MenuItem Alevel;

    @FXML
    private MenuItem BSAI;

    @FXML
    private MenuItem BSCS;

    @FXML
    private MenuItem BSCYS;

    @FXML
    private MenuItem BSSE;

    @FXML
    private MenuItem Female;

    @FXML
    private MenuItem Intermediate;

    @FXML
    private Button submit;
    
    @FXML
    void Alevel(ActionEvent event) {
    	qaulification.setText("A/OLevels");

    }

    @FXML
    void ai(ActionEvent event) {
    	preference.setText("BSAI");
    }

    @FXML
    void cs(ActionEvent event) {
    	preference.setText("BSCS");
    }

    @FXML
    void cys(ActionEvent event) {
    	preference.setText("BSCYS");
    }

    @FXML
    void female(ActionEvent event) {
    	gender.setText("Female");
    }

    @FXML
    void inter(ActionEvent event) {
    	qaulification.setText("Inter");
    }

    @FXML
    void male(ActionEvent event) {
    	gender.setText("Male");
    }

    @FXML
    void other(ActionEvent event) {
    	gender.setText("Other");
    }

    @FXML
    void se(ActionEvent event) {
    	preference.setText("BSSE");
    }

		@FXML
	    void Submit(ActionEvent event) throws IOException {
			addForm.setAdmissionForm("23",name.getText(), cnic.getText(), email.getText(),phoneNo.getText(), preference.getText(),
									 fatherName.getText(), fatherCnic.getText(), 
									 address.getText());
			addForm.setFall2023("23",name.getText(), cnic.getText(), email.getText(),phoneNo.getText(), preference.getText(),
					 fatherName.getText(), fatherCnic.getText(), 
					 address.getText());
			/*addForm.setAdmissionForm("23", "Fiza Ahmad", "3650259070334","fizaahmad@gmail.com","03090732287",  "BS(CS)",  "Sher Ahmad Zafar", "3650259070335", "G10-ISB");
			addForm.setAdmissionForm("23", "Sania Sajjad", "3650259070335","saniasajjad@gmail.com","03090732288",  "BS(CS)",  "Sajjad", "3650259070336", "G11-ISB");
			addForm.setAdmissionForm("23", "Alishba Nadeem", "3650259070337","alishbanadeem@gmail.com","03090732289",  "BS(CS)",  "Nadeem", "365025907038", "G13-ISB");
			addForm.setAdmissionForm("23", "Momina Minahil", "3650259070339","mominaminahil@gmail.com","03090732280",  "BS(CS)",  "Safdar", "365025907040", "D12-ISB");
			addForm.setAdmissionForm("23", "Hashir Abbasi", "3650259070341","hashirabbasi@gmail.com","03090732281",  "BS(CS)",  "Shezad", "365025907042", "F6-ISB");
			addForm.setAdmissionForm("23", "Abdullah Saqib", "3650259070343","abdullahsaqib@gmail.com","03090732282",  "BS(CS)",  "Saqib", "365025907044", "F7-ISB");
			addForm.setAdmissionForm("23", "Rayed Saeed", "3650259070345","rayedsaeed@gmail.com","03090732283",  "BS(CS)",  "Saeed", "365025907046", "I8-ISB");
			addForm.setAdmissionForm("23", "Umar Waheed", "3650259070347","umarwaheed@gmail.com","03090732284",  "BS(CS)",  "Waheed", "365025907048", "E11-ISB");
			addForm.setAdmissionForm("23", "Abdul Muiz", "3650259070349","abdulmuiz@gmail.com","03090732285",  "BS(CS)",  "Rehman", "365025907050", "G6-ISB");
			addForm.setAdmissionForm("23", "Fatima Ahmad", "3650259070351","fatimaahmad@gmail.com","03090732286",  "BS(CS)",  "Ahmad", "365025907052", "F8-ISB");
			addForm.setAdmissionForm("23", "Ayesha Nadeem", "3650259070353","ayeshanadeem@gmail.com","03090732290",  "BS(CS)",  "Nadeem", "365025907054", "F10-ISB");
			addForm.setAdmissionForm("23", "Maryam Majeed", "3650259070355","maryammajeed@gmail.com","03090732291",  "BS(CS)",  "Majeed", "365025907056", "F11-ISB");*/
			ac.assignStudentIDs();
			ac.assignFacultyIDs();
	    	Parent root =  FXMLLoader.load(getClass().getResource("success2.fxml"));
	    	Stage stage = (Stage) submit.getScene().getWindow();
	    	stage.setScene(new Scene(root,450,580));
	    }
}
