module com.oop.studentinfo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.studentinfo to javafx.fxml;
    exports com.oop.studentinfo;
}