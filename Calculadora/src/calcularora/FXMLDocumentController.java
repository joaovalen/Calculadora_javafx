/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

/**
 *
 * @author 05200246
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button button_zero;
    @FXML
    private Button button_one;
    @FXML
    private Button button_two;
    @FXML
    private Button button_three;
    @FXML
    private Button button_four;
    @FXML
    private Button button_five;
    @FXML
    private Button button_six;
    @FXML 
    private Button button_seven;
    @FXML
    private Button button_eight;
    @FXML
    private Button button_nine;
    
    @FXML
    private Button button_dot;
    @FXML
    private Button button_result;
    @FXML
    private Button button_divide;
    @FXML
    private Button button_minus;
    @FXML
    private Button button_times;
    @FXML
    private Button button_plus;
   
    @FXML
    private TextField tela_first_number;
    @FXML
    private TextField tela_second_number;
    @FXML
    private TextField tela_operator;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       tela_operator.setText("");
       tela_first_number.setEditable(false);
       tela_second_number.setEditable(false);
       tela_operator.setEditable(false);
       
    }    

    @FXML
    private void button_zero_pressed(ActionEvent event) {
        if (tela_operator.getText().equals("")){
            tela_first_number.setText(tela_first_number.getText() + "0");
        }else{
            tela_second_number.setText(tela_second_number.getText() + "0");
        }
    }
    
    @FXML
    private void button_one_pressed(ActionEvent event) {
        if (tela_operator.getText().equals("")){
            tela_first_number.setText(tela_first_number.getText() + "1");
        }else{
            tela_second_number.setText(tela_second_number.getText() + "1");
        }
    }

    @FXML
    private void button_two_pressed(ActionEvent event) {
        if (tela_operator.getText().equals("")){
            tela_first_number.setText(tela_first_number.getText() + "2");
        }else{
            tela_second_number.setText(tela_second_number.getText() + "2");
        }
    }

    @FXML
    private void button_three_pressed(ActionEvent event) {
        if (tela_operator.getText().equals("")){
            tela_first_number.setText(tela_first_number.getText() + "3");
        }else{
            tela_second_number.setText(tela_second_number.getText() + "3");
        }
    }
    
    @FXML
    private void button_four_pressed(ActionEvent event) {
        if (tela_operator.getText().equals("")){
            tela_first_number.setText(tela_first_number.getText() + "4");
        }else{
            tela_second_number.setText(tela_second_number.getText() + "4");
        }
    }

    @FXML
    private void button_five_pressed(ActionEvent event) {
        if (tela_operator.getText().equals("")){
            tela_first_number.setText(tela_first_number.getText() + "5");
        }else{
            tela_second_number.setText(tela_second_number.getText() + "5");
        }
    }

    @FXML
    private void button_six_pressed(ActionEvent event) {
        if (tela_operator.getText().equals("")){
            tela_first_number.setText(tela_first_number.getText() + "6");
        }else{
            tela_second_number.setText(tela_second_number.getText() + "6");
        }
    }
 
    @FXML
    private void button_seven_pressed(ActionEvent event) {
        if (tela_operator.getText().equals("")){
            tela_first_number.setText(tela_first_number.getText() + "7");
        }else{
            tela_second_number.setText(tela_second_number.getText() + "7");
        }
    }
    
    @FXML
    private void button_eight_pressed(ActionEvent event) {
        if (tela_operator.getText().equals("")){
            tela_first_number.setText(tela_first_number.getText() + "8");
        }else{
            tela_second_number.setText(tela_second_number.getText() + "8");
        }
    }

    @FXML
    private void button_nine_pressed(ActionEvent event) {
        if (tela_operator.getText().equals("")){
            tela_first_number.setText(tela_first_number.getText() + "9");
        }else{
            tela_second_number.setText(tela_second_number.getText() + "9");
        }
    }

    @FXML
    private void button_dot_pressed(ActionEvent event) {
        if (tela_operator.getText().equals("")){
            if (tela_first_number.getText().contains(".")){
            }else{
                tela_first_number.setText(tela_first_number.getText() + ".");
            }
        }else{
            if (tela_second_number.getText().contains(".")){
            }else{
                tela_second_number.setText(tela_second_number.getText() + ".");
            }
        }
    }

    
    
    @FXML
    private void button_result_pressed(ActionEvent event) {
        float result = operation();
        tela_operator.setText("");
        tela_first_number.setText("");
        tela_second_number.setText("");
        show_result(result);
    }

    @FXML
    private void button_divide_pressed(ActionEvent event) {
        if (tela_operator.getText().equals("")){
            tela_operator.setText("/");
        }
    }

    @FXML
    private void button_minus_pressed(ActionEvent event) {
        if (tela_operator.getText().equals("")){
            tela_operator.setText("-");
        }
    }

    @FXML
    private void button_times_pressed(ActionEvent event) {
        if (tela_operator.getText().equals("")){
            tela_operator.setText("x");
        }
    }

    @FXML
    private void button_plus_pressed(ActionEvent event) {
        if (tela_operator.getText().equals("")){
            tela_operator.setText("+");
        }
    }
    
    private float operation(){
        String operator = tela_operator.getText();
        Float result;
        
        switch (operator){
            case "+": 
                result = plus_operation();
                break;
            case "-":
                result = minus_operation();
                break;
            case "x":
                result = times_operation();
                break;
            case "/": 
                result = divide_operation();
                break;
            default:
                result = null;
                break;
        }
        return result;
    }
    
    private float plus_operation(){
        float first_number = Float.parseFloat((tela_first_number.getText()));
        float second_number = Float.parseFloat((tela_second_number.getText()));
        
        float result = first_number + second_number;
        return result;
    }
    
    private float minus_operation(){
        float first_number = Float.parseFloat((tela_first_number.getText()));
        float second_number = Float.parseFloat((tela_second_number.getText()));
        
        float result = first_number - second_number;
        return result;
    }
    
    private float times_operation(){
        float first_number = Float.parseFloat((tela_first_number.getText()));
        float second_number = Float.parseFloat((tela_second_number.getText()));
        
        float result = first_number * second_number;
        return result;
    }
    
    private float divide_operation(){
        float first_number = Float.parseFloat((tela_first_number.getText()));
        float second_number = Float.parseFloat((tela_second_number.getText()));
        
        float result = first_number / second_number;
        return result;
    }
    
    private void show_result(Float result) {
        Alert dialogoInfo = new Alert(Alert.AlertType.INFORMATION);
        dialogoInfo.setTitle("Diálogo de informação");
        dialogoInfo.setHeaderText("O seu resultado é " + result);
        dialogoInfo.setContentText("Brigadão por usar a calculadora");
        dialogoInfo.showAndWait();
    }
    

}

