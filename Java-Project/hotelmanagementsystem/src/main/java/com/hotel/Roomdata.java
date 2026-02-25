package com.hotel;

public class Roomdata {

    private String roomNumber; 
    private String roomType;
    private String status;
    private String price;     

    public Roomdata(String roomNumber, String roomType, String status, String price) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.status = status;
        this.price = price;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public String getStatus() {
        return status;
    }

    public String getPrice() {
        return price;
    }
}