package application;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import Buisnesslogic.Faculty;
import Buisnesslogic.Grade;
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

public class markGradeTableController implements Initializable {

	 Faculty f = new Faculty();
	Grade g = new Grade();
	
	 @FXML
	private TableColumn<Grade, String> roll;

    @FXML
    private TableColumn<Grade, String> grade;
    
    @FXML
    private TableColumn<Grade, String> Name;

    @FXML
    private TableColumn<Grade, String> course;

    @FXML
    private Button save;
    
    @FXML
    private Button goBack;

    @FXML
    private TableView<Grade> table;

    @FXML
    void goBack(ActionEvent event) throws IOException {
    	Parent root =  FXMLLoader.load(getClass().getResource("FacultyOptions.fxml"));
    	Stage stage = (Stage) goBack.getScene().getWindow();
    	stage.setScene(new Scene(root,450,580));

    }

    @FXML
    void save(ActionEvent event) throws IOException {
    	g = table.getSelectionModel().getSelectedItem();
		f.markGrade(g);
		
		Alert alertObj = new Alert(Alert.AlertType.INFORMATION);
		alertObj.setHeaderText("GRADED");
		alertObj.setTitle("Successfull");
		alertObj.setContentText("Grade update Successfully!");
		alertObj.showAndWait();
		
		Parent root =  FXMLLoader.load(getClass().getResource("markGradeTable.fxml"));
    	Stage stage = (Stage) save.getScene().getWindow();
    	stage.setScene(new Scene(root,460,580));
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ArrayList<Grade> attList = f.readGrade();
    	
		ObservableList<Grade> data = FXCollections.observableArrayList(attList);
		
		for(int i=0; i<attList.size(); i++)
		{
			System.out.println(attList.get(i).getRollno());
		}
	
		Name.setCellValueFactory(new PropertyValueFactory<Grade,String>("name"));
		
		roll.setCellValueFactory(new PropertyValueFactory<Grade,String>("rollno"));
		
		course.setCellValueFactory(new PropertyValueFactory<Grade,String>("course"));
		
		grade.setCellValueFactory(new PropertyValueFactory<Grade,String>("grade"));
		
		table.setItems(data);
		
	}

}
