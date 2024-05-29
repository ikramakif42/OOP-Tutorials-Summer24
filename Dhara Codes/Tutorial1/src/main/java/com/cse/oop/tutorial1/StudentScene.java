package com.cse.oop.tutorial1;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class StudentScene
{
    @javafx.fxml.FXML
    private TextField AgeTextField;
    @javafx.fxml.FXML
    private ComboBox<Integer> StudentCB;
    @javafx.fxml.FXML
    private TextField NameTextField;
    @javafx.fxml.FXML
    private Label detailsLabel;
    @javafx.fxml.FXML
    private TextField IDTextField;
    private ArrayList<Student> student = new ArrayList<>();
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void AddButtonOnClick(ActionEvent actionEvent) {
        int id = Integer.parseInt(IDTextField.getText());
        int age = Integer.parseInt(AgeTextField.getText());
        String name = NameTextField.getText();
        Student newStudent = new Student(id, name, age);

        StudentCB.getItems().add(id);
        student.add(newStudent);


    }

    @javafx.fxml.FXML
    public void viewButtonOnClick(ActionEvent actionEvent) {
        int selectedID = StudentCB.getValue();

        for (Student student: student){
            if (student.getID()== selectedID){
                detailsLabel.setText(student.toString());
            break;
            }
        }

    }
}