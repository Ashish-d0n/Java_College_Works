package com.hotel;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;

import java.io.IOException;

public class SecondaryController {

    @FXML 
    private ImageView balmond;

    @FXML
    private ImageView signo;

    @FXML
    private Button Signoutbtn;

    @FXML
    private ChoiceBox<String> Roomtype;

    @FXML
    private ChoiceBox<String> Status;

    @FXML
    private AnchorPane Dmlup;

    @FXML
    private Button Addbtn;

    @FXML
    private Button Clear;

    @FXML
    private AnchorPane Dashboard;

    @FXML
    private Button Delete;

    @FXML
    private TableView<?> table;

    @FXML
    private TableColumn<?, ?> Money;

    @FXML
    private TableColumn<?, ?> RoomT;

    @FXML
    private TableColumn<?, ?> Roomno;

    @FXML
    private TableColumn<?, ?> Stat;

    @FXML
    private TextField Price;

    @FXML
    private TextField Room;

    @FXML
    private Button Updatebtn;

    @FXML
    private void initialize() {
        Roomtype.getItems().addAll("Single", "Double", "Suite");
        Status.getItems().addAll("Available", "Occupied");

       
    }

    @FXML
    private void switchToSecondary() throws IOException {
        JavaP.setRoot("secondary");
    }
}