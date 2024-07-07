module com.oop.summermid {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.summermid to javafx.fxml;
    exports com.oop.summermid;
}