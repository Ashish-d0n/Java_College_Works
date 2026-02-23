package com.hotel;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.IOException;

public class PrimaryController {

    @FXML
    private ImageView myImageView;

    @FXML
    public void initialize() {
        // Load image from resources
        myImageView.setImage(new Image(getClass().getResourceAsStream("/com/hotel/images/hotel2.jpg")));
    }

    @FXML
    private TextField username;

    @FXML
    private TextField password;

    @FXML 
    private Button LoginBtn;

    @FXML
    private void switchToSecondary() throws IOException {
        JavaP.setRoot("secondary");
    }
}