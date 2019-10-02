/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package couplingandinterfaces.gui;

import couplingandinterfaces.bll.RenteBeregner;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author jeppjleemoritzled
 */
public class AppController implements Initializable {
    
    @FXML
    private Label lblSlutBelob;
    @FXML
    private TextField txtBelob;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void beregnRente(ActionEvent event) {
        RenteBeregner rb = new RenteBeregner();
        double belob = Double.parseDouble(txtBelob.getText());
        double slutBelob = rb.beregnRente(belob, 1.05);
        lblSlutBelob.setText("" + slutBelob);
    }
    
}
