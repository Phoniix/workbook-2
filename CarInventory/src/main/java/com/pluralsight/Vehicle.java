package com.pluralsight;

public class Vehicle {

    //Variable Introductions ------------------------------------------------------------------------------------------
    private long id = 0;
    private String makeModel = "";
    private String color = "";
    private int odometerReading = 0;
    private float price = 0;


    public static void main(String[] args) {
        Vehicle seanCar = new Vehicle(1234567, "Ford F-150", "Blue", 287998, 12500);
        System.out.println(seanCar.toString());

    }

public Vehicle (long id, String makeModel, String color, int odometerReading, float price) {
        this.id = id;
        this.makeModel = makeModel;
        this.color  = color;
        this.odometerReading = odometerReading;
        this.price = price;
}

// Getters // ---------------------------------------------------------------------------------------------------------
    public long getId() {
        return id;
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

//Setters // ----------------------------------------------------------------------------------------------------------
    public void setId(long id) {
        this.id = id;
    }
    public void setMakeModel(String makeModel) {
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

    @Override
    public String toString() {
        return "Vehicle{" +
                "id= " + id +
                ", makeModel= '" + makeModel + '\'' +
                ", color= '" + color + '\'' +
                ", odometerReading= " + odometerReading +
                ", price= " + price +
                '}';
    }
}


