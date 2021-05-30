/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

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
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author glend
 */
public class VentanaErrorControl implements Initializable {

    @FXML
    private Button ok;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ok(ActionEvent event) {
        try {
                 FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/UsuarioVista.fxml"));
                 Parent root = loader.load();
                 UsuarioVistaControl controlador = loader.getController();
                 Scene scene = new Scene (root);
                 Stage stage = new Stage ();
                 stage.initModality(Modality.APPLICATION_MODAL);
                 stage.setScene(scene);
                 stage.showAndWait();
                 
             } catch (IOException ex) {
                 Logger.getLogger(VentanaErrorControl.class.getName()).log(Level.SEVERE, null, ex);
             }
    }
    
} 

