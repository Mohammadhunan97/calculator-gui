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
import javafx.scene.control.*;

/**
 *
 * @author mohammad
 */
public class FXMLDocumentController implements Initializable {
    public double num1, num2, num3;
    public String tempNum1 = "";
    public String tempNum2 = "";
    public String tempNum3 = "";
    public boolean operatorIsChosen = false;
    public String myOperator;
    public Text results; 
    
    
    @FXML
    private void handleClear(ActionEvent event) {
        num1 = 0;
        num2 = 0;
        num3 = 0;
        tempNum1 = "";
        tempNum2 = "";
        tempNum3 = "";
        operatorIsChosen = false;
        myOperator = "";
        results.setText("");
    }
    @FXML
    private void handleGetNum(ActionEvent event){
        Button button = (Button) event.getSource();
        String type = button.getText();
        
        if(operatorIsChosen == false) {
            tempNum1 += type;
            results.setText(tempNum1);
        }else{
            tempNum2 += type;
            num2 = Double.parseDouble(tempNum2);
            results.setText(tempNum1 + myOperator + tempNum2);
        }
        
    }
    @FXML 
    private void handleOperator(ActionEvent event){
        /* for this method */
        Button button = (Button) event.getSource();
        String type = button.getText();
        
        /* for operation */
        operatorIsChosen = true;
        myOperator = type;
                
        /* for users gui*/  
        num1 = Double.parseDouble(tempNum1);
        results.setText(tempNum1 + myOperator);
    }
    @FXML
    private void handleSolution(ActionEvent event){
        
        if(myOperator.equals("+")){
            num3 = num1 + num2;
            results.setText(Double.toString(num3));
            
        }else if(myOperator.equals("-")){
            num3 = num1 - num2;
            results.setText(Double.toString(num3));
            
        }else if(myOperator.equals("*")){
            num3 = num1 * num2;
            results.setText(Double.toString(num3));
            
        }else if(myOperator.equals("/")){
            num3 = num1 / num2;
            results.setText(Double.toString(num3));           
        }else{
            System.out.println("wtf");
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       results.setText(" ");
    }    
    
}


//        label.setText("Hello World!");
