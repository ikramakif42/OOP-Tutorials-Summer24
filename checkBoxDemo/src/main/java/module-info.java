module com.oop.checkboxdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.checkboxdemo to javafx.fxml;
    exports com.oop.checkboxdemo;
}