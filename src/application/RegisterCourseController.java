package application;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import Buisnesslogic.*;
import database.DBHandler;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import studentAdmission.AcademicOffice;

public class RegisterCourseController implements Initializable {

	AcademicOffice a = new AcademicOffice();
	Student s = new Student();
	DBHandler db = new DBHandler();
	Course c = new Course();
    @FXML
    private TableColumn<Course, String> ch;

    @FXML
    private TableColumn<Course, String> course;

    @FXML
    private Button goBack;

    @FXML
    private TableColumn<Course, String> reg;

    @FXML
    private Button save;

    @FXML
    private TableView<Course> table;

    @FXML
    private TableColumn<Course, String> type;

    @FXML
    void goBack(ActionEvent event) throws IOException {
    	Parent root =  FXMLLoader.load(getClass().getResource("StudentOptions.fxml"));
    	Stage stage = (Stage) goBack.getScene().getWindow();
    	stage.setScene(new Scene(root,450,580));
    }

    @FXML
    void save(ActionEvent event) throws IOException {
    	c = table.getSelectionModel().getSelectedItem();
		s.registerCourses(c);
		
		Alert alertObj = new Alert(Alert.AlertType.INFORMATION);
		alertObj.setHeaderText("REGISTERED");
		alertObj.setTitle("Successfull");
		alertObj.setContentText("Course has been registered Successfully!");
		alertObj.showAndWait();
		
		Parent root =  FXMLLoader.load(getClass().getResource("registerCourse.fxml"));
    	Stage stage = (Stage) save.getScene().getWindow();
    	stage.setScene(new Scene(root,460,580));

    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		ArrayList<Course> courseList = a.getCoursesDB();
    	
		ObservableList<Course> data = FXCollections.observableArrayList(courseList);
		
		course.setCellValueFactory(new PropertyValueFactory<Course,String>("name"));
		
		ch.setCellValueFactory(new PropertyValueFactory<Course,String>("creditHrs"));
		
		type.setCellValueFactory(new PropertyValueFactory<Course,String>("type"));
		
		reg.setCellValueFactory(new PropertyValueFactory<Course,String>("register"));
		
		table.setItems(data);
		
	}

}
