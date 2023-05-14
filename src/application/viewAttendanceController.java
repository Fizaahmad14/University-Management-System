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
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class viewAttendanceController implements Initializable{

		DBHandler db = new DBHandler();
		Faculty f = new Faculty();
		Attendance a = new Attendance();
	
        @FXML
        private TableColumn<Attendance, String> atten;

        @FXML
        private Button goBack;

        @FXML
        private TableColumn<Attendance, String> name;
        
        @FXML
        private TableColumn<Attendance, String> RollNo;

        @FXML
        private TableView<Attendance> table;

        @FXML
        void goBack(ActionEvent event) throws IOException {
        	Parent root =  FXMLLoader.load(getClass().getResource("StudentOptions.fxml"));
        	Stage stage = (Stage) goBack.getScene().getWindow();
        	stage.setScene(new Scene(root,450,580));
        }

        @Override
        public void initialize(URL arg0, ResourceBundle arg1) {
    		ArrayList<Attendance> attList = f.readAttendance();
        	
    		ObservableList<Attendance> data = FXCollections.observableArrayList(attList);
    		
    		name.setCellValueFactory(new PropertyValueFactory<Attendance,String>("name"));
    		
    		atten.setCellValueFactory(new PropertyValueFactory<Attendance,String>("att"));
    		
    		RollNo.setCellValueFactory(new PropertyValueFactory<Attendance,String>("rollno"));
    		
    		table.setItems(data);

    	}
}
