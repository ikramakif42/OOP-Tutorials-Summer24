package com.oop.rpc;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Main
{
    @javafx.fxml.FXML
    private Label resultLable;
    @javafx.fxml.FXML
    private Label roundCountLable;
    @javafx.fxml.FXML
    private Label playerChoiceLable;
    @javafx.fxml.FXML
    private Label cpuChoiceLable;
    @javafx.fxml.FXML
    private Label playerScoreLable;
    @javafx.fxml.FXML
    private Label cpuScoreLable;

    @javafx.fxml.FXML
    public void initialize() {
    }

    int roundCount;
    int playerScore;
    int cpuScore;



    private void playRound(String playerChoice) {
        roundCount++;



    }

    @javafx.fxml.FXML
    public void rockButonOnClick(ActionEvent actionEvent) {

        playerChoiceLable.setText("Player: Rock");

    }

    @javafx.fxml.FXML
    public void paperButtonOnClick(ActionEvent actionEvent) {

        playerChoiceLable.setText("Player: Paper");

    }

    @javafx.fxml.FXML
    public void scissorsButtonOnClick(ActionEvent actionEvent) {

        playerChoiceLable.setText("Player: Scissors");

    }
}