package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class CellPhone {

// Introducing Phone Registry Array List (GPT LEARNING)----------------------------------------------------------------
public static ArrayList<CellPhone> phoneRegistry = new ArrayList<>();

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

    //Overloaded Constructor Introduction -----------------------------------------------------------------------------
    public CellPhone (long serialNumber, String model, String carrier, String phoneNumber, String owner) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;

        // Adding each instance to the phone registry automatically?? -------------------------------------------------
        phoneRegistry.add(this);

    }

    public void setInfo (CellPhone name) {

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
        System.out.println("-------------------------------");
        System.out.println("Your Name: " + owner);
        System.out.println("Your Device Model: " + model);
        System.out.println("Your Carrier Service: " + carrier);
        System.out.println("Your Phone Number: " + phoneNumber);
        System.out.println("Your Serial Number: " + serialNumber);
        System.out.println("-------------------------------");
    }

    // Method to call info for all instances of CellPhone (GPT Learning) ---------------------------------------------
    public static ArrayList<CellPhone> getAllPhones () {
        return phoneRegistry;
    }

    // Dial Method ----------------------------------------------------------------------------------------------------
    public void dial (String numberToDial) {
        System.out.println(this.owner +  "'s Phone is calling " + numberToDial);
    }

    // Find by Info Methods
    public boolean isOwner (String owner) {
        return this.owner.equals(owner);
    }

    public boolean isPhoneNumber (String phoneNumber) {
        return this.phoneNumber.equals(phoneNumber);
    }

    public boolean isModel (String model) {
        return this.model.equals(model);
    }

    public boolean isCarrier (String carrier) {
        return this.carrier.equals(carrier);
    }

    public boolean isSerial (long serialNumber) {
        return this.serialNumber == serialNumber;
    }

}
