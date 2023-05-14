package application;
import java.io.IOException;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.*;
import javafx.scene.*;


public class Main extends Application {
	private static Stage stg;
	@Override
	public void start(Stage primaryStage) {
		stg = primaryStage;
		try {
			Parent root = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
			Scene scene = new Scene(root,450,580);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void changeScene(String fxml) throws IOException
	{
		Parent pane = FXMLLoader.load(getClass().getResource(fxml));
		stg.getScene().setRoot(pane);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
