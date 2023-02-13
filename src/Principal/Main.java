package Principal;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	
	
    @Override
    public void start(Stage primaryStage) throws Exception{
        // Cargar la interfaz gr�fica principal desde el archivo FXML
        Parent root = FXMLLoader.load(getClass().getResource("app.fxml"));
        primaryStage.setTitle("Men� Principal");
        primaryStage.setScene(new Scene(root, 520, 400));
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}