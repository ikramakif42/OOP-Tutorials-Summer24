package org.example.calculator;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class HelloController {

    @FXML
    private Label result;
    @FXML
    private TextField secondNumber;
    @FXML
    private TextField firstNumber;
    @FXML
    private TextArea result2;


    @FXML
    public void addOnMouseClicked(ActionEvent actionEvent) {
        String number1 = firstNumber.getText();
        String number2 = secondNumber.getText();

        int result = Integer.parseInt(number1)+Integer.parseInt(number2);

        String print_result = Integer.toString(result);


        result2.setText(print_result);

        Model_2 m2 = new Model_2();
        m2.print_info();


    }
}