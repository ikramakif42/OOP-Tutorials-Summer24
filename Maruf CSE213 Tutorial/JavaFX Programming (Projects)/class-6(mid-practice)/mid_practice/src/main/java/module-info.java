module org.example.mid_practice {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens org.example.mid_practice to javafx.fxml;
    exports org.example.mid_practice;
}