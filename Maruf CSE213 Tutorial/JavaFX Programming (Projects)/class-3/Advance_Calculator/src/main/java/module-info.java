module org.example.advance_calculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires java.desktop;

    opens org.example.advance_calculator to javafx.fxml;
    exports org.example.advance_calculator;
}