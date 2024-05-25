module com.oop.tutorialproject.mycalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.tutorialproject.mycalculator to javafx.fxml;
    exports com.oop.tutorialproject.mycalculator;
}