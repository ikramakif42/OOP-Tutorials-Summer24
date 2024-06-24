package com.oop.midterm_2111652_sec1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;

public class MidExamSceneController
{
    @FXML
    private TextField scholarshipTextField;
    @FXML
    private TextField studentIdTextField;
    @FXML
    private ComboBox<Integer> sectionComboBox;
    @FXML
    private Label creditLable;
    @FXML
    private ComboBox<String> courseComboBox;
    @FXML
    private TextArea registrationTextArea;
    @FXML
    private CheckBox hasScholarshipCheckBox;

    @FXML
    public void initialize() {
        // ComboBox
        sectionComboBox.getItems().addAll(1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30);

        courseComboBox.getItems().addAll("CSC101", "CSC101L", "MAT102", "CSC204", "CSC204L", "MAT203", "ENG101", "ACN101", "CSC301", "CSC301L");

    }

    // Handel
    Student tempStud;
    ArrayList<RegisteredCourse> registeredCourseList = new ArrayList<>();

    @FXML
    public void proceedToRegisterAndShowRegInfoButtonOnClick(ActionEvent actionEvent) {
        String finalOutput = tempStud.toString() + "\n"
                                + "Registered Courses: " + "\n";
        int creditTaken = 0;
        for (RegisteredCourse c : registeredCourseList) {
            finalOutput = finalOutput + c.toString() + "\n";
            creditTaken = creditTaken + c.getCourseCredit();
        }

        // Min Max Credit
        if (tempStud.isHasScholarship()) {
            if (creditTaken < 12) {
                registrationTextArea.setText("Students with scholarship must take min 12 credits");
                return;
            }
        }
        else {
            if (creditTaken < 6) {
                registrationTextArea.setText("Students must take min 6 credits");
                return;
            }
        }

        if (creditTaken >= 18) {
            registrationTextArea.setText("Student can take a maximum of 18 credits");
        }

        // Bill calculation
        float bill = creditTaken * 6000;
        System.out.println(bill);
        if (tempStud.isHasScholarship()) {
            float factor = 1 - ((float) tempStud.getScholarshipRate() / 100);
            bill = bill * factor;
        }

        finalOutput = finalOutput + "\n" + "Credits enrolled: " + creditTaken + ". Total Payable: " + bill + "TK";
        registrationTextArea.setText(finalOutput);


    }

    @FXML
    public void addARegisteredCourseButtonOnClick(ActionEvent actionEvent) {
        if (registeredCourseList.isEmpty()) {
            // New Student Obj
            int scholarshipAmmout = 0;
            if (hasScholarshipCheckBox.isSelected()) {
                if (scholarshipTextField.getText().equals("0")) {
                    return;
                }
                scholarshipAmmout = Integer.parseInt(scholarshipTextField.getText());
            }

            tempStud = new Student(hasScholarshipCheckBox.isSelected(),
                                    Integer.parseInt(studentIdTextField.getText()),
                                        scholarshipAmmout);
        }

        // Course Obj Creation
        RegisteredCourse newCourse = new RegisteredCourse(Integer.parseInt(creditLable.getText()),
                                                            courseComboBox.getValue(),
                                                                sectionComboBox.getValue());

        registeredCourseList.add(newCourse);

    }

    @FXML
    public void showCourseCredit(ActionEvent actionEvent) {
        if (courseComboBox.getValue().endsWith("L")) {
            creditLable.setText("1");
        }
        else {
            creditLable.setText("3");
        }
    }
}