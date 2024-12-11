module org.example.filereadwrite {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;


    opens org.example.filereadwrite to javafx.fxml;
    exports org.example.filereadwrite;
}