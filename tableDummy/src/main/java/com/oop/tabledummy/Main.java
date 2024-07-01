package com.oop.tabledummy;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class Main
{
    @javafx.fxml.FXML
    private TableView<TableDummy> mainTable;
    @javafx.fxml.FXML
    private TableColumn<TableDummy, Integer> idCol;
    @javafx.fxml.FXML
    private TableColumn<TableDummy, String> nameCol;
    @javafx.fxml.FXML
    private TableColumn<TableDummy, Float> cgpaCol;

    ArrayList<Student> studentList = new ArrayList<>();
    ArrayList<Gradebook> gradeList = new ArrayList<>();
    ArrayList<TableDummy> dummyList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        cgpaCol.setCellValueFactory(new PropertyValueFactory<>("cgpa"));

        // Student Data
        studentList.add(new Student(123, "Zafor"));
        studentList.add(new Student(321, "Afnan"));
        studentList.add(new Student(456, "Labiba"));

        // Gradebook
        gradeList.add(new Gradebook(123, 3.5f));
        gradeList.add(new Gradebook(456, 3.76f));
        gradeList.add(new Gradebook(321, 2.22f));

    }

    @javafx.fxml.FXML
    public void showDataOnClick(ActionEvent actionEvent) {
        for (Student s : studentList) {

            float cgpa = 0f;
            for (Gradebook g : gradeList) {
                if (s.getId() == g.getId()) {
                    cgpa = g.getCgpa();
                }
            }

            dummyList.add(new TableDummy(s.getId(), cgpa, s.getName()));

        }

        mainTable.getItems().addAll(dummyList);

    }
}