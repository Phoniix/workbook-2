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

        // Result Breakdown -------------------------------------------------------------------------------------------
        System.out.println("\nHere is your information breakdown!");
        userCell.displayInfo();

    }

}

