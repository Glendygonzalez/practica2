/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Dispositivos;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/*
 * FXML Controller class 
 * @author glend
 */
public class InicioControl implements Initializable {

    @FXML
    private Tab Dispositivos;
    @FXML
    private AnchorPane tab_dispositivos;
    @FXML
    private TableView<Dispositivos> tbl_dispositivos;
    @FXML
    private TableColumn col_identificador;
    @FXML
    private TableColumn col_tipo;
    @FXML
    private TableColumn  col_nombre;
    @FXML
    private TableColumn col_correo;
    @FXML
    private TableColumn col_estado;
    @FXML
    private Button btn_crear;
    @FXML
    private Button btn_eliminar;
    @FXML
    private Button btn_cargamasiva;
    @FXML
    private Button btn_administracion;
    @FXML
    private Tab tab_acciones;
    @FXML
    private TableView<?> tbl_acciones;
    @FXML
    private Tab tab_reportes;
    @FXML
    private Button btn_exportar;
    @FXML
    private DatePicker dt_fechainicio;
    @FXML
    private DatePicker dt_fechafin;
    @FXML
    private TableView<?> tbl_reportes;
    @FXML
    private TableColumn<?, ?> col_Linea;
    @FXML
    private TableColumn<?, ?> col_accion;
    @FXML
    private TableColumn<?, ?> col_origen;
    @FXML
    private TableColumn<?, ?> col_descripcion;
    @FXML
    private TableColumn<?, ?> col_fecha;
    @FXML
    private TableColumn<?, ?> col_hora;
    @FXML
    private Tab tab_usuarios;
    @FXML
    private TableColumn<?, ?> col_linea;
    @FXML
    private TableColumn<?, ?> col_apellido;
 
    private ObservableList <Dispositivos> dispositivos;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        dispositivos = FXCollections.observableArrayList();
        this.col_identificador.setCellValueFactory(new PropertyValueFactory ("id"));
        this.col_tipo.setCellValueFactory(new PropertyValueFactory ("tipo"));
        this.col_nombre.setCellValueFactory(new PropertyValueFactory ("nombre"));
        this.col_correo.setCellValueFactory(new PropertyValueFactory ("correo_electronico"));
        this.col_estado.setCellValueFactory(new PropertyValueFactory ("estado"));
    }    

    @FXML
    private void D_creardispositivos(ActionEvent event) {
        try {
                 FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/CrearDisp.fxml"));
                 Parent root = loader.load();
                 CrearDispControl controlador = loader.getController();
                 Scene scene = new Scene (root);
                 Stage stage = new Stage ();
                 stage.initModality(Modality.APPLICATION_MODAL);
                 stage.setScene(scene);
                 stage.showAndWait();
                 
             } catch (IOException ex) {
                 Logger.getLogger(UsuarioVistaControl.class.getName()).log(Level.SEVERE, null, ex);
             }
    }

    @FXML
    private void D_eliminardis(ActionEvent event) {
    }

    @FXML
    private void D_cargamasiva(ActionEvent event) {
    }

    @FXML
    private void D_cargamasivadisp(ActionEvent event) {
    }

    @FXML
    private void A_cargamasiva(ActionEvent event) {
    }

    @FXML
    private void R_exportarReporte(ActionEvent event) {
    }

    @FXML
    private void U_crear(ActionEvent event) {
    }

    @FXML
    private void U_eliminar(ActionEvent event) {
    }
    
}
