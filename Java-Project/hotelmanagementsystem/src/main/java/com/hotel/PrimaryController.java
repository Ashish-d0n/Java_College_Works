package com.hotel;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PrimaryController {

    @FXML
    private ImageView myImageView;

    @FXML
    private ImageView userImageView;

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Button LoginBtn;

    private Connection connect;
    private PreparedStatement prepare;
    private ResultSet rs;

    @FXML
    public void initialize() {
      
        myImageView.setImage(
                new Image(getClass().getResourceAsStream("/com/hotel/Image/hotel2.jpg"))
        );
        userImageView.setImage(
                new Image(getClass().getResourceAsStream("/com/hotel/Image/user.png"))
        );

        
        LoginBtn.setDefaultButton(true);
    }

    @FXML
    public void login() {
        String user = username.getText();
        String pass = password.getText();
        String sql = "SELECT * FROM admin WHERE username = ? AND password = ?";

        connect = JavaP.connectDatabase();
        if (connect == null) {
            System.out.println("Database not connected!");
            return;
        }

        try {
            prepare = connect.prepareStatement(sql);
            prepare.setString(1, user);
            prepare.setString(2, pass);

            rs = prepare.executeQuery();

            if (rs.next()) {
                
                JavaP.setRoot("secondary");
            } else {
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Login Failed");
                alert.setHeaderText(null);
                alert.setContentText("Incorrect Username or Password");
                alert.showAndWait();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            
            try {
                if (rs != null) rs.close();
                if (prepare != null) prepare.close();
                if (connect != null) connect.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}