module com.tabriji.my_profile_project {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.tabriji.my_profile_project to javafx.fxml;
    exports com.tabriji.my_profile_project;
}