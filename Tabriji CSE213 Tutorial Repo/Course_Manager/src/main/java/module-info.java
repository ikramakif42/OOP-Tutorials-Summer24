module com.tabriji.mainpackage.course_manager {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.tabriji.mainpackage.course_manager to javafx.fxml;
    exports com.tabriji.mainpackage.course_manager;
}