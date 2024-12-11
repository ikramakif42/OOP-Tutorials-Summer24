module org.example.firstproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.firstproject to javafx.fxml;
    exports org.example.firstproject;
}