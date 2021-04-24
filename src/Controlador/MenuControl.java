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
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author glend
 */
public class MenuControl implements Initializable {

    @FXML
    private TableView<Dispositivos> TablaDispositivos;
    @FXML
    private TableColumn colTipo;
    @FXML
    private TableColumn colNombre;
    @FXML
    private TableColumn colCorreo;
    @FXML
    private Button btnCrear;
    @FXML
    private Button btnEliminar;
    @FXML
    private Button btnCargadisp;
    @FXML
    private Button btnCargaAdm;
    @FXML
    private TableColumn colEstado;
private ObservableList<Dispositivos> disp;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        disp = FXCollections.observableArrayList();
        this.colNombre.setCellValueFactory(new PropertyValueFactory("nombre"));
    }    
    
}
