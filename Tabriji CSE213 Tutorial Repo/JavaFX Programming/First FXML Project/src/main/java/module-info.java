module com.tabriji.first_fxml_project {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.tabriji.first_fxml_project to javafx.fxml;
    exports com.tabriji.first_fxml_project;
}