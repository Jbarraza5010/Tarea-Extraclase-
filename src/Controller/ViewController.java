/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controller;

import Model.Div;
import Model.Multi;
import Model.Persona;
import Model.Resta;
import Model.Suma;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * FXML Controller class
 *
 * @author jbarr
 */
public class ViewController implements Initializable {

    @FXML
    private Button btnSumar;
    @FXML
    private TextField Resultado;
    @FXML
    private ChoiceBox<Persona> Persona1;
    @FXML
    private ChoiceBox<Persona> Persona2;
    @FXML
    private Button NuevaPersona;
    @FXML
    private ChoiceBox<String> txtProvincia;
    private String[] provincias = {"San Jose", "Alajuela", "Heredia", "Cartago", "Guanacatse", "Puntarenas", "Limón"};
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtEdad;
    @FXML
    private Button btnResta;
    @FXML
    private Button btnMulti;
    @FXML
    private Button btnDiv;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       // TODO
       txtProvincia.getItems().addAll(provincias);
    }    

    @FXML
    private void suma(ActionEvent event) {
        
        int edad1 = Integer.parseInt(this.txtEdad.getText());
        int edad2 = Integer.parseInt(this.txtEdad.getText());
        
        Suma s = new Suma(edad1, edad2);
        int resultado = s.suma();
        
        this.Resultado.setText(resultado + "");
    }

    @FXML
    private void AgregarPersona(ActionEvent event) {
    
        String nombre = this.txtNombre.getText();
        String provincia = this.txtProvincia.getValue();
        int edad = Integer.parseInt(this.txtEdad.getText());
        int cont = 0;
        
        Persona p = new Persona(nombre, provincia, edad);
       
        if (cont <= 4){
            this.Persona1.setItems((ObservableList<Persona>) txtEdad);
            this.Persona2.setItems((ObservableList<Persona>) txtEdad);
            cont ++;
        }
        else{
            System.out.println("Hay mas de 4 personas");
        }
        }

    @FXML
    private void resta(ActionEvent event) {
        int edad1 = Integer.parseInt(this.txtEdad.getText());
        int edad2 = Integer.parseInt(this.txtEdad.getText());
        
        Resta r = new Resta(edad1, edad2);
        int resultado = r.resta(edad1, edad2);
        
        this.Resultado.setText(resultado + "");
    }

    @FXML
    private void multi(ActionEvent event) {
        int edad1 = Integer.parseInt(this.txtEdad.getText());
        int edad2 = Integer.parseInt(this.txtEdad.getText());
        
        Multi m = new Multi(edad1, edad2);
        int resultado = m.multi(edad1, edad2);
        
        this.Resultado.setText(resultado + "");
    }

    @FXML
    private void div(ActionEvent event) {
        int edad1 = Integer.parseInt(this.txtEdad.getText());
        int edad2 = Integer.parseInt(this.txtEdad.getText());
        
        Div d = new Div(edad1, edad2);
        int resultado = d.div(edad1, edad2);
        
        this.Resultado.setText(resultado + "");
    }
        
    }
    
    

