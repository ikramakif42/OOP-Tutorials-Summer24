package org.example.martrix_calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    private TextField matrixA10;
    @FXML
    private TextField result10;
    @FXML
    private TextField result00;
    @FXML
    private TextField result11;
    @FXML
    private TextField result01;
    @FXML
    private TextField matrixB01;
    @FXML
    private TextField matrixA01;
    @FXML
    private TextField matrixB00;
    @FXML
    private TextField matrixB11;
    @FXML
    private TextField matrixA00;
    @FXML
    private TextField matrixA11;
    @FXML
    private TextField matrixB10;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    public void handleInverseA(ActionEvent actionEvent) {
    }

    @FXML
    public void handleClear(ActionEvent actionEvent) {
    }

    @FXML
    public void handleMultiply(ActionEvent actionEvent) {
    }

    @FXML
    public void handleDeterminantA(ActionEvent actionEvent) {
    }

    @FXML
    public void handleTransposeA(ActionEvent actionEvent) {
    }

    @FXML
    public void handleAdd(ActionEvent actionEvent) {
    }

    @FXML
    public void handleSubtract(ActionEvent actionEvent) {
    }
}