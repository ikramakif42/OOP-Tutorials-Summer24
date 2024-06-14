package com.oop.tabledemo;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class TableViewController
{
    @javafx.fxml.FXML
    private TableColumn<DummyStudent, String> nameCol;
    @javafx.fxml.FXML
    private TableColumn<DummyStudent, String> majorCol;
    @javafx.fxml.FXML
    private TableColumn<DummyStudent, Float> cgpaCol;
    @javafx.fxml.FXML
    private TableView<DummyStudent> studentTable;
    @javafx.fxml.FXML
    private TextField majorTextField;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private TextField cgpaField;
    @javafx.fxml.FXML
    private TableColumn<DummyStudent, Boolean> scolCol;

    @javafx.fxml.FXML
    public void initialize() {
        nameCol.setCellValueFactory(new PropertyValueFactory<>("fullName"));
        majorCol.setCellValueFactory(new PropertyValueFactory<>("major"));
        cgpaCol.setCellValueFactory(new PropertyValueFactory<>("cgpa"));
        scolCol.setCellValueFactory(new PropertyValueFactory<>("hasScholarship"));

    }

    ArrayList<Student> studentList = new ArrayList<>();
    ArrayList<DummyStudent> dummyStudentList = new ArrayList<>();

    @javafx.fxml.FXML
    public void loadTableData(ActionEvent actionEvent) {
        // Student >> DummyStudent
        for (Student s : studentList) {
            dummyStudentList.add(new DummyStudent(s.getFullName(),
                                                    false,
                                                    s.getCgpa(),
                                                    s.getMajor()));
        }
        // Add DummyStudent to table list
        studentTable.getItems().addAll(dummyStudentList);
    }

    @javafx.fxml.FXML
    public void saveStudentOnClick(ActionEvent actionEvent) {
        // Getting Data From FXML
        String fullName = nameTextField.getText();
        String major = majorTextField.getText();
        Float cgpa = Float.parseFloat(cgpaField.getText());

        // Creating Student Obj
        Student newStudent = new Student(major, fullName, cgpa);

        // Saving/Adding the Obj to ArrayList
        studentList.add(newStudent);
    }
}