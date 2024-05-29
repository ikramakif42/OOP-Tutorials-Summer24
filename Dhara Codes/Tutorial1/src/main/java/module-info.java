module com.cse.oop.tutorial1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cse.oop.tutorial1 to javafx.fxml;
    exports com.cse.oop.tutorial1;
}