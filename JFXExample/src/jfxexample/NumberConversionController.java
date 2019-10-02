/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jfxexample;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;

/**
 *
 * @author jeppjleemoritzled
 */
public class NumberConversionController implements Initializable {

    private NumberConversionModel ncmodel = new NumberConversionModel();
    private String message = "";
    
    @FXML
    private Label label;
    @FXML
    private TextField txtNumberInput;
    @FXML
    private Button btnCalculate;
    @FXML
    private Label lblResult;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        double txtFieldValue = Double.parseDouble(txtNumberInput.getText());
        double resultInMiles = ncmodel.getMilesFromKilometers(txtFieldValue);
        String resultAsString =
                "" + resultInMiles;
        lblResult.setText(resultAsString);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        TextInputDialog dialog = new TextInputDialog("");

        dialog.setTitle("Text Input Dialog");
        dialog.setContentText("Please enter your name:");

        Optional<String> result = dialog.showAndWait();
        if (result.isPresent()) {
            message = ncmodel.getGreetingsMessage(result.get());
        }
        
    }

}
