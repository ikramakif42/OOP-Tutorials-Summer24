package com.oop.tutorialproject.mycalculator;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorController
{
    @javafx.fxml.FXML
    private TextField numberTwoTextfield;
    @javafx.fxml.FXML
    private Label answerLabel;
    @javafx.fxml.FXML
    private TextField numberOneTextfield;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void AddOnClick(ActionEvent actionEvent) {
        String numOne = numberOneTextfield.getText();
        String numTwo = numberTwoTextfield.getText();

        float num1 = Float.parseFloat(numOne);
        float num2 = Float.parseFloat(numTwo);

        float num3 = num1 + num2;

        String numThree = Float.toString(num3);
        answerLabel.setText(numThree);

    }

    @javafx.fxml.FXML
    public void SubOnClick(ActionEvent actionEvent) {
        String numOne = numberOneTextfield.getText();
        String numTwo = numberTwoTextfield.getText();

        float num1 = Float.parseFloat(numOne);
        float num2 = Float.parseFloat(numTwo);

        float num3 = num1 - num2;

        String numThree = Float.toString(num3);
        answerLabel.setText(numThree);

    }

    @javafx.fxml.FXML
    public void DivOnAction(ActionEvent actionEvent) {
        String numOne = numberOneTextfield.getText();
        String numTwo = numberTwoTextfield.getText();

        float num1 = Float.parseFloat(numOne);
        float num2 = Float.parseFloat(numTwo);

        if(num2 == 0){
            answerLabel.setText("Cannot be divided by Zero!");
        }
        else {
            float num3 = num1 / num2;
            String numThree = Float.toString(num3);
            answerLabel.setText(numThree);
        }
    }

    @javafx.fxml.FXML
    public void MulOnClick(ActionEvent actionEvent) {
        String numOne = numberOneTextfield.getText();
        String numTwo = numberTwoTextfield.getText();

        float num1 = Float.parseFloat(numOne);
        float num2 = Float.parseFloat(numTwo);

        float num3 = num1*num2;

        String numThree = Float.toString(num3);
        answerLabel.setText(numThree);
    }

    @javafx.fxml.FXML
    public void ClearOnClick(ActionEvent actionEvent) {
        numberOneTextfield.clear();
        numberTwoTextfield.clear();
        answerLabel.setText("Answer");
    }
}