package com.tabriji.my_profile_project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("my_project_profile-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Profile Manager!");
        stage.setScene(scene);
        stage.show();
    }
}