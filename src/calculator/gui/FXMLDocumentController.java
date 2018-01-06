/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;


/**
 *
 * @author mohammad
 */
public class FXMLDocumentController implements Initializable {
    private double num1, num2, num3;
    private boolean operatorIsChosen;
    private char myOperator;
    private Text results; 
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
    }
    @FXML
    private void getNum(double clickedNumber ){
        if(operatorIsChosen == true){
            num2 = clickedNumber;
        }else{
            num1 = clickedNumber;
        }
        results.setText(Double.toString(clickedNumber));
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}


//        label.setText("Hello World!");
