package com.oop.studentinfo;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class MainController
{
    @javafx.fxml.FXML
    private ToggleGroup gender;
    @javafx.fxml.FXML
    private Label errorLable;
    @javafx.fxml.FXML
    private TextField idField;
    @javafx.fxml.FXML
    private TextField lastNameField;
    @javafx.fxml.FXML
    private TextField firstNameField;
    @javafx.fxml.FXML
    private ComboBox<String> majorComboBox;
    @javafx.fxml.FXML
    private RadioButton otherRadioButton;
    @javafx.fxml.FXML
    private CheckBox scholarshipCheckBox;
    @javafx.fxml.FXML
    private RadioButton maleRadioButton;
    @javafx.fxml.FXML
    private RadioButton femaleRadioButton;

    @javafx.fxml.FXML
    public void initialize() {
        // ComboBox
        majorComboBox.getItems().addAll("CSE", "CS", "EEE", "BBA");
    }

    @javafx.fxml.FXML
    public void saveOnClick(ActionEvent actionEvent) {
        // TODO Validate
        String fName = firstNameField.getText();
        String lName = lastNameField.getText();
        int id = Integer.parseInt(idField.getText());

        // ComBox
        if (majorComboBox.getSelectionModel().getSelectedItem() == null) {
            errorLable.setText("Please select major from ComoBox");
            return;
        }
        String major = majorComboBox.getValue();
        // Debug System.out.println(major);

        // Radio Button
        String gender = "";
        if (maleRadioButton.isSelected()) gender = "Male";
        else if (femaleRadioButton.isSelected()) gender = "Female";
        else if (otherRadioButton.isSelected()) gender = "Other";
        else {
            errorLable.setText("Please Select a Gender!");
            return;
        }
        // Debug System.out.println(gender);

        // Check Box
        boolean hasScholarship = false;
        if (scholarshipCheckBox.isSelected()) hasScholarship = true;

        Student newStudent = new Student(fName, lName, gender, hasScholarship, major, id);
        System.out.println(newStudent.toString());
     }
}