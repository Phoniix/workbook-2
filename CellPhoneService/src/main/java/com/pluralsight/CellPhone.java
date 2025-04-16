package com.pluralsight;

import java.util.Scanner;

public class CellPhone {

    // Variable Introductions -----------------------------------------------------------------------------------------
    private long serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    //Constructor Introduction ----------------------------------------------------------------------------------------
    public CellPhone () {
        // Local Variables that constructor requires for setting values -----------------------------------------------
        long serialNumber;
        String model;
        String carrier;
        String phoneNumber;
        String owner;
    }

    // Getter for variables, allows user to pull info outside the class -----------------------------------------------
    public String getModel () {
        return model;
    }
    public String getCarrier () {
        return carrier;
    }
    public String getPhoneNumber () {
        return phoneNumber;
    }
    public String getOwner () {
        return owner;
    }
    public long getSerialNumber () {
        return serialNumber;
    }


    // Setter for variables, allows user to set info from variables in this class -------------------------------------
    public void setModel (String newModel) {
        this.model = newModel;
    }
    public void setCarrier (String newCarrier) {
        this.carrier = newCarrier;
    }
    public void setPhoneNumber (String newPhoneNumber) {
        this.phoneNumber = newPhoneNumber;
    }
    public void setOwner (String newOwner) {
        this.owner = newOwner;
    }
    public void setSerialNumber (long newSerialNumber) {
        this.serialNumber = newSerialNumber;
    }

    // Use this for result display at the end from another class ------------------------------------------------------
    public void displayInfo () {
        System.out.println("Your Name: " + owner);
        System.out.println("Your Device Model: " + model);
        System.out.println("Your Carrier Service: " + carrier);
        System.out.println("Your Phone Number: " + phoneNumber);
        System.out.println(" Your Serial Number: " + serialNumber);
    }


}
