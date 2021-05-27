package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
//        Locale.setDefault(new Locale("en"));
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/BorderPaneMain.fxml"));
        ResourceBundle bundle = ResourceBundle.getBundle("org.example.bundles.messages");
        loader.setResources(bundle);
        BorderPane borderPane = loader.load();
        Scene scene = new Scene(borderPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle(bundle.getString("title.application"));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}