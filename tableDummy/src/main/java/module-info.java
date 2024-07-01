module com.oop.tabledummy {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.tabledummy to javafx.fxml;
    exports com.oop.tabledummy;
}