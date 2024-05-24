module org.example.first_java_project {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens org.example.first_java_project to javafx.fxml;
    exports org.example.first_java_project;
}