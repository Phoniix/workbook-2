package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
public class TheaterReservations {

    public static void  main (String [] args) {

        // Variable Introductions -------------------------------------------------------------------------------------
        Scanner scanner = new Scanner (System.in);
        boolean confirmed = false;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String userName = "";
        LocalDate showDate = null;
        int ticketCount = 0;

        // Introducing the System -------------------------------------------------------------------------------------
        System.out.println("\nHello User! This is a program to help you set your theater ticket reservation!");
        System.out.println("We will do this one line at a time!");
        System.out.println("\nFirst Step: ");

        // Gather Full Name -------------------------------------------------------------------------------------------
        while (!confirmed) {
            System.out.println("What is your name?");
            System.out.println("Enter: ");
            userName = scanner.nextLine().toLowerCase().trim();

            // Confirm Name -------------------------------------------------------------------------------------------
            System.out.println("\nIs [" + nameToPartsToName(userName)+ "] correct? (Y) or (N).");
            System.out.println("(Y)es");
            System.out.println("(N)o");
            char isRight = scanner.nextLine().toUpperCase().charAt(0);

            if (isRight == 'Y') {
                break;
            } else if (isRight == 'N') {
                continue;
            } else {
                System.out.println("-------------------------------");
                System.out.println("Invalid Input: DO OVER");
                System.out.println("-------------------------------");
            }
        }
        // Gather Date ------------------------------------------------------------------------------------------------
        while (!confirmed) {
            System.out.println("\nOn What day do you plan on visiting?");
            boolean dateConfrimed = false; //Local Variable used for local loop ---------------------------------------
            showDate = null; // Makes Date null if wrong input is entered ---------------------------------------------

            while (!dateConfrimed) {
                showDate = null;
                System.out.println("Please enter in DD/MM/YYYY format");
                System.out.println("Enter: ");
                if (showDate == null) {
                    try {
                        String eventDate = scanner.nextLine().trim();
                        showDate = LocalDate.parse(eventDate, formatter);
                        break;
                    } catch (DateTimeParseException e) { // Makes sure only my format is used -------------------------
                        System.out.println("-------------------------------");
                        System.out.println("Invalid Format: DO OVER");
                        System.out.println("-------------------------------");
                    } catch (NumberFormatException e) { //Makes sure only numbers can be input ------------------------
                        System.out.println("-------------------------------");
                        System.out.println("Invalid Format: NUMBERS ONLY");
                        System.out.println("-------------------------------");
                    }
                }
            }
            // Confirm Date -------------------------------------------------------------------------------------------
            System.out.println("\nIs [" + showDate + "] correct? (Y) or (N).");
            System.out.println("(Y)es");
            System.out.println("(N)o");
            char isRight = scanner.nextLine().toUpperCase().charAt(0);
            if (isRight == 'Y') {
                break;
            } else if (isRight == 'N') {
                continue;
            } else {
                System.out.println("-------------------------------");
                System.out.println("Invalid Input: DO OVER");
                System.out.println("-------------------------------");
            }
        }
        // Gather Ticket Count ----------------------------------------------------------------------------------------
        while (!confirmed) {
            System.out.println("\nLast Step!");
            while (!confirmed) {
                System.out.println("How many tickets do you need?");
                System.out.println("Enter: ");
                try {
                    ticketCount = Integer.parseInt(scanner.nextLine().trim());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("-------------------------------");
                    System.out.println("Invalid Input: NUMBERS ONLY");
                    System.out.println("-------------------------------");
                }
            }
            System.out.println("\nIs [" + ticketCount+ "] correct? (Y) or (N).");
            System.out.println("(Y)es");
            System.out.println("(N)o");
            char isRight = scanner.nextLine().toUpperCase().charAt(0);

            if (isRight == 'Y') {
                break;
            } else if (isRight == 'N') {
                continue;
            } else {
                System.out.println("-------------------------------");
                System.out.println("Invalid Input: DO OVER");
                System.out.println("-------------------------------");
            }
        }
        // Result of inputs -------------------------------------------------------------------------------------------
        System.out.println("\nHere is your order breakdown!");
        if (ticketCount > 1) { // Multiple ticket(s) ------------------------------------------------------------------
            System.out.println(ticketCount + " tickets reserved for " + showDate + " under " + nameToPartsToName(userName));
        } if (ticketCount <= 1) { // Singular ticket (no s) -----------------------------------------------------------
            System.out.println(ticketCount + " tickets reserved for " + showDate + " under " + nameToPartsToName(userName));
        }

    }

    // USE THIS FOR THE LOVE OF GOD. GREAT FREAKING METHOD ------------------------------------------------------------
    public static String nameToPartsToName (String name) {
        String [] nameParts = name.trim().split(" ");
        String fullName = "";
        if (nameParts.length == 3) {
            String firstName = nameParts [0].toLowerCase().substring(0, 1).toUpperCase() + nameParts[0].substring(1);
            String middleName = nameParts [1].toLowerCase().substring(0, 1).toUpperCase() + nameParts[1].substring(1);;
            String lastName = nameParts [2].toLowerCase().substring(0, 1).toUpperCase() + nameParts[2].substring(1);;
            fullName = firstName + " " + middleName + " " + lastName;
        } if (nameParts.length == 2) {
            String firstName = nameParts [0].toLowerCase().substring(0, 1).toUpperCase() + nameParts[0].substring(1);
            String lastName = nameParts [1].toLowerCase().substring(0, 1).toUpperCase() + nameParts[1].substring(1);;
            fullName = firstName + " " + lastName;
        } if (nameParts.length == 1) {
            String firstName = nameParts [0].toLowerCase().substring(0, 1).toUpperCase() + nameParts[0].substring(1);
            fullName = firstName;
        }
        return fullName;
    }
}
