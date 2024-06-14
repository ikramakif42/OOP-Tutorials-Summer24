module com.oop.rpc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.rpc to javafx.fxml;
    exports com.oop.rpc;
}