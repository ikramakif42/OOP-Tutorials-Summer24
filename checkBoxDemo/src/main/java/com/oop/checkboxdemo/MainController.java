package com.oop.checkboxdemo;

import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController
{
    @javafx.fxml.FXML
    private CheckBox multiGpuCheckBox;
    @javafx.fxml.FXML
    private TextField gpuNameField;
    @javafx.fxml.FXML
    private TextField vramField;
    @javafx.fxml.FXML
    private Label vramLable;
    @javafx.fxml.FXML
    private Label gpuNameLable;

    @javafx.fxml.FXML
    public void initialize() {
        gpuNameField.setVisible(false);
        vramField.setVisible(false);
        gpuNameLable.setVisible(false);
        vramLable.setVisible(false);
    }

    @javafx.fxml.FXML
    public void swichMultiGpuInput(ActionEvent actionEvent) {
        if (multiGpuCheckBox.isSelected()) {
            gpuNameField.setVisible(true);
            vramField.setVisible(true);
            gpuNameLable.setVisible(true);
            vramLable.setVisible(true);
        } else {
            gpuNameField.setVisible(false);
            vramField.setVisible(false);
            gpuNameLable.setVisible(false);
            vramLable.setVisible(false);
        }
    }
}