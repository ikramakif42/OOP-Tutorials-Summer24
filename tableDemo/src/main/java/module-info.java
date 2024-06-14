module com.oop.tabledemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.tabledemo to javafx.fxml;
    exports com.oop.tabledemo;
}