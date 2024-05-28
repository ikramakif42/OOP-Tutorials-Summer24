module com.oop.mvcdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.mvcdemo to javafx.fxml;
    exports com.oop.mvcdemo;
}