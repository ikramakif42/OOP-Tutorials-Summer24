module org.example.martrix_calculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens org.example.martrix_calculator to javafx.fxml;
    exports org.example.martrix_calculator;
}