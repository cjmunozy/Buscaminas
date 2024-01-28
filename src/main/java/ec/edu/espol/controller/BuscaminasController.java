/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ec.edu.espol.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

/**
 * FXML Controller class
 *
 * @author crisj
 */
public class BuscaminasController implements Initializable {
    
    int numFilas = 15;
    int numColumnas = 15;
    int numMinas = 20;
    @FXML
    private BorderPane bdpBuscaminas;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        GridPane gpTablero = new GridPane();
        bdpBuscaminas.setCenter(gpTablero);
        gpTablero.setAlignment(Pos.CENTER);
        for (int i = 0; i < numFilas; i++){
            for ( int j = 0; j < numColumnas; j++){
                Button btn = new Button();
                btn.setId(j + "," + i);
                btn.setMinHeight(30);
                btn.setMinWidth(30);
                gpTablero.add(btn, i, j);
                btn.setOnMouseClicked(e -> revelar(e));
            }
        }
    }
    
    private void revelar(MouseEvent e){
        Button btn = (Button) e.getSource();
        String[] coordenada = btn.getId().split(",");
        int fila = Integer.parseInt(coordenada[0]);
        int columna = Integer.parseInt(coordenada[1]);
        System.out.println(fila + " " + columna);
    }
}
