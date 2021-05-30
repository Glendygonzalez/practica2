/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author glend
 */
public class UsuarioVistaControl implements Initializable {

    @FXML
    private TextField Usuario;
    @FXML
    private TextField Contraseña;
    @FXML
    private Button btnaceptar;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO 
        
    }    
//Darle funcionalidad al botón de aceptar
    @FXML
    private void click(ActionEvent event) {
         String user = this.Usuario.getText();
         String contra = this.Contraseña.getText();
         if (user.equals("admin")){
             //Codigo para abrir ventanas en modo aleatorio.
             if (contra.equals("admin")){
              try {
                 FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Inicio.fxml"));
                 Parent root = loader.load();
                 InicioControl controlador = loader.getController();
                 Scene scene = new Scene (root);
                 Stage stage = new Stage ();
                 stage.initModality(Modality.APPLICATION_MODAL);
                 stage.setScene(scene);
                 stage.showAndWait();
                 
             } catch (IOException ex) {
                 Logger.getLogger(UsuarioVistaControl.class.getName()).log(Level.SEVERE, null, ex);
             }
         }else{
             Alert alert = new Alert (Alert.AlertType.INFORMATION);
             alert.setHeaderText(null);
             alert.setTitle("Error");
             alert.setContentText("El Usuario o Contraseña son incorrectos intente de nuevo.");
             alert.showAndWait();
         }
         }else{
             Alert alert = new Alert (Alert.AlertType.INFORMATION);
             alert.setHeaderText(null);
             alert.setTitle("Error");
             alert.setContentText("El Usuario o Contraseña son incorrectos intente de nuevo.");
             alert.showAndWait();
             
         }
         Usuario u = new Usuario (user,contra);
    
}  
    
}