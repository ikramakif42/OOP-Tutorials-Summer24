package org.example.advance_calculator;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField display;

    private String currentInput = "";
    private String operator="";
    private double firstOperand=0;


    @FXML
    public void handleButtonAction(ActionEvent event) {
        String buttonText = ((Button) event.getSource()).getText();

        switch (buttonText) {
            case "C":
                clear();
                break;
            case "=":
                calculateResult();
                break;
            case "+":
            case "-":
            case "*":
            case "/":
                handleOperator(buttonText);
                break;
            default:
                handleNumberOrDecimal(buttonText);
                break;


        }
    }

    private void handleOperator(String buttonText){
        if (!currentInput.isEmpty()){
            firstOperand = Double.parseDouble(currentInput);
            operator = buttonText;
            currentInput = "";
            display.setText(firstOperand+" "+operator+" ");

        }

    }

    private void handleNumberOrDecimal(String buttonText){
        if (buttonText.equals(".") && currentInput.contains(".")){
            return;
        }
        currentInput +=buttonText;
        display.setText(currentInput);

    }

    private void calculateResult(){
        if (!currentInput.isEmpty() && !operator.isEmpty()){
            double secondOperand = Double.parseDouble(currentInput);
            double result;
            switch (operator){
                case "+":
                    result = firstOperand + secondOperand;
                    break;
                case "-":
                    result = firstOperand - secondOperand;
                    break;
                case "*":
                    result = firstOperand * secondOperand;
                    break;
                case "/":
                    if (secondOperand!=0){
                        result = firstOperand / secondOperand;
                    }else{
                        display.setText("Error");
                        clear();
                        return;
                    }
                    break;

                default:
                    return;
            }
            display.setText(String.valueOf(result));
            currentInput="";
            operator="";


        }
    }

    private void clear(){
        currentInput="";
        operator="";
        firstOperand=0;
        display.setText("");

    }
}