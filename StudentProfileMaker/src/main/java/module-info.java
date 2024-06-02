module com.oop.tutorialproject.studentprofilemaker {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.tutorialproject.studentprofilemaker to javafx.fxml;
    exports com.oop.tutorialproject.studentprofilemaker;
}