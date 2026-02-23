package com.hotel;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class JavaP extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) {
        try {
            scene = new Scene(loadFXML("primary"), 640, 480);

            // Load CSS
            String css = getClass().getResource("/com/hotel/rightsignin.css").toExternalForm();
            scene.getStylesheets().add(css);

            stage.setTitle("Hotel Management");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            System.err.println("Error loading FXML: " + e.getMessage());
            e.printStackTrace();
        }
    }

    static void setRoot(String fxml) {
        try {
            scene.setRoot(loadFXML(fxml));
        } catch (IOException e) {
            System.err.println("Error switching root FXML: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader loader = new FXMLLoader(JavaP.class.getResource("/com/hotel/" + fxml + ".fxml"));
        return loader.load();
    }

    public static void main(String[] args) {
        launch();
    }
}