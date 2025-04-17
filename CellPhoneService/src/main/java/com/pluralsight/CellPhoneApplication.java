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

        // Introducing Third Phone for Testing Purposes ---------------------------------------------------------------
        String phoneThreeOwner = "TheMan";
        String phoneThreeModel = "iPhone";
        String phoneThreeCarrier = "Metro Pcs";
        String phoneThreePhoneNum = "(333) 333-3333";
        long phoneThreeSerial = 333333333;
        CellPhone phoneThree = new CellPhone(phoneThreeSerial, phoneThreeModel, phoneThreeCarrier, phoneThreePhoneNum, phoneThreeOwner);

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

        // ADDING PHONES TO REGISTRY ----------------------------------------------------------------------------------
        CellPhone.phoneRegistry.add(userCell);
        CellPhone.phoneRegistry.add(astewayCell);

        // Result Breakdown -------------------------------------------------------------------------------------------
        System.out.println("-------------------------------");
        for (CellPhone phone : CellPhone.getAllPhones()) {
            phone.displayInfo();

        // Dial another Phone number ----------------------------------------------------------------------------------
        System.out.println("-------------------------------");
        userCell.dial("(333) 333-3333");
        phoneThree.dial("(214) 441-2025");
        astewayCell.dial(userCell.getPhoneNumber());
        System.out.println("-------------------------------");

        }


    }

}

