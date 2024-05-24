package com.tabriji.tutorial_two.my_first_fxml_project;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ProfileManagerViewController
{
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private TextArea textAreaFxId;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void goButtonClicked(ActionEvent actionEvent) {
        textAreaFxId.setText("We learned a lot today!!!");
    }
}