package com.pluralsight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VehicleInventory {


    public static void main(String[] args) {

        //Variable Introductions ---------------------------------------------------------------------------------------
        Vehicle[] vehicleInventory = new Vehicle[20];
        Scanner scanner = new Scanner(System.in);

        //Preset Vehicles to add to inventory --------------------------------------------------------------------------
        Vehicle presetOne = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        Vehicle presetTwo = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        Vehicle presetThree = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        Vehicle presetFour = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        Vehicle presetFive = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        Vehicle presetSix = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);

        //Setting the Array -------------------------------------------------------------------------------------------
        vehicleInventory[0] = presetOne;
        vehicleInventory[1] = presetTwo;
        vehicleInventory[2] = presetThree;
        vehicleInventory[3] = presetFour;
        vehicleInventory[4] = presetFive;
        vehicleInventory[5] = presetSix;


        boolean keepGoing = true; // High Level While loop variable

        System.out.println("----------------------------------------------------");
        System.out.println("Good day User! This application allows you manage vehicles!");

        // High Level Loop To Keep Code Running Until Manually Stopped ------------------------------------------------
        while (keepGoing) { // Keep Going Loop Begin // ---------------------------------------------------------------
            // Menu Choice Specific Loop ------------------------------------------------------------------------------
            int menuChoice = 0;
            while (menuChoice == 0) { // Menu Choice Loop Begin // ----------------------------------------------------
                System.out.println("\nWhat service do you need?");
                System.out.println("\n1 - List All Vehicles");
                System.out.println("2 - Search By Make/Model");
                System.out.println("3 - Search By Price Range");
                System.out.println("4 - Search By Color");
                System.out.println("5 - Add A Vehicle");
                System.out.println("6 - Quit");
                System.out.println();

                // User Input For Menu Choice 1-6 ---------------------------------------------------------------------
                try {
                    menuChoice = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("\n-------------------------------");
                    System.out.println("Please choose a NUMBER from the options listed.");
                    System.out.println("-------------------------------");
                } catch (
                        InputMismatchException e) { //Chat GPT Suggestion ---------------------------------------------
                    System.out.println("\n-------------------------------");
                    System.out.println("Please choose a NUMBER from the options listed.");
                    System.out.println("-------------------------------");
                }
                // Menu Choice 1 // List All Vehicles -----------------------------------------------------------------
                if (menuChoice == 1) {
                    displayAllVehicles(vehicleInventory); // Method 1 // ----------------------------------------------

                    // Menu Return Sequence ---------------------------------------------------------------------------
                    char menuReturn = 0;
                    while (menuReturn == 0) {
                        try {
                            Thread.sleep(500); //Timer for Another Operation message ----------------------------
                        } catch (InterruptedException e) {
                            System.out.println("Code Broke");
                        }
                        System.out.println("\nDo you need another operation performed? (Y) or (N)");

                        menuReturn = scanner.nextLine().toUpperCase().charAt(0); // Return to Main Menu User Input-----

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
                    // Menu Choice 2 // Search By Make/Model ----------------------------------------------------------
                } else if (menuChoice == 2) {
                    searchByMakeModel(vehicleInventory); // Method 2 // -----------------------------------------------

                    // Menu Return Sequence ---------------------------------------------------------------------------
                    char menuReturn = 0;
                    while (menuReturn == 0) {
                        try {
                            Thread.sleep(500); // Timer for Another Operation Message ---------------------------
                        } catch (InterruptedException e) {
                            System.out.println("Code Broke");
                        }
                        System.out.println("\nDo you need another operation performed? (Y) or (N)");

                        menuReturn = scanner.nextLine().toUpperCase().charAt(0); // Return to Main Menu User Input-----

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
                    // Menu Choice 3 // Search By Price Range ---------------------------------------------------------
                } else if (menuChoice == 3) {
                    searchByPriceRange(vehicleInventory);

                    // Menu Return Sequence ---------------------------------------------------------------------------
                    char menuReturn = 0;
                    while (menuReturn == 0) {
                        try {
                            Thread.sleep(500); // Timer For Another Operation Message ---------------------------
                        } catch (InterruptedException e) {
                            System.out.println("Code Broke");
                        }
                        System.out.println("\nDo you need another operation performed? (Y) or (N)");

                        menuReturn = scanner.nextLine().toUpperCase().charAt(0); // Return to Main Menu User Input-----

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
                    // Menu Choice 4 // Search By Color ---------------------------------------------------------------
                } else if (menuChoice == 4) {
                    searchByColor(vehicleInventory); // Method 4 // ---------------------------------------------------

                    // Menu Return Sequence ---------------------------------------------------------------------------
                    char menuReturn = 0;
                    while (menuReturn == 0) {
                        try {
                            Thread.sleep(500); // Timer For Another Operation Message ---------------------------
                        } catch (InterruptedException e) {
                            System.out.println("Code Broke");
                        }
                        System.out.println("\nDo you need another operation performed? (Y) or (N)");

                        menuReturn = scanner.nextLine().toUpperCase().charAt(0); // Return to Main Menu User Input-----

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
                    // Menu Choice 4 // Add A Vehicle -----------------------------------------------------------------
                } else if (menuChoice == 5) {
                    addVehicle(vehicleInventory); // Method 5 // ------------------------------------------------------

                    // Menu Return Sequence ---------------------------------------------------------------------------
                    char menuReturn = 0;
                    while (menuReturn == 0) {
                        try {
                            Thread.sleep(500); // Timer For Another Operation Message ---------------------------
                        } catch (InterruptedException e) {
                            System.out.println("Code Broke");
                        }
                        System.out.println("\nDo you need another operation performed? (Y) or (N)");

                        menuReturn = scanner.nextLine().toUpperCase().charAt(0); // Return to Main Menu User Input-----

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
                    // Menu Choice 6 // Quit --------------------------------------------------------------------------
                } else if (menuChoice == 6) {
                    keepGoing = false; // Shuts Down High Level While Loop Instantly ----------------------------------
                }


            } // Menu Choice Loop End // ------------------------------------------------------------------------------

        } // Keep Going While Loop End // -----------------------------------------------------------------------------
        try { // Exit Message -----------------------------------------------------------------------------------------
            System.out.println("\n\n----------------------------------------------------");
            System.out.println("Thank you for using Vehicle Inventory App!");
            System.out.println("Goodbye!");
            System.out.println("----------------------------------------------------");

            // Slight Timer Before Letting Program End ----------------------------------------------------------------

            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Code Broke");
            throw new RuntimeException(e);
        }

    }

    public static void displayAllVehicles(Vehicle[] vehicleInventory) {

        // Introducing The System -------------------------------------------------------------------------------------
        System.out.println("List of All Registered Vehicles:");
        System.out.println("Please Wait a Moment....");

        // Timer Before Displaying So It Feels Like System Has A Load Feature -----------------------------------------
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Code Broke");
            throw new RuntimeException(e);
        }

        // Loops Through Vehicle Inventory For Any Non-Nulls (Has Value) ----------------------------------------------
        for (int index = 0; index < vehicleInventory.length; index += 1) {
            if (vehicleInventory[index] != null) { // != null means it has a car -------------------------------------

                // Timer In Loop For Slight Delay Between Loop Cycles -------------------------------------------------
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Code Broke");
                    throw new RuntimeException(e);
                }

                // Prints Every Non-Null Data Type (All Registered Vehicles In Inventory ------------------------------
                System.out.println("\n----------------------------------");
                System.out.println("Entry Number: " + (index + 1));
                System.out.println("VID: " + vehicleInventory[index].getVehicleID());
                System.out.println("Make/Model: " + vehicleInventory[index].getMakeModel());
                System.out.println("Color: " + vehicleInventory[index].getColor());
                System.out.println("Odom Reading: " + vehicleInventory[index].getOdometerReading());
                System.out.println("Price: $" + vehicleInventory[index].getPrice());
                System.out.println("----------------------------------");
            }
        } // For Loop End Bracket // ----------------------------------------------------------------------------------
    } // Method 1 // Display All Vehicles End //  ---------------------------------------------------------------------

    public static void searchByMakeModel(Vehicle[] vehicleInventory) {

        // Variable Introductions -------------------------------------------------------------------------------------
        Scanner scanner = new Scanner(System.in);

        // Search By Make/Model While Loop ----------------------------------------------------------------------------
        boolean doneSearching = false;
        while (!doneSearching) { // DoneSearching While Loop Start //--------------------------------------------------

            // Introducing The System ---------------------------------------------------------------------------------
            System.out.println("\n----------------------------------------------------");
            System.out.println("Search By Make/Model");
            System.out.println("\nWhat is the Make and Model?");
            System.out.println("Type Here:");
            String makeModel = scanner.nextLine().toLowerCase(); // Sets To Lower Case to Make Searching Easier -------

            boolean found = false; // Initializing Found Variable For Use In And After Vehicle Search For Loop --------

            // Vehicle Search For Loop (Searches based on containing any of the same values in any make/model string --
            for (Vehicle vehicle : vehicleInventory) {// For Loop Start // --------------------------------------------
                if (vehicle != null && vehicle.getMakeModel().toLowerCase().contains(makeModel)) { //Was using .equals ChatGPT suggested .contains // Much Better
                    System.out.println("\n----------------------------------------------------");
                    System.out.println("VID: " + vehicle.getVehicleID());
                    System.out.println("Make/Model: " + vehicle.getMakeModel());
                    System.out.println("Color: " + vehicle.getColor());
                    System.out.println("Odom Reading: " + vehicle.getOdometerReading());
                    System.out.println("Price: $" + vehicle.getPrice());
                    System.out.println("----------------------------------------------------");
                    found = true; // Sets Found To True If Matches Exist Based On Query -------------------------------

                    // Timer Between Displayed Results ----------------------------------------------------------------
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        System.out.println("Code Broke");
                        throw new RuntimeException(e);
                    }

                }
            } // For Loop End // --------------------------------------------------------------------------------------
            if (found) { // If Found = True // Immediately Asks If You Want To Try Another ----------------------------
                System.out.println("\nSearch Again?");
                System.out.println("(Y)es or (N)o");

                // While Loop For Search Again Sequence ---------------------------------------------------------------
                char searchAgain = scanner.nextLine().toUpperCase().charAt(0);
                boolean tryAgain = false;
                while (!tryAgain) { // Try Again Loop Start // --------------------------------------------------------
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
                } // Try Again Loop End // ----------------------------------------------------------------------------
            }
            if (!found) { // If Found = False // Displays Error Message Before Asking To Try Another ------------------

                // Timer To Make It look Like It Searched VERY VERY Hard ----------------------------------------------
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    System.out.println("Code Broke");
                    throw new RuntimeException(e);
                }
                System.out.println("No Matching Vehicles"); // Error Message // ---------------------------------------

                // Timer Before Between Messages to Let User Register Info Mentally -----------------------------------
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Code Broke");
                    throw new RuntimeException(e);
                }

                // Search Again Sequence ------------------------------------------------------------------------------
                System.out.println("\nSearch Again?");
                System.out.println("(Y)es or (N)o");
                char searchAgain = scanner.nextLine().toUpperCase().charAt(0);
                boolean tryAgain = false;
                while (!tryAgain) { // Try Again Loop Start -----------------------------------------------------------
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
                } // Try Again Loop End // ----------------------------------------------------------------------------

            }


        } // Search By Make Model While Loop End // -------------------------------------------------------------------
    } // Method 2 // Search By Make Model End // -----------------------------------------------------------------------

    public static void searchByPriceRange(Vehicle[] vehicleInventory) {

        // Variable Introductions -------------------------------------------------------------------------------------
        Scanner scanner = new Scanner(System.in);
        float minPrice = 0; // Min Price Initialization ---------------------------------------------------------------
        float maxPrice = 0; // Max Price Initialization ---------------------------------------------------------------

        // Search By Price Range While Loop ---------------------------------------------------------------------------
        boolean doneSearching = false;
        while (!doneSearching) { // S-B-P-R While Loop Start ----------------------------------------------------------

            // Introducing The System ---------------------------------------------------------------------------------
            System.out.println("\n----------------------------------------------------");
            System.out.println("Search By Price Range");

            // Minimum Price Query While Loop -------------------------------------------------------------------------
            while (minPrice == 0) { // Min Price Loop Start // --------------------------------------------------------
                System.out.println("\nWhat is the Minimum Price");
                System.out.println("Type Here:");
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
            } // Min Price Loop End // --------------------------------------------------------------------------------

            // Max Price While Loop Query -----------------------------------------------------------------------------
            while (maxPrice == 0) { // Max Price Loop Start // --------------------------------------------------------
                System.out.println("\nWhat is the Maximum Price");
                System.out.println("Type Here:");
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
            }// Max Price Loop End // --------------------------------------------------------------------------------

            System.out.println("Type Here:");


            boolean found = false; // Initialize Found Variable For use In and After Loop -----------------------------

            // S-B-P-R Search Loop ------------------------------------------------------------------------------------
            for (Vehicle vehicle : vehicleInventory) { // Search loop Start // ----------------------------------------
                if (vehicle != null && vehicle.getPrice() >= minPrice && vehicle.getPrice() <= maxPrice) {
                    System.out.println("\n----------------------------------------------------");
                    System.out.println("VID: " + vehicle.getVehicleID());
                    System.out.println("Make/Model: " + vehicle.getMakeModel());
                    System.out.println("Color: " + vehicle.getColor());
                    System.out.println("Odom Reading: " + vehicle.getOdometerReading());
                    System.out.println("Price: $" + vehicle.getPrice());
                    System.out.println("----------------------------------------------------");
                    found = true; // Sets Found To True If Data Was Found ---------------------------------------------

                    // Timer Between Displayed Results ----------------------------------------------------------------
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        System.out.println("Code Broke");
                        throw new RuntimeException(e);
                    }
                }
            } // Search Loop End // -----------------------------------------------------------------------------------
            if (found) { // If Found = True // Ask to search again immediately ----------------------------------------
                System.out.println("\nSearch Again?");
                System.out.println("(Y)es or (N)o");
                char searchAgain = scanner.nextLine().toUpperCase().charAt(0);
                boolean tryAgain = false;

                // Search Again Sequence ------------------------------------------------------------------------------
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
                } // Search Again Loop End // -------------------------------------------------------------------------
            } // Found True Loop End // -------------------------------------------------------------------------------
            if (!found) { // If Found = False // Display Message before Asking to search again ------------------------

                // Timer To make it look like it searched VERY VERY hard ----------------------------------------------
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    System.out.println("Code Broke");
                    throw new RuntimeException(e);
                }
                System.out.println("No Matching Vehicles"); // Error Message ------------------------------------------

                // Timer Before Search Again Sequence -----------------------------------------------------------------
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Code Broke");
                    throw new RuntimeException(e);
                }

                // Search Again Sequence ------------------------------------------------------------------------------
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
                } // Search Again Loop End ----------------------------------------------------------------------------

            } // Found = False Loop End // ----------------------------------------------------------------------------


        } // S-B-P-R Loop End // --------------------------------------------------------------------------------------
    } // Method 3 // Search By Price Range End // ---------------------------------------------------------------------

    public static void searchByColor(Vehicle[] vehicleInventory) {

        // Variable Introductions -------------------------------------------------------------------------------------
        Scanner scanner = new Scanner(System.in);
        boolean doneSearching = false;

        // Search By Color Loop Query ----------------------------------------------------------------------------------
        while (!doneSearching) { // Search By Color Loop Start //-------------------------------------------------------

            //Introducing The System ----------------------------------------------------------------------------------
            System.out.println("\n----------------------------------------------------");
            System.out.println("Search By Color");
            System.out.println("\n What is the desired color?");
            System.out.println("Type Here:");
            String color = scanner.nextLine().toLowerCase(); // Sets to lower case to make searching easier -----------

            boolean found = false; //Initialize Found Variable For Use In And After Loop ------------------------------

            // Search By Color Search Loop ----------------------------------------------------------------------------
            for (Vehicle vehicle : vehicleInventory) { //Search Loop Start // -----------------------------------------
                if (vehicle != null && vehicle.getColor().toLowerCase().contains(color)) {
                    System.out.println("\n----------------------------------------------------");
                    System.out.println("VID: " + vehicle.getVehicleID());
                    System.out.println("Make/Model: " + vehicle.getMakeModel());
                    System.out.println("Color: " + vehicle.getColor());
                    System.out.println("Odom Reading: " + vehicle.getOdometerReading());
                    System.out.println("Price: $" + vehicle.getPrice());
                    System.out.println("----------------------------------------------------");
                    found = true; // Sets Found to True If any data was found -----------------------------------------

                    // Timer Between Displaying Results ---------------------------------------------------------------
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        System.out.println("Code Broke");
                        throw new RuntimeException(e);
                    }
                }
            } // Search Loop End // -----------------------------------------------------------------------------------
            if (found) { // Found = True // Immediately asks to search again ------------------------------------------
                System.out.println("\nSearch Again?");
                System.out.println("(Y)es or (N)o");
                char searchAgain = scanner.nextLine().toUpperCase().charAt(0);
                boolean tryAgain = false;
                while (!tryAgain) { // Found True Loop Start // -------------------------------------------------------
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
                } // Found True Loop End ------------------------------------------------------------------------------
            }
            if (!found) { // Found False // Displays Error Message before asking to search again ----------------------

                // Timer to make it look like it searched VERY VERY hard ----------------------------------------------
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    System.out.println("Code Broke");
                    throw new RuntimeException(e);
                }
                System.out.println("No Matching Vehicles");

                // Timer Before Search Again Sequence -----------------------------------------------------------------
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Code Broke");
                    throw new RuntimeException(e);
                }

                // Search Again Sequence ------------------------------------------------------------------------------
                System.out.println("\nSearch Again?");
                System.out.println("(Y)es or (N)o");
                char searchAgain = scanner.nextLine().toUpperCase().charAt(0);
                boolean tryAgain = false;
                while (!tryAgain) { // Found False Loop Start // ------------------------------------------------------
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
                } // Found False Loop End // --------------------------------------------------------------------------

            }


        } // Search By Color Loop End // ------------------------------------------------------------------------------
    } // Method 4 // Search By Color End // ---------------------------------------------------------------------------

    public static void addVehicle(Vehicle[] vehicleInventory) {

        //Variable Introduction (Only Primitive Number Types Strings Are Declared In Code) ----------------------------
        Scanner scanner = new Scanner(System.in);
        long vehicleID = 0;
        int odometerReading = 0;
        float price = 0;

        //Introducing The System --------------------------------------------------------------------------------------
        System.out.println("\n----------------------------------------------------");
        System.out.println("Add A New Vehicle");
        System.out.println("We will do this in a few steps!");

        // Gathering User Input For Vehicle ID // ---------------------------------------------------------------------
        while (vehicleID == 0) { // ID Loop Start // ------------------------------------------------------------------
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
        } // ID Loop End // -------------------------------------------------------------------------------------------

        // Gathering User Input For Make/Model // ---------------------------------------------------------------------
        System.out.println("\nWhat is the Make and Model?");
        String[] makeModelInput = scanner.nextLine().trim().toLowerCase().split(" ");

        // String For Make Model Declared // and Valued Here AFTER User Input ------------------------------------------
        String makeModel = makeModelInput[0].substring(0, 1).toUpperCase() + makeModelInput[0].substring(1) + " " + makeModelInput[1].substring(0, 1).toUpperCase() + makeModelInput[1].substring(1);
        // makeModelInput[0].substring(0, 1).toUpperCase() + makeModelInput[0].substring(1) // This Makes First Letter Of MAKE Upper Case
        // makeModelInput[1].substring(0, 1).toUpperCase() + makeModelInput[1].substring(1) // This makes first letter of MODEL Upper case

        // Gathering User Input For Color // --------------------------------------------------------------------------
        System.out.println("\nWhat is the color?");
        String colorInput = scanner.nextLine().trim();

        // String For Color Declared //  and Valued Here AFTER User Input ----------------------------------------------
        String color = colorInput.toLowerCase().substring(0, 1).toUpperCase() + colorInput.substring(1);
        // colorInput.toLowerCase().substring(0, 1).toUpperCase() + colorInput.substring(1) // Used to make First Letter of COLOR Upper Case

        // Gathering User Input For Odometer Reading // ---------------------------------------------------------------
        while (odometerReading < 1) { //Odom Loop Start // ------------------------------------------------------------
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
        } // Odom Loop End // -----------------------------------------------------------------------------------------

        // Gathering User Input For Price // --------------------------------------------------------------------------
        while (price == 0) { // Price Loop Start // -------------------------------------------------------------------
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
        } // Price Loop End // ----------------------------------------------------------------------------------------


        // Confirming All User Inputs Loop // -------------------------------------------------------------------------
        boolean confirmed = false;
        while (!confirmed) { // Confirm Loop Start // -----------------------------------------------------------------
            System.out.println("\nIs all of your info correct?");
            System.out.println("\nVID: " + vehicleID);
            System.out.println("Make/Model: " + makeModel);
            System.out.println("Color: " + color);
            System.out.println("Odom Reading: " + odometerReading);
            System.out.println("Price: $" + price);
            System.out.println("\n(Y)es or (N)o");
            char isCorrect = scanner.nextLine().toUpperCase().charAt(0); // User Input for Confirm --------------------

            if (isCorrect == 'Y') {
                confirmed = true;
            } else if (isCorrect == 'N') {

                // User Selected Information was Wrong // -------------------------------------------------------------
                boolean changeMade = false;
                while (!changeMade) { // Need To Make Changes Loop Start // -------------------------------------------
                    System.out.println("\nWhich part needs to be changed?");

                    // Timer Before Re-Displaying Info To let User Process Message ------------------------------------
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Code Broke");
                        throw new RuntimeException(e);
                    }

                    // Re-Displays Info So user can verify if changes need to be made --------------------------------
                    System.out.println("\n(A) VID: " + vehicleID);
                    System.out.println("(B) Make/Model: " + makeModel);
                    System.out.println("(C) Color: " + color);
                    System.out.println("(D) Odom Reading: " + odometerReading);
                    System.out.println("(E) Price: $" + price);
                    System.out.println("(N) Nothing, everything looks good!");
                    System.out.println("\n(A) (B) (C) (D) (E) (N)");
                    char userChange = scanner.nextLine().toUpperCase().charAt(0); // User input to confirm which change to make //

                    if (userChange == 'A') { // Vehicle ID Change // ---------------------------------------------------
                        // Reset VID -----------------------------------------------------------------------------------
                        vehicleID = 0;

                        // Gathering Vehicle ID RE-ENTRY // -----------------------------------------------------------
                        while (vehicleID == 0) { // VID RE ENTRY LOOP start // ----------------------------------------
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
                        } // VID RE ENTRY LOOP end //------------------------------------------------------------------
                        changeMade = true; // Sends User Back To Confirm Info Loop //----------------------------------

                    } else if (userChange == 'B') { // Make Model Change // -------------------------------------------

                        // Gathering Make/Model RE-ENTRY // -----------------------------------------------------------
                        System.out.println("\nWhat is the Make and Model?");
                        makeModelInput = scanner.nextLine().trim().toLowerCase().split(" ");
                        makeModel = makeModelInput[0].substring(0, 1).toUpperCase() + makeModelInput[0].substring(1) + " " + makeModelInput[1].substring(0, 1).toUpperCase() + makeModelInput[1].substring(1);
                        changeMade = true; // Sends User Back To Confirm Info Loop ------------------------------------
                    } else if (userChange == 'C') { // Color Change // ------------------------------------------------

                        // Gathering Color RE-ENTRY // ----------------------------------------------------------------
                        System.out.println("\nWhat is the color?");
                        colorInput = scanner.nextLine().trim();
                        color = colorInput.toLowerCase().substring(0, 1).toUpperCase() + colorInput.substring(1);
                        changeMade = true; // Sends User Back To Confirm Info Loop ------------------------------------
                    } else if (userChange == 'D') { // Odometer Reading Change // -------------------------------------
                        // Reset Odom Reading -------------------------------------------------------------------------
                        odometerReading = 0;

                        // Gathering Odometer Reading RE-ENTRY // -----------------------------------------------------
                        while (odometerReading == 0) { //ODOM RE-ENTRY LOOP start // ----------------------------------
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
                        } // ODOM RE-ENTRY LOOP END // ----------------------------------------------------------------
                        changeMade = true; // Sends User Back To Confirm Info Loop ------------------------------------
                    } else if (userChange == 'E') { // Price Change // -----------------------------------------------
                        // Reset Price --------------------------------------------------------------------------------
                        price = 0;

                        // Gathering Price RE-ENTRY // ----------------------------------------------------------------
                        while (price == 0) { // PRICE RE-ENTRY LOOP start // -----------------------------------------
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
                        }// PRICE RE-ENTRY LOOP end // ----------------------------------------------------------------
                        changeMade = true; // Sends User Back To Confirm Info Loop ------------------------------------

                    } else if (userChange == 'N') { // NO CHANGE NEEDED // --------------------------------------------
                        changeMade = true; // Sends User Back To Confirm Info Loop ------------------------------------
                    } else { // (A) (B) (C) (D) (E) (N) Error Message -------------------------------------------------
                        System.out.println("-------------------------------");
                        System.out.println("Invalid Input. (A) (B) (C) (D) (E) (N).");
                        System.out.println("-------------------------------");
                    }
                } // NEED TO MAKE CHANGES LOOP END // -----------------------------------------------------------------

            } else { // Yes/No To Confirm Error Message
                System.out.println("-------------------------------");
                System.out.println("Invalid Input. (Y) or (N).");
                System.out.println("-------------------------------");
            }
        } // Confirm Loop End // --------------------------------------------------------------------------------------

        // Add To Inventory Loop // -----------------------------------------------------------------------------------
        boolean added = false;
        while (!added) { // Added Loop Start // -----------------------------------------------------------------------

            // Shows Final Details After Changes and Confirmation // --------------------------------------------------
            System.out.println("\n--------------------------------------------------");
            System.out.println("Thank you for confirming.");
            System.out.println("\nVID: " + vehicleID);
            System.out.println("Make/Model: " + makeModel);
            System.out.println("Color: " + color);
            System.out.println("Odom Reading: " + odometerReading);
            System.out.println("Price: $" + price);
            System.out.println("--------------------------------------------------");

            // Add To Inventory Confirmation Loop // ------------------------------------------------------------------
            char addIt = 0;
            while (addIt == 0) { //Add It Loop Start // ---------------------------------------------------------------
                System.out.println("\nAdd this vehicle to inventory?");
                System.out.println("(Y)es or (N)o?");
                addIt = scanner.nextLine().trim().toUpperCase().charAt(0);

                if (addIt == 'Y') { // Adds Vehicle To Inventory // ---------------------------------------------------
                    Vehicle newVehicle = new Vehicle(vehicleID, makeModel, color, odometerReading, price);
                    boolean vehicleLoaded = false;
                    for (int i = 0; i < vehicleInventory.length; i++) { // Finds First Empty Slot In Inventory With No Data //
                        if (vehicleInventory[i] == null) {
                            vehicleInventory[i] = newVehicle;
                            vehicleLoaded = true; // Makes sure Error Message never Plays // --------------------------

                            // Timer Before Success Message // --------------------------------------------------------
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                System.out.println("Code Broke");
                                throw new RuntimeException(e);
                            }

                            // Success Message ------------------------------------------------------------------------
                            System.out.println("\nSuccessfully added vehicle to inventory!");
                            added = true;
                            break;
                        }
                    }
                    if (!vehicleLoaded) { // Could Not Add Vehicle To Inventory // ------------------------------------
                        System.out.println("\nInventory is full, unable to add vehicle");
                        System.out.println("\nReturning to Main Menu....");

                        // Timer Before Returning User To Loop // -----------------------------------------------------
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            System.out.println("Code Broke");
                            throw new RuntimeException(e);
                        }

                    }
                } else if (addIt == 'N') { // Deny Adding Vehicle To Inventory // Will Return To Main Screen //--------

                    // Timer Before Displaying Cancellation Message // ------------------------------------------------
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        System.out.println("Code Broke");
                        throw new RuntimeException(e);
                    }

                    //Cancellation Message // -------------------------------------------------------------------------
                    System.out.println("Okay, cancelling transaction...");

                    // Timer Before Returning User To Main Screen // --------------------------------------------------
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Code Broke");
                        throw new RuntimeException(e);
                    }
                    added = true;

                } else {
                    System.out.println("-------------------------------");
                    System.out.println("Invalid Input. (Y) or (N).");
                    System.out.println("-------------------------------");
                }
            } // Add It Loop End // -----------------------------------------------------------------------------------
        } // Added Loop End // ----------------------------------------------------------------------------------------

    } // Method 5 // Add A Vehicle End // -----------------------------------------------------------------------------

}


