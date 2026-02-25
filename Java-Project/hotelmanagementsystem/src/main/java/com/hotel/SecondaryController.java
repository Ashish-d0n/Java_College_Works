package com.hotel;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SecondaryController {

    
    @FXML private TextField Room;
    @FXML private TextField Price;
    @FXML private ComboBox<String> Roomtype;
    @FXML private ComboBox<String> Status;

    
    @FXML private TableView<Roomdata> table;
    @FXML private TableColumn<Roomdata, String> Roomno;
    @FXML private TableColumn<Roomdata, String> RoomT;
    @FXML private TableColumn<Roomdata, String> Stat;
    @FXML private TableColumn<Roomdata, String> Money;

    private Connection connect;
    private PreparedStatement prepare;
    private ResultSet rs;

    private ObservableList<Roomdata> roomList = FXCollections.observableArrayList();

   
    @FXML
    private void initialize() {

        
        Roomtype.setItems(FXCollections.observableArrayList("Single", "Double", "Suite"));
        Status.setItems(FXCollections.observableArrayList("Available", "Occupied"));
        Roomtype.setPromptText("Choose Room Type");
        Status.setPromptText("Choose Status");

        
        Roomno.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getRoomNumber()));
        RoomT.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getRoomType()));
        Stat.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getStatus()));
        Money.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getPrice()));

        
        displayTableData();

        
        table.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal != null) {
                Room.setText(newVal.getRoomNumber());
                Roomtype.setValue(newVal.getRoomType());
                Status.setValue(newVal.getStatus());
                Price.setText(newVal.getPrice());
            }
        });
    }

    
    @FXML
    public void dashboardAdd() {
        if (Room.getText().isEmpty() || Roomtype.getValue() == null || Status.getValue() == null || Price.getText().isEmpty()) {
            showAlert(AlertType.ERROR, "Please fill all fields");
            return;
        }

        String sql = "INSERT INTO room(roomNumber, type, status, price) VALUES (?, ?, ?, ?)";
        connect = JavaP.connectDatabase();

        try {
            prepare = connect.prepareStatement(sql);
            prepare.setString(1, Room.getText());
            prepare.setString(2, Roomtype.getValue());
            prepare.setString(3, Status.getValue());
            prepare.setString(4, Price.getText()); 
            int rows = prepare.executeUpdate();

            if (rows > 0) {
                showAlert(AlertType.INFORMATION, "Room Added Successfully");
                clearFields();
                displayTableData();  
            }

        } catch (Exception e) {
            e.printStackTrace();
            showAlert(AlertType.ERROR, "Error adding room: " + e.getMessage());
        }
    }

  
    @FXML
    public void updateRoom() {
        Roomdata selected = table.getSelectionModel().getSelectedItem();
        if (selected == null) {
            showAlert(AlertType.ERROR, "Select a row to update!");
            return;
        }

        String sql = "UPDATE room SET type=?, status=?, price=? WHERE roomNumber=?";
        connect = JavaP.connectDatabase();

        try {
            prepare = connect.prepareStatement(sql);
            prepare.setString(1, Roomtype.getValue());
            prepare.setString(2, Status.getValue());
            prepare.setString(3, Price.getText()); 
            prepare.setString(4, selected.getRoomNumber());
            int rows = prepare.executeUpdate();

            if (rows > 0) {
                showAlert(AlertType.INFORMATION, "Room Updated Successfully");
                clearFields();
                displayTableData(); 
            }

        } catch (Exception e) {
            e.printStackTrace();
            showAlert(AlertType.ERROR, "Error updating room: " + e.getMessage());
        }
    }

    
    @FXML
    public void deleteRoom() {
        Roomdata selected = table.getSelectionModel().getSelectedItem();
        if (selected == null) {
            showAlert(AlertType.ERROR, "Select a row to delete!");
            return;
        }

        String sql = "DELETE FROM room WHERE roomNumber=?";
        connect = JavaP.connectDatabase();

        try {
            prepare = connect.prepareStatement(sql);
            prepare.setString(1, selected.getRoomNumber());
            int rows = prepare.executeUpdate();

            if (rows > 0) {
                showAlert(AlertType.INFORMATION, "Room Deleted Successfully");
                clearFields();
                displayTableData();  
            }

        } catch (Exception e) {
            e.printStackTrace();
            showAlert(AlertType.ERROR, "Error deleting room: " + e.getMessage());
        }
    }

    
    private void displayTableData() {
        roomList.clear();
        String sql = "SELECT * FROM room";
        connect = JavaP.connectDatabase();

        try {
            prepare = connect.prepareStatement(sql);
            rs = prepare.executeQuery();

            while (rs.next()) {
                roomList.add(new Roomdata(
                        rs.getString("roomNumber"),
                        rs.getString("type"),
                        rs.getString("status"),
                        rs.getString("price") 
                ));
            }

            table.setItems(roomList); 

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

   
    @FXML
    public void clearFields() {
        Room.clear();
        Price.clear();
        Roomtype.setValue(null);
        Status.setValue(null);
        table.getSelectionModel().clearSelection();
    }

    
    private void showAlert(AlertType type, String message) {
        Alert alert = new Alert(type);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @FXML
    private void handleSignOut() {
    try {
        JavaP.setRoot("primary");
    } catch (Exception e) {
        e.printStackTrace();
    }
    }
}