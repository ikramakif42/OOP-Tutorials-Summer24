package com.oop.mvcdemo;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController
{
    @javafx.fxml.FXML
    private TextField majorLabel;
    @javafx.fxml.FXML
    private TextField cgpaLabel;
    @javafx.fxml.FXML
    private TextField nameLabel;
    @javafx.fxml.FXML
    private Label cgpaOutputLabel;
    @javafx.fxml.FXML
    private Label nameOutputLabel;
    @javafx.fxml.FXML
    private Label majorOutputLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    Student newStudent;

    @javafx.fxml.FXML
    public void saveStudentOnClick(ActionEvent actionEvent) {

        String name = nameLabel.getText();
        String major = majorLabel.getText();
        float cgpa = Float.parseFloat(cgpaLabel.getText());

        newStudent = new Student(name, major, cgpa);

        /* Alt
        Student altStudent = new Student(nameLabel.getText(),
                                        majorLabel.getText(),
                                        Float.parseFloat(cgpaLabel.getText()));
        */
    }

    @javafx.fxml.FXML
    public void showStudentDataOnClick(ActionEvent actionEvent) {
        nameOutputLabel.setText("Name: " + newStudent.getName());
        majorOutputLabel.setText("Major: " + newStudent.getMajor());
        cgpaOutputLabel.setText("CGPA: " + newStudent.getCgpa());
    }
}