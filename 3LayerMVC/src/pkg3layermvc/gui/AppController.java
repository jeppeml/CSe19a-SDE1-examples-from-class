/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3layermvc.gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import pkg3layermvc.be.Inmate;
import pkg3layermvc.bll.BLLManager;

/**
 *
 * @author jeppjleemoritzled
 */
public class AppController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private Button button;
    
    @FXML
    private ListView<Inmate> inmateList;
    
    private AppModel model = new AppModel();
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
        model.fetchData();
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        inmateList.setItems(model.getInmateList());
    }    
    
}
