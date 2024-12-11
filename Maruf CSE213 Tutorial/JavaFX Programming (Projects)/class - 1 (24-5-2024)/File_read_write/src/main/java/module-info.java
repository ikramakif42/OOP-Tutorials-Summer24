module org.example.file_read_write {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.file_read_write to javafx.fxml;
    exports org.example.file_read_write;
}