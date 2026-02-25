package com.hotel;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JavaP extends Application {

    private static Scene scene;

    // Database credentials
    private static final String URL = "jdbc:mysql://localhost:3306/hotel_db";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    @Override
    public void start(Stage stage) throws IOException {

        
        scene = new Scene(loadFXML("primary"));

       
        applyCSS("primary");

        stage.setTitle("Hotel Management System");
        stage.setScene(scene);
        stage.show();
    }

    
    public static Connection connectDatabase() {
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Database Connected Successfully!");
            return conn;
        } catch (SQLException e) {
            System.out.println("Database Connection Failed!");
            e.printStackTrace();
        }
        return null;
    }

    
    
    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
        applyCSS(fxml);
    }

   
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader loader =
                new FXMLLoader(JavaP.class.getResource("/com/hotel/" + fxml + ".fxml"));
        return loader.load();
    }

    
    private static void applyCSS(String fxml) {

        scene.getStylesheets().clear();

        if (fxml.equals("primary")) {
            scene.getStylesheets().add(
                    JavaP.class.getResource("/com/hotel/rightsignin.css")
                            .toExternalForm()
            );
        }
        else if (fxml.equals("secondary")) {
            scene.getStylesheets().add(
                    JavaP.class.getResource("/com/hotel/Adminleft.css")
                            .toExternalForm()
            );
        }
    }

    public static void main(String[] args) {
        launch();
    }
}