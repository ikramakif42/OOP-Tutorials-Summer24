module com.oop.midterm_2111652_sec1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.midterm_2111652_sec1 to javafx.fxml;
    exports com.oop.midterm_2111652_sec1;
}