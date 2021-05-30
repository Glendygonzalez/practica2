package Controlador;
 
import javafx.application.Application;
import java.io.IOException;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    
    @Override
    public void start (Stage primaryStage){
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("/Vista/UsuarioVista.fxml"));
            Pane ventana = (Pane) loader.load();
            
            Scene scene = new Scene (ventana);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main (String[] args){
        launch (args);
    } 
}    