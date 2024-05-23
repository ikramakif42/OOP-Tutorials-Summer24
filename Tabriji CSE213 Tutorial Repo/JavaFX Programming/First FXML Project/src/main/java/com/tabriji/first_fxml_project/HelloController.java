package com.tabriji.first_fxml_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    public void newButtonOnClick(ActionEvent actionEvent) { // In-order to update the controller using the
                                                            // FXMLManager plugin right-click on the .fxml file and the
                                                            // option to update controller will appear.
    }
}