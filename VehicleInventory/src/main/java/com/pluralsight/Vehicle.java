package com.pluralsight;

public class Vehicle {
    // Variable Introductions -----------------------------------------------------------------------------------------
    private long vehicleID;
    private String makeModel;
    private String color;
    private int odometerReading;
    private float price;

    // Constructor Setup ----------------------------------------------------------------------------------------------
    public Vehicle () {
        vehicleID = 0;
        makeModel = "";
        color = "";
        odometerReading = 0;
        price = 0;
    }

    // Overloaded Constructor Init ------------------------------------------------------------------------------------
    public Vehicle (long vehicleID, String makeModel, String color, int odometerReading, float price) {
        this.vehicleID = vehicleID;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;
    }

    //Setters ---------------------------------------------------------------------------------------------------------
    public void setVehicleID(long vehicleID) {
        this.vehicleID = vehicleID;
    }
    public void setMakeModel (String makeModel) {
        this.makeModel = makeModel;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    //Getters ---------------------------------------------------------------------------------------------------------
    public long getVehicleID() {
        return vehicleID;
    }
    public String getMakeModel() {
        return makeModel;
    }
    public String getColor() {
        return color;
    }
    public int getOdometerReading() {
        return odometerReading;
    }
    public float getPrice() {
        return price;
    }
}
