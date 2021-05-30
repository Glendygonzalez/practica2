/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Dispositivos;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 * @author glend
 */
public class CrearDispControl implements Initializable {

    @FXML
    private ComboBox op_disp;
    @FXML
    private TextField txt_correo;
    @FXML
    private TextField tx_nombre;
    @FXML
    private CheckBox chec_visible;
    @FXML
    private CheckBox chec_encendido;
    @FXML
    private TextField txt_numero;
    @FXML
    private Button btn_guardar;
    @FXML
    private Button btn_cancelar;
 
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO  
        ObservableList<String> list = FXCollections.observableArrayList("Computadora Portatil","Tablet","SmartWatch","Smarphone","Auriculares Inalambricos");
        op_disp.setItems(list);
    } 
    

    @FXML
    private void Guardar(ActionEvent event) {
        String nombre = this.tx_nombre.getText();
        String correo = this.txt_correo.getText();
        
        
        Dispositivos d = new Dispositivos ("1","aparato",nombre,correo,"activo");
        
    }

    @FXML
    private void cancelar(ActionEvent event) {
    }
    
}

