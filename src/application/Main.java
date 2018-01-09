package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("FXMain.fxml"));
			Scene scene = new Scene(root, 750, 525);
			scene.getStylesheets().add("/resources/css/application.css");
			primaryStage.setResizable(false);
			primaryStage.getIcons().add(new Image("/resources/images/icon.png"));
			primaryStage.setTitle("Password Generator");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
