package com.pluralsight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VehicleInventory {


    public static void main(String[] args) {
        //Variable Introductions ---------------------------------------------------------------------------------------
        Vehicle [] vehicleInventory = new Vehicle[20];
        Scanner scanner = new Scanner(System.in);

        //Preset Vehicles to add to inventory --------------------------------------------------------------------------
        Vehicle presetOne = new Vehicle(101121,"Ford Explorer","Red",45000,13500);
        Vehicle presetTwo = new Vehicle(101122,"Toyota Camry","Blue",60000,11000);
        Vehicle presetThree = new Vehicle(101123,"Chevrolet Malibu","Black",50000,9700);
        Vehicle presetFour = new Vehicle(101124,"Honda Civic","White",70000,7500);
        Vehicle presetFive = new Vehicle(101125,"Subaru Outback","Green",55000,14500);
        Vehicle presetSix = new Vehicle(101126,"Jeep Wrangler","Yellow",30000,16000);
        //Setting the Array -------------------------------------------------------------------------------------------
        vehicleInventory [0] = presetOne;
        vehicleInventory [1] = presetTwo;
        vehicleInventory [2] = presetThree;
        vehicleInventory [3] = presetFour;
        vehicleInventory [4] = presetFive;
        vehicleInventory [5] = presetSix;


        boolean keepGoing = true; // While loop variable

        System.out.println("----------------------------------------------------");
        System.out.println("Good day User! This application allows you manage vehicles!");

        // High Level Menu ---------------------------------------------------------------------------------------------
        while (keepGoing) {
            // Menu Choice Specific Loop
            int menuChoice = 0;
            while (menuChoice == 0) {
            System.out.println("\nWhat service do you need?");
            System.out.println("\n1 - List All Vehicles");
            System.out.println("2 - Search By Make/Model");
            System.out.println("3 - Search By Price Range");
            System.out.println("4 - Search By Color");
            System.out.println("5 - Add A Vehicle");
            System.out.println("6 - Quit");
            System.out.println();


            try {
                menuChoice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("\n-------------------------------");
                System.out.println("Please choose a NUMBER from the options listed.");
                System.out.println("-------------------------------");
            } catch (InputMismatchException e) { //Chat GPT Suggestion ------------------------------------------------
                System.out.println("\n-------------------------------");
                System.out.println("Please choose a NUMBER from the options listed.");
                System.out.println("-------------------------------");
            }

            if (menuChoice == 1) {
                displayAllVehicles(vehicleInventory);
                char menuReturn = 0;
                while (menuReturn == 0) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        System.out.println("Code Broke");
                    }
                    System.out.println("\nDo you need another operation performed? (Y) or (N)");

                    menuReturn = scanner.nextLine().toUpperCase().charAt(0);

                    if (menuReturn == 'Y') {
                        break;
                    } else if (menuReturn == 'N') {
                        keepGoing = false;
                    } else {
                        System.out.println("\n-------------------------------");
                        System.out.println("Invalid Input. Y or N");
                        System.out.println("-------------------------------");

                    }
                }
            } else if (menuChoice == 2) {
                searchByMakeModel(vehicleInventory);
                char menuReturn = 0;
                while (menuReturn == 0) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        System.out.println("Code Broke");
                    }
                    System.out.println("\nDo you need another operation performed? (Y) or (N)");

                    menuReturn = scanner.nextLine().toUpperCase().charAt(0);

                    if (menuReturn == 'Y') {
                        break;
                    } else if (menuReturn == 'N') {
                        keepGoing = false;
                    } else {
                        System.out.println("-------------------------------");
                        System.out.println("Invalid Input. Y or N");
                        System.out.println("-------------------------------");

                    }
                }
            } else if (menuChoice == 3) {
                searchByPriceRange(vehicleInventory);
                char menuReturn = 0;
                while (menuReturn == 0) {
                    System.out.println("\nDo you need another operation performed? (Y) or (N)");

                    menuReturn = scanner.nextLine().toUpperCase().charAt(0);

                    if (menuReturn == 'Y') {
                        break;
                    } else if (menuReturn == 'N') {
                        keepGoing = false;
                    } else {
                        System.out.println("-------------------------------");
                        System.out.println("Invalid Input. Y or N");
                        System.out.println("-------------------------------");

                    }
                }
            } else if (menuChoice == 4) {
                searchByColor(vehicleInventory);
                char menuReturn = 0;
                while (menuReturn == 0) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        System.out.println("Code Broke");
                    }
                    System.out.println("\nDo you need another operation performed? (Y) or (N)");

                    menuReturn = scanner.nextLine().toUpperCase().charAt(0);

                    if (menuReturn == 'Y') {
                        break;
                    } else if (menuReturn == 'N') {
                        keepGoing = false;
                    } else {
                        System.out.println("-------------------------------");
                        System.out.println("Invalid Input. Y or N");
                        System.out.println("-------------------------------");

                    }
                } 
            } else if (menuChoice == 5) {
                addVehicle(vehicleInventory);
                char menuReturn = 0;
                while (menuReturn == 0) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        System.out.println("Code Broke");
                    }
                    System.out.println("\nDo you need another operation performed? (Y) or (N)");

                    menuReturn = scanner.nextLine().toUpperCase().charAt(0);

                    if (menuReturn == 'Y') {
                        break;
                    } else if (menuReturn == 'N') {
                        keepGoing = false;
                    } else {
                        System.out.println("-------------------------------");
                        System.out.println("Invalid Input. Y or N");
                        System.out.println("-------------------------------");

                    }
                }
            } else if (menuChoice == 6) {
                keepGoing = false;
            }


            }

        }
        try { // Exit Message -------------------------------------------------------------------------------------
            System.out.println("\n\n----------------------------------------------------");
            System.out.println("Thank you for using Vehicle Inventory App!");
            System.out.println("Goodbye!");
            System.out.println("----------------------------------------------------");

            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static void displayAllVehicles (Vehicle [] vehicleInventory) {
        System.out.println("List of All Registered Vehicles:");
        System.out.println("Please Wait a Moment....");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Code Broke");
            throw new RuntimeException(e);
        }

        for (int index = 0; index < vehicleInventory.length; index += 1) {
            if (vehicleInventory [index] != null) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Code Broke");
                    throw new RuntimeException(e);
                }
                System.out.println("\n----------------------------------");
                System.out.println("Entry Number: " + (index + 1));
                System.out.println("VID: " + vehicleInventory[index].getVehicleID());
                System.out.println("Make/Model: " + vehicleInventory[index].getMakeModel());
                System.out.println("Color: " + vehicleInventory[index].getColor());
                System.out.println("Odom Reading: " + vehicleInventory[index].getOdometerReading());
                System.out.println("Price: $" + vehicleInventory[index].getPrice());
                System.out.println("----------------------------------");
            }
        }
    }

    public static void searchByMakeModel (Vehicle[] vehicleInventory) {
        Scanner scanner = new Scanner(System.in);
        boolean doneSearching = false;
        while (!doneSearching) {
        System.out.println("\n----------------------------------------------------");
        System.out.println("Search By Make/Model");
        System.out.println("\n What is the Make and Model?");
        System.out.println("Type Here:");
        String makeModel = scanner.nextLine().toLowerCase();

        boolean found = false;


            for (Vehicle vehicle : vehicleInventory) {
                if (vehicle != null && vehicle.getMakeModel().toLowerCase().contains(makeModel)) { //Was using .equals ChatGPT suggested .contains
                    System.out.println("\n----------------------------------------------------");
                    System.out.println("VID: " + vehicle.getVehicleID());
                    System.out.println("Make/Model: " + vehicle.getMakeModel());
                    System.out.println("Color: " + vehicle.getColor());
                    System.out.println("Odom Reading: " + vehicle.getOdometerReading());
                    System.out.println("Price: $" + vehicle.getPrice());
                    System.out.println("----------------------------------------------------");
                    found = true;
                    try{
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        System.out.println("Code Broke");
                        throw new RuntimeException(e);
                    }

                }
            }
            if (found) {
                System.out.println("\nSearch Again?");
                System.out.println("(Y)es or (N)o");
                char searchAgain = scanner.nextLine().toUpperCase().charAt(0);
                boolean tryAgain = false;
                while (!tryAgain) {
                    if (searchAgain == 'Y') {
                        tryAgain = true;
                    } else if (searchAgain == 'N') {
                        tryAgain = true;
                        doneSearching = true;
                    } else {
                        System.out.println("-------------------------------");
                        System.out.println("Invalid Input. Y or N");
                        System.out.println("-------------------------------");
                    }
                }
            }
            if (!found) {
                try{
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    System.out.println("Code Broke");
                    throw new RuntimeException(e);
                }
                System.out.println("No Matching Vehicles");
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Code Broke");
                    throw new RuntimeException(e);
                }
                System.out.println("\nSearch Again?");
                System.out.println("(Y)es or (N)o");
                char searchAgain = scanner.nextLine().toUpperCase().charAt(0);
                boolean tryAgain = false;
                while (!tryAgain) {
                    if (searchAgain == 'Y') {
                        tryAgain = true;
                    } else if (searchAgain == 'N') {
                        tryAgain = true;
                        doneSearching = true;
                    } else {
                        System.out.println("-------------------------------");
                        System.out.println("Invalid Input. Y or N");
                        System.out.println("-------------------------------");
                    }
                }

            }


        }
    }

    public static void searchByPriceRange (Vehicle[] vehicleInventory) {
        Scanner scanner = new Scanner(System.in);
        float minPrice = 0;
        float maxPrice = 0;
        boolean doneSearching = false;
        while (!doneSearching) {
            System.out.println("\n----------------------------------------------------");
            System.out.println("Search By Price Range");

            while (minPrice == 0){
                System.out.println("\n What is the Minimum Price");
                try {
                    minPrice = Float.parseFloat(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("\n--------------------------------");
                    System.out.println("Invalid Input: Numbers Only");
                    System.out.println("--------------------------------");
                } catch (InputMismatchException e) {
                    System.out.println("\n--------------------------------");
                    System.out.println("Invalid Input: Number Out of Range");
                    System.out.println("--------------------------------");
                }
            }

            while (maxPrice == 0){
                System.out.println("\n What is the Maximum Price");
                try {
                    maxPrice = Float.parseFloat(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("\n--------------------------------");
                    System.out.println("Invalid Input: Numbers Only");
                    System.out.println("--------------------------------");
                } catch (InputMismatchException e) {
                    System.out.println("\n--------------------------------");
                    System.out.println("Invalid Input: Number Out of Range");
                    System.out.println("--------------------------------");
                }
            }

            System.out.println("Type Here:");


            boolean found = false;


            for (Vehicle vehicle : vehicleInventory) {
                if (vehicle != null && vehicle.getPrice() >= minPrice && vehicle.getPrice() <= maxPrice ) {
                    System.out.println("\n----------------------------------------------------");
                    System.out.println("VID: " + vehicle.getVehicleID());
                    System.out.println("Make/Model: " + vehicle.getMakeModel());
                    System.out.println("Color: " + vehicle.getColor());
                    System.out.println("Odom Reading: " + vehicle.getOdometerReading());
                    System.out.println("Price: $" + vehicle.getPrice());
                    System.out.println("----------------------------------------------------");
                    found = true;
                    try{
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        System.out.println("Code Broke");
                        throw new RuntimeException(e);
                    }
                }
            }
            if (found) {
                System.out.println("\nSearch Again?");
                System.out.println("(Y)es or (N)o");
                char searchAgain = scanner.nextLine().toUpperCase().charAt(0);
                boolean tryAgain = false;
                while (!tryAgain) {
                    if (searchAgain == 'Y') {
                        tryAgain = true;
                    } else if (searchAgain == 'N') {
                        tryAgain = true;
                        doneSearching = true;
                    } else {
                        System.out.println("-------------------------------");
                        System.out.println("Invalid Input. Y or N");
                        System.out.println("-------------------------------");
                    }
                }
            }
            if (!found) {
                try{
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    System.out.println("Code Broke");
                    throw new RuntimeException(e);
                }
                System.out.println("No Matching Vehicles");
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Code Broke");
                    throw new RuntimeException(e);
                }
                System.out.println("\nSearch Again?");
                System.out.println("(Y)es or (N)o");
                char searchAgain = scanner.nextLine().toUpperCase().charAt(0);
                boolean tryAgain = false;
                while (!tryAgain) {
                    if (searchAgain == 'Y') {
                        tryAgain = true;
                    } else if (searchAgain == 'N') {
                        tryAgain = true;
                        doneSearching = true;
                    } else {
                        System.out.println("-------------------------------");
                        System.out.println("Invalid Input. Y or N");
                        System.out.println("-------------------------------");
                    }
                }

            }


        }
    }

    public static void searchByColor (Vehicle[] vehicleInventory) {
        Scanner scanner = new Scanner(System.in);
        boolean doneSearching = false;
        while (!doneSearching) {
            System.out.println("\n----------------------------------------------------");
            System.out.println("Search By Color");
            System.out.println("\n What is the desired color?");
            System.out.println("Type Here:");
            String color = scanner.nextLine().toLowerCase();

            boolean found = false;


            for (Vehicle vehicle : vehicleInventory) {
                if (vehicle != null && vehicle.getColor().toLowerCase().contains(color)) {
                    System.out.println("\n----------------------------------------------------");
                    System.out.println("VID: " + vehicle.getVehicleID());
                    System.out.println("Make/Model: " + vehicle.getMakeModel());
                    System.out.println("Color: " + vehicle.getColor());
                    System.out.println("Odom Reading: " + vehicle.getOdometerReading());
                    System.out.println("Price: $" + vehicle.getPrice());
                    System.out.println("----------------------------------------------------");
                    found = true;
                    try{
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        System.out.println("Code Broke");
                        throw new RuntimeException(e);
                    }

                }
            }
            if (found) {
                System.out.println("\nSearch Again?");
                System.out.println("(Y)es or (N)o");
                char searchAgain = scanner.nextLine().toUpperCase().charAt(0);
                boolean tryAgain = false;
                while (!tryAgain) {
                    if (searchAgain == 'Y') {
                        tryAgain = true;
                    } else if (searchAgain == 'N') {
                        tryAgain = true;
                        doneSearching = true;
                    } else {
                        System.out.println("-------------------------------");
                        System.out.println("Invalid Input. Y or N");
                        System.out.println("-------------------------------");
                    }
                }
            }
            if (!found) {
                try{
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    System.out.println("Code Broke");
                    throw new RuntimeException(e);
                }
                System.out.println("No Matching Vehicles");
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Code Broke");
                    throw new RuntimeException(e);
                }
                System.out.println("\nSearch Again?");
                System.out.println("(Y)es or (N)o");
                char searchAgain = scanner.nextLine().toUpperCase().charAt(0);
                boolean tryAgain = false;
                while (!tryAgain) {
                    if (searchAgain == 'Y') {
                        tryAgain = true;
                    } else if (searchAgain == 'N') {
                        tryAgain = true;
                        doneSearching = true;
                    } else {
                        System.out.println("-------------------------------");
                        System.out.println("Invalid Input. Y or N");
                        System.out.println("-------------------------------");
                    }
                }

            }


        }
    }

    public static void addVehicle (Vehicle [] vehicleInventory) {
        Scanner scanner = new Scanner(System.in);
        long vehicleID = 0;
        int odometerReading = 0;
        float price = 0;

        System.out.println("\n----------------------------------------------------");
        System.out.println("Add A New Vehicle");
        System.out.println("We will do this in a few steps!");

        while (vehicleID == 0) {
            try {
                System.out.println("\nWhat is the vehicle ID?");
                vehicleID = Long.parseLong(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("-------------------------------");
                System.out.println("Invalid Input. Numbers Only");
                System.out.println("-------------------------------");
            } catch (InputMismatchException e) {
                System.out.println("-------------------------------");
                System.out.println("Invalid Input. Number out of range.");
                System.out.println("-------------------------------");
            }
        }

            System.out.println("\nWhat is the Make and Model?");
            String [] userInput = scanner.nextLine().trim().toLowerCase().split(" ");
            String makeModel = userInput [0].substring(0, 1).toUpperCase() + userInput [0].substring(1) + " " + userInput [1].substring(0, 1).toUpperCase() + userInput [1].substring(1);

            System.out.println("\nWhat is the color?");
            String colorInput = scanner.nextLine().trim();
            String color = colorInput.toLowerCase().substring(0, 1).toUpperCase() + colorInput.substring(1);

        while (odometerReading < 1) {
            try {
                System.out.println("\nWhat is the Odometer reading");
                odometerReading = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("-------------------------------");
                System.out.println("Invalid Input. Numbers Only");
                System.out.println("-------------------------------");
            } catch (InputMismatchException e) {
                System.out.println("-------------------------------");
                System.out.println("Invalid Input. Number out of range.");
                System.out.println("-------------------------------");
            }
        }

            while (price == 0) {
                price = 0;
                try {
                    System.out.println("\nHow much is the car worth?");
                    price = Float.parseFloat(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("-------------------------------");
                    System.out.println("Invalid Input. Numbers Only");
                    System.out.println("-------------------------------");
                } catch (InputMismatchException e) {
                    System.out.println("-------------------------------");
                    System.out.println("Invalid Input. Number out of range.");
                    System.out.println("-------------------------------");
                }
            }

            boolean confirmed = false;
            while (!confirmed) {
                System.out.println("\nIs all of your info correct?");
                System.out.println("\nVID: " + vehicleID);
                System.out.println("Make/Model: " + makeModel);
                System.out.println("Color: " + color);
                System.out.println("Odom Reading: " +odometerReading);
                System.out.println("Price: $" + price);
                System.out.println("\n(Y)es or (N)o");
                char isCorrect = scanner.nextLine().toUpperCase().charAt(0);
                
                if (isCorrect == 'Y') {
                    confirmed = true;
                } else if (isCorrect == 'N') {
                    boolean changeMade = false;
                    while (!changeMade) {
                        System.out.println("\nWhich part needs to be changed?");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            System.out.println("Code Broke");
                            throw new RuntimeException(e);
                        }
                        System.out.println("\n(A) VID: " + vehicleID);
                        System.out.println("(B) Make/Model: " + makeModel);
                        System.out.println("(C) Color: " + color);
                        System.out.println("(D) Odom Reading: " + odometerReading);
                        System.out.println("(E) Price: $" + price);
                        System.out.println("\n(A) (B) (C) (D) (E)");
                        char userChange = scanner.nextLine().toUpperCase().charAt(0);

                        if (userChange == 'A') {
                            vehicleID = 0;
                            while (vehicleID == 0) {
                                try {
                                    System.out.println("\nWhat is the vehicle ID?");
                                    vehicleID = Long.parseLong(scanner.nextLine());
                                } catch (NumberFormatException e) {
                                    System.out.println("-------------------------------");
                                    System.out.println("Invalid Input. Numbers Only");
                                    System.out.println("-------------------------------");
                                } catch (InputMismatchException e) {
                                    System.out.println("-------------------------------");
                                    System.out.println("Invalid Input. Number out of range.");
                                    System.out.println("-------------------------------");
                                }
                            }
                            changeMade =true;
                        } else if (userChange == 'B') {
                            System.out.println("\nWhat is the Make and Model?");
                            userInput = scanner.nextLine().trim().toLowerCase().split(" ");
                            makeModel = userInput [0].substring(0, 1).toUpperCase() + userInput [0].substring(1) + " " + userInput [1].substring(0, 1).toUpperCase() + userInput [1].substring(1);
                            changeMade = true;
                        } else if (userChange == 'C') {
                            System.out.println("\nWhat is the color?");
                            colorInput = scanner.nextLine().trim();
                            color = colorInput.toLowerCase().substring(0, 1).toUpperCase() + colorInput.substring(1);
                            changeMade = true;
                        } else if (userChange == 'D') {
                            odometerReading = 0;
                            while (odometerReading == 0) {
                                try {
                                    System.out.println("\nWhat is the Odometer reading");
                                    odometerReading = Integer.parseInt(scanner.nextLine());
                                } catch (NumberFormatException e) {
                                    System.out.println("-------------------------------");
                                    System.out.println("Invalid Input. Numbers Only");
                                    System.out.println("-------------------------------");
                                } catch (InputMismatchException e) {
                                    System.out.println("-------------------------------");
                                    System.out.println("Invalid Input. Number out of range.");
                                    System.out.println("-------------------------------");
                                }
                            }
                            changeMade = true;
                        } else if (userChange == 'E') {
                            price = 0;
                            while (price == 0) {
                                try {
                                    System.out.println("\nHow much is the car worth?");
                                    price = Float.parseFloat(scanner.nextLine());
                                } catch (NumberFormatException e) {
                                    System.out.println("-------------------------------");
                                    System.out.println("Invalid Input. Numbers Only");
                                    System.out.println("-------------------------------");
                                } catch (InputMismatchException e) {
                                    System.out.println("-------------------------------");
                                    System.out.println("Invalid Input. Number out of range.");
                                    System.out.println("-------------------------------");
                                }
                            }
                            changeMade = true;
                        }
                    }
                } else {
                    System.out.println("-------------------------------");
                    System.out.println("Invalid Input. Y or N.");
                    System.out.println("-------------------------------");
                }
            }
            boolean added = false;
             while (!added) {
                 System.out.println("\n--------------------------------------------------");
                 System.out.println("Thank you for confirming.");
                 System.out.println("\nVID: " + vehicleID);
                 System.out.println("Make/Model: " + makeModel);
                 System.out.println("Color: " + color);
                 System.out.println("Odom Reading: " +odometerReading);
                 System.out.println("Price: $" + price);
                 System.out.println("--------------------------------------------------");

                 char addIt = 0;
                 while (addIt == 0) {
                     System.out.println("\nAdd this vehicle to inventory?");
                     System.out.println("(Y)es or (N)o?");
                     addIt = scanner.nextLine().trim().toUpperCase().charAt(0);

                     if (addIt == 'Y') {
                         Vehicle newVehicle = new Vehicle(vehicleID, makeModel, color, odometerReading, price);
                         boolean vehicleLoaded = false;
                         for (int i = 0; i < vehicleInventory.length; i++) {
                             if (vehicleInventory[i] == null) {
                                 vehicleInventory[i] = newVehicle;
                                 vehicleLoaded = true;
                                 try {
                                     Thread.sleep(1000);
                                 } catch (InterruptedException e) {
                                     System.out.println("Code Broke");
                                     throw new RuntimeException(e);
                                 }
                                 System.out.println("\nSuccessfully added vehicle to inventory!");
                                 added = true;
                                 break;
                             }
                         }
                         if (!vehicleLoaded) {
                             System.out.println("\nInventory is full, unable to add vehicle");
                             System.out.println("\nReturning to Main Menu....");
                             try {
                                 Thread.sleep(2000);
                             } catch (InterruptedException e) {
                                 System.out.println("Code Broke");
                                 throw new RuntimeException(e);
                             }
                         }
                     } else if (addIt == 'N') {
                         try {
                             Thread.sleep(500);
                         } catch (InterruptedException e) {
                             System.out.println("Code Broke");
                             throw new RuntimeException(e);
                         }
                         System.out.println("Okay, cancelling transaction...");
                         try {
                             Thread.sleep(1000);
                         } catch (InterruptedException e) {
                             System.out.println("Code Broke");
                             throw new RuntimeException(e);
                         }
                         added = true;

                     }
                 }
             }




        }

    }


