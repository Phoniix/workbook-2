package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {


    public static void main (String [] args) {
        //Variable Introductions --------------------------------------------------------------------------------------
        Scanner scanner = new Scanner(System.in);
        CellPhone userCell = new CellPhone();
        long serialNumber = 0;
        String model;
        String carrier;
        String phoneNumber;
        String owner;

        // Introduce Second Phone (Dialer Phone) ----------------------------------------------------------------------
        CellPhone astewayCell = new CellPhone();
        astewayCell.setOwner("Asteway N.");
        astewayCell.setModel("Android");
        astewayCell.setCarrier("Sprint");
        astewayCell.setPhoneNumber("(214) 441-2025");
        astewayCell.setSerialNumber(000000001);

        // Introducing the System -------------------------------------------------------------------------------------
        String introMessage = "set up your brand new phone!";
        CodeSnippetsAndFunctions.introduceTheSystem(introMessage);

        // Gather Owner Variable --------------------------------------------------------------------------------------
        owner = CodeSnippetsAndFunctions.userInputName();
        userCell.setOwner(owner);

        // Gather Model Variable --------------------------------------------------------------------------------------
        String modelObjectName = "Phone Model";
        model = CodeSnippetsAndFunctions.customInputName(modelObjectName);
        userCell.setModel(model);

        // Gather Carrier Variable ------------------------------------------------------------------------------------
        String carrierObjectName = "Carrier Provider's Name";
        carrier = CodeSnippetsAndFunctions.customInputName(carrierObjectName);
        userCell.setCarrier(carrier);

        //Gather Phone Number Variable --------------------------------------------------------------------------------
        phoneNumber = CodeSnippetsAndFunctions.userInputPhoneNumber();
        userCell.setPhoneNumber(phoneNumber);

        // Gather Serial Number ---------------------------------------------------------------------------------------
        String longName = "Serial Number";
        serialNumber = CodeSnippetsAndFunctions.customLongInput(longName);
        userCell.setSerialNumber(serialNumber);

        // Dial another Phone number ----------------------------------------------------------------------------------
        System.out.println("-------------------------------");
        userCell.dial("(214) 441-2025");
        userCell.dial(astewayCell.getPhoneNumber());
        astewayCell.dial(userCell.getPhoneNumber());
        System.out.println("-------------------------------");

        // Result Breakdown -------------------------------------------------------------------------------------------
        System.out.println("\nHere is your information breakdown!");
        userCell.displayInfo();
        System.out.println("-------------------------------");
        astewayCell.displayInfo();


    }

}

