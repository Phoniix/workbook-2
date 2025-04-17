package com.pluralsight;

import java.util.Scanner;

public class CodeSnippetsAndFunctions {

    public static String userInputName () {
        String userName = "";
        boolean confirmed = false;
        Scanner scanner = new Scanner(System.in);
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


        return nameToPartsToName(userName);
    }

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

    public static void introduceTheSystem (String introMessage) {
        System.out.println("\nHello User! This is a program to help you " + introMessage);
        System.out.println("We will do this one line at a time!");
        System.out.println("\nFirst Step: ");
    }

    public static String userInputPhoneNumber () {
            String userPhoneNumber = "";
            boolean confirmed = false;
            Scanner scanner = new Scanner(System.in);
            while (!confirmed) {
                System.out.println("\nWhat is your Phone Number?");
                System.out.println("Enter: ");
                try {
                    userPhoneNumber = scanner.nextLine().toLowerCase().trim();
                    userPhoneNumber = userPhoneNumber.replaceAll("[^0-9]", "");

                    if (userPhoneNumber.length() < 10) {
                        System.out.println("-------------------------------");
                        System.out.println("Invalid Input: NEED MORE NUMBERS");
                        System.out.println("-------------------------------");
                        continue;
                    } else {
                        userPhoneNumber = "(" + userPhoneNumber.substring(0, 3) + ") " + userPhoneNumber.substring(3, 6) + "-" + userPhoneNumber.substring(6, 10);
                    }
                } catch (ArithmeticException e) {
                    System.out.println("-------------------------------");
                    System.out.println("Invalid Input: NUMBERS ONLY");
                    System.out.println("-------------------------------");
                } catch (NumberFormatException e) {
                    System.out.println("-------------------------------");
                    System.out.println("Invalid Input: NUMBERS ONLY");
                    System.out.println("-------------------------------");
                }

                // Confirm Number -------------------------------------------------------------------------------------------
                System.out.println("\nIs [" + userPhoneNumber+ "] correct? (Y) or (N).");
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


            return userPhoneNumber;
        }

    public static String customInputName (String objectName) {
        String userName = "";
        boolean confirmed = false;
        Scanner scanner = new Scanner(System.in);
        while (!confirmed) {
            System.out.println("\nWhat is your " + objectName + "?");
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


        return nameToPartsToName(userName);
    }

    public static double customDoubleInput(String doubleName) {
        double customNumberInput = 0;
        boolean confirmed = false;
        Scanner scanner = new Scanner(System.in);
        while (!confirmed) {
            System.out.println("What is your " + doubleName + "?");
            System.out.println("Enter: ");
            try {
                customNumberInput = Double.parseDouble(scanner.nextLine().toLowerCase().trim());

            } catch (ArithmeticException e){

            } catch (NumberFormatException e) {
                System.out.println("-------------------------------");
                System.out.println("Invalid Input: NUMBERS ONLY");
                System.out.println("-------------------------------");
            }

            // Confirm Number -------------------------------------------------------------------------------------------
            System.out.println("\nIs [" + customNumberInput+ "] correct? (Y) or (N).");
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


        return customNumberInput;
    }

    public static long customLongInput(String longName) {
        long customNumberInput = 0;
        boolean confirmed = false;
        Scanner scanner = new Scanner(System.in);
        while (!confirmed) {
            System.out.println("\nWhat is your " + longName + "?");
            System.out.println("Enter: ");
            try {
                customNumberInput = Long.parseLong(scanner.nextLine().toLowerCase().trim());

            } catch (ArithmeticException e){

            } catch (NumberFormatException e) {
                System.out.println("-------------------------------");
                System.out.println("Invalid Input: NUMBERS ONLY");
                System.out.println("-------------------------------");
            }

            // Confirm Number -------------------------------------------------------------------------------------------
            System.out.println("\nIs [" + customNumberInput+ "] correct? (Y) or (N).");
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


        return customNumberInput;
    }

}
