package com.pluralsight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NeighborhoodLibrary {

    public static void main(String[] args) {
        //Variable Introductions --------------------------------------------------------------------------------------
        Scanner scanner = new Scanner(System.in);
        Book[] bookInventory = new Book[20];

        // 20 Book Variables (I 100% let ChatGPT have creative input here, I am coding not making book titles) // -----
        Book theSilentPatient = new Book(1, "978-0143127741", "The Silent Patient", false, "");
        Book dune = new Book(2, "978-0553380163", "Dune", true, "Alice Johnson");
        Book harryPotterGobletOfFire = new Book(3, "978-0439139601", "Harry Potter and the Goblet of Fire", false, "");
        Book theAlchemist = new Book(4, "978-0062315007", "The Alchemist", true, "Mike Thompson");
        Book nineteenEightyFour = new Book(5, "978-0451524935", "1984", false, "");
        Book theRoad = new Book(6, "978-0307346605", "The Road", false, "");
        Book theBookThief = new Book(7, "978-0307277671", "The Book Thief", true, "Rachel Kim");
        Book toKillAMockingbird = new Book(8, "978-0446310789", "To Kill a Mockingbird", true, "David Lee");
        Book braveNewWorld = new Book(9, "978-0061120084", "Brave New World", false, "");
        Book itEndsWithUs = new Book(10, "978-1501128035", "It Ends With Us", false, "");
        Book lifeOfPi = new Book(11, "978-1400078776", "Life of Pi", true, "Samantha Green");
        Book theCatcherInTheRye = new Book(12, "978-0316769488", "The Catcher in the Rye", false, "");
        Book twilight = new Book(13, "978-0316015844", "Twilight", false, "");
        Book fahrenheit451 = new Book(14, "978-0060850524", "Fahrenheit 451", true, "Carlos Ramirez");
        Book verity = new Book(15, "978-1501173219", "Verity", true, "Emily Tran");
        Book sapiens = new Book(16, "978-0374533557", "Sapiens", false, "");
        Book paperTowns = new Book(17, "978-0385755887", "Paper Towns", false, "");
        Book becoming = new Book(18, "978-1524763169", "Becoming", false, "");
        Book goneGirl = new Book(19, "978-0307588371", "Gone Girl", true, "Brian Davis");
        Book zenAndTheArt = new Book(20, "978-0385472579", "Zen and the Art of Motorcycle Maintenance", false, "");

        // Setting the BookInventory // -------------------------------------------------------------------------------
        bookInventory[0] = theSilentPatient;
        bookInventory[1] = dune;
        bookInventory[2] = harryPotterGobletOfFire;
        bookInventory[3] = theAlchemist;
        bookInventory[4] = nineteenEightyFour;
        bookInventory[5] = theRoad;
        bookInventory[6] = theBookThief;
        bookInventory[7] = toKillAMockingbird;
        bookInventory[8] = braveNewWorld;
        bookInventory[9] = itEndsWithUs;
        bookInventory[10] = lifeOfPi;
        bookInventory[11] = theCatcherInTheRye;
        bookInventory[12] = twilight;
        bookInventory[13] = fahrenheit451;
        bookInventory[14] = verity;
        bookInventory[15] = sapiens;
        bookInventory[16] = paperTowns;
        bookInventory[17] = becoming;
        bookInventory[18] = goneGirl;
        bookInventory[19] = zenAndTheArt;

        // Keep Program going loop // ---------------------------------------------------------------------------------
        boolean keepGoing = true;
        while (keepGoing) {

            // Introducing the system ---------------------------------------------------------------------------------
            int userSelect = 0;
            do { // User Selection Do-While Loop Start // -------------------------------------------------------------
                System.out.println("\n-------------------------------------------------------");
                System.out.println("Good Day User! Welcome to your Neighborhood Library!");
                System.out.println("What service do you need today?");
                System.out.println("\n(1) Show available books");
                System.out.println("(2) Show checked out books");
                System.out.println("(3) Exit Application");

                try {
                    userSelect = Integer.parseInt(scanner.nextLine().trim());
                } catch (NumberFormatException e) {
                    System.out.println("\n----------------------------");
                    System.out.println("Invalid Input. Numbers Only.");
                    System.out.println("----------------------------");
                } catch (InputMismatchException e) {
                    System.out.println("\n----------------------------");
                    System.out.println("Invalid Input. Number Out Of Range.");
                    System.out.println("----------------------------");
                }

                if (userSelect == 1) {
                    displayAllAvailableBooks(bookInventory, scanner);
                } else if (userSelect == 2) {
                    displayCheckedOutBooks(bookInventory, scanner);
                } else if (userSelect == 3) {
                    System.out.println("\n----------------------------");
                    System.out.println("Thank you for using Neighborhood Library App!");
                    System.out.println("Goodbye!");
                    System.out.println("----------------------------");

                    try {
                        Thread.sleep(2500);
                    } catch (InterruptedException e) {
                        System.out.println("Code Broke");
                        throw new RuntimeException();
                    }
                    return;
                } else {
                    System.out.println("\n----------------------------");
                    System.out.println("Invalid Input. (1), (2), or (3).");
                    System.out.println("----------------------------");
                }
            } while (userSelect == 0);


        }


    }

    public static void displayAllAvailableBooks(Book[] bookInventory, Scanner scanner) {

        //Introducing the system // -----------------------------------------------------------------------------------
        boolean keepGoing = true;
        while (keepGoing) {

            System.out.println("\nDisplaying all available books... ");
            System.out.println("Just a sec...");

            // Timer Before 1st Display Is Listed // ----------------------------------------------------------------------
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                System.out.println("Code Broke");
                throw new RuntimeException();
            }

            boolean foundResult = false;
            for (Book book : bookInventory) {
                // Timer Between Each Display // --------------------------------------------------------------------------
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Code Broke");
                    throw new RuntimeException();
                }

                if (!book.getIsBookIsCheckedOut() && book != null) {
                    System.out.println("\n---------------------------------------------");
                    System.out.println("Book Entry #: " + book.getBookID());
                    System.out.println("Book ISBN: " + book.getBookISBN());
                    System.out.println("Book Title: " + book.getBookTitle());
                    System.out.println("---------------------------------------------");
                    foundResult = true;

                }
            }

            if (foundResult) {
                boolean confirmCheck = false;
                while (!confirmCheck) {

                    System.out.println("\nAbove are all available books.");
                    System.out.println("Would you like to check one out? (Y) or (N)");
                    System.out.println("(Y)es or (N)o?");
                    char checkOut = scanner.nextLine().trim().toUpperCase().charAt(0);

                    if (checkOut == 'Y') {
                        int userBookSelect = 0;
                        for (Book book : bookInventory) {
                            System.out.println("\n---------------------------------------------");
                            System.out.println("Book Entry #: " + book.getBookID());
                            System.out.println("Book ISBN: " + book.getBookISBN());
                            System.out.println("Book Title: " + book.getBookTitle());
                            System.out.println("\nPlease Enter: (" + book.getBookID() + ") to select this book.");
                            System.out.println("---------------------------------------------");
                        }
                            boolean selectConfirm = false;
                            while (!selectConfirm) {
                                System.out.println("\nWhen you make your decision, enter the corresponding number");
                                System.out.println("Enter: ");
                                try {
                                    userBookSelect = Integer.parseInt(scanner.nextLine().trim());
                                } catch (NumberFormatException e) {
                                    System.out.println("\n----------------------------");
                                    System.out.println("Invalid Input. Numbers Only.");
                                    System.out.println("----------------------------");
                                } catch (InputMismatchException e) {
                                    System.out.println("\n----------------------------");
                                    System.out.println("Invalid Input. Number Out Of Range.");
                                    System.out.println("----------------------------");
                                }

                                for (Book book : bookInventory) {
                                    if (userBookSelect == book.getBookID() && book != null && !book.getIsBookIsCheckedOut()) {
                                        System.out.println("\n---------------------------------------------");
                                        System.out.println("Book Entry #: " + book.getBookID());
                                        System.out.println("Book ISBN: " + book.getBookISBN());
                                        System.out.println("Book Title: " + book.getBookTitle());
                                        System.out.println("\nYou Entered: (" + book.getBookID() + ")");
                                        System.out.println("\nPlease Confirm Checkout. (Y) or (N)");
                                        System.out.println("---------------------------------------------");
                                        char userCheckoutConfirm = scanner.nextLine().trim().toUpperCase().charAt(0);

                                        if (userCheckoutConfirm == 'Y') {
                                            boolean userConfirm = false;
                                            while (!userConfirm) {
                                                System.out.println("\nJust a sec... Processing...");
                                                try {
                                                    Thread.sleep(1000);
                                                } catch (InterruptedException e) {
                                                    System.out.println("Code Broke");
                                                    throw new RuntimeException();
                                                }

                                                System.out.println("\n---------------------------------------------");
                                                System.out.println("Please enter your name to complete checkout");
                                                System.out.println("---------------------------------------------");
                                                System.out.println("\nEnter: ");

                                                // || ------   "\\s+" was a ChatGPT suggestion to remove extra spaces
                                                String [] userNameInput = scanner.nextLine().trim().toLowerCase().split("\\s+");

                                                if (userNameInput.length < 2) {
                                                    System.out.println("\n----------------------------");
                                                    System.out.println("Invalid Input. Please enter valid first and last name.");
                                                    System.out.println("----------------------------");
                                                    continue;
                                                }

                                                String userName = userNameInput [0].substring(0, 1).toUpperCase() + userNameInput [0].substring(1) + " " + userNameInput [1].substring(0, 1).toUpperCase() + userNameInput[1].substring(1);
                                                System.out.println("\nLast Confirmation");
                                                System.out.println("You entered [" + userName + "] correct? (Y) or (N)");
                                                System.out.println("Enter: ");
                                                char nameConfirm = scanner.nextLine().trim().toUpperCase().charAt(0);

                                                if (nameConfirm == 'Y') {
                                                    try {
                                                        Thread.sleep(1500);
                                                    } catch (InterruptedException e) {
                                                        System.out.println("Code Broke");
                                                        throw new RuntimeException();
                                                    }

                                                    book.checkOut(userName);
                                                    System.out.println("\nCheckout was completed successfully!");
                                                    System.out.println("Returning to Main Screen.");

                                                    try {
                                                        Thread.sleep(2500);
                                                    } catch (InterruptedException e) {
                                                        System.out.println("Code Broke");
                                                        throw new RuntimeException();
                                                    }
                                                    return;
                                                } else if (nameConfirm == 'N') {
                                                    continue;
                                                } else {
                                                    System.out.println("\n----------------------------");
                                                    System.out.println("Invalid Input. (Y) or (N).");
                                                    System.out.println("----------------------------");
                                                    continue;
                                                }
                                            }

                                        } else if (userCheckoutConfirm == 'N') {
                                            System.out.println("\nReturning to checkout...");
                                            System.out.println("Just a sec...");
                                            try {
                                                Thread.sleep(2500);
                                            } catch (InterruptedException e) {
                                                System.out.println("Code Broke");
                                                throw new RuntimeException();
                                            }
                                            break;
                                        } else {
                                            System.out.println("\n----------------------------");
                                            System.out.println("Invalid Input. (Y) or (N).");
                                            System.out.println("----------------------------");
                                        }

                                    }
                                }
                            }

                    } else if (checkOut == 'N') {
                        boolean doneBrowsing =false;
                        while (!doneBrowsing) {
                            System.out.println("\nFeel free to browse");
                            System.out.println("If you change your mind press (C) to return to checkout!");
                            System.out.println("Otherwise when you are ready to leave, press (X)");
                            char browseSelect = scanner.nextLine().trim().toUpperCase().charAt(0);

                            if (browseSelect == 'C') {
                                doneBrowsing = true;
                                //confirmCheck = true;
                                break;
                            } else if (browseSelect == 'X') {
                                System.out.println("\nReturning to Main Screen...");
                                System.out.println("Just a sec...");

                                try {
                                    Thread.sleep(2500);
                                } catch (InterruptedException e) {
                                    System.out.println("Code Broke");
                                    throw new RuntimeException();
                                }

                                doneBrowsing = true;
                                confirmCheck = true;
                                keepGoing = false;
                                break;
                            } else {
                                System.out.println("\n----------------------------");
                                System.out.println("Invalid Input. (Y) or (N).");
                                System.out.println("----------------------------");
                            }
                        }
                    } else {
                        System.out.println("\n----------------------------");
                        System.out.println("Invalid Input. (Y) or (N).");
                        System.out.println("----------------------------");
                    }
                }
            }
        }
    }

    public static void displayCheckedOutBooks (Book [] bookInventory, Scanner scanner) {

        boolean keepGoing = true;
        while (keepGoing){
            System.out.println("\nDisplaying all CHECKED OUT books... ");
            System.out.println("Just a sec...");

            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                System.out.println("Code Broke");
                throw new RuntimeException();
            }

            boolean foundResult = false;
            for (Book book : bookInventory) {
                // Timer Between Each Display // --------------------------------------------------------------------------
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Code Broke");
                    throw new RuntimeException();
                }

                if (book.getIsBookIsCheckedOut() && book != null) {
                    System.out.println("\n---------------------------------------------");
                    System.out.println("Book Entry #: " + book.getBookID());
                    System.out.println("Book ISBN: " + book.getBookISBN());
                    System.out.println("Book Title: " + book.getBookTitle());
                    System.out.println("Is Book Checked out? " + (book.getIsBookIsCheckedOut() ? "Yes" : "No")); // ChatGPT suggested ternary operator for this print statement.
                    System.out.println("---------------------------------------------");
                    foundResult = true;

                }
            }
            boolean menuConfirm = false;
            while (!menuConfirm) {
            System.out.println("\n---------------------------------------------");
            System.out.println("\nFeel free to browse the checked out book section.");
            System.out.println("If you need to CHECK IN a book enter (C).");
            System.out.println("To exit this section and return to main screen press (X).");
            System.out.println("---------------------------------------------");
            char userMenuChoice = scanner.nextLine().trim().toUpperCase().charAt(0);


                if (userMenuChoice == 'C') {

                    boolean checkInSelect = false;
                    while (!checkInSelect) {
                        System.out.println("\n---------------------------------------------");
                        System.out.println("Thanks for your return visit!");
                        System.out.println("Simply enter the Book ID to start CHECK IN process.");
                        System.out.println("---------------------------------------------");
                        System.out.println("Enter: ");
                        int bookIDInput = 0;

                        try {
                            bookIDInput = Integer.parseInt(scanner.nextLine().trim());
                        } catch (NumberFormatException e) {
                            System.out.println("\n----------------------------");
                            System.out.println("Invalid Input. Numbers Only");
                            System.out.println("----------------------------");
                        } catch (InputMismatchException e) {
                            System.out.println("\n----------------------------");
                            System.out.println("Invalid Input. Number out of range.");
                            System.out.println("----------------------------");
                        }
                        System.out.println(bookIDInput);
                        for (Book book : bookInventory) {
                            if (book.getIsBookIsCheckedOut() && book != null && bookIDInput == book.getBookID()) {
                                System.out.println("\n---------------------------------------------");
                                System.out.println("Book Entry #: " + book.getBookID());
                                System.out.println("Book ISBN: " + book.getBookISBN());
                                System.out.println("Book Title: " + book.getBookTitle());
                                System.out.println("Is Book Checked out? " + (book.getIsBookIsCheckedOut() ? "Yes" : "No")); // ChatGPT suggested ternary operator for this print statement.
                                System.out.println("Book is check out to: " + book.getBookIsCheckedOutTo());
                                System.out.println("---------------------------------------------");

                                boolean nameConfirm = false;
                                while (!nameConfirm) {
                                    System.out.println("\nPlease confirm this is you by typing your first and last name exactly as it is shown.");
                                    System.out.println("Enter: ");
                                    String[] userNameInput = scanner.nextLine().trim().toLowerCase().split("\\s+");
                                    if (userNameInput.length < 2) {
                                        System.out.println("\n----------------------------");
                                        System.out.println("Invalid Input. Please enter valid first and last name.");
                                        System.out.println("----------------------------");
                                        continue;
                                    }
                                    String userName = userNameInput [0].substring(0, 1).toUpperCase() + userNameInput [0].substring(1) + " " + userNameInput [1].substring(0, 1) + userNameInput [1].substring(1);

                                    if (book.getBookIsCheckedOutTo().toLowerCase().equalsIgnoreCase(userName)) {
                                        book.checkIn(userName);
                                        System.out.println("\n---------------------------------------------");
                                        System.out.println("Name is confirmed. Checking in...");
                                        System.out.println("Just a sec...");
                                        System.out.println("---------------------------------------------");

                                        try {
                                            Thread.sleep(1000);
                                        } catch (InterruptedException e) {
                                            System.out.println("Code Broke");
                                            throw new RuntimeException();
                                        }

                                        System.out.println("\n---------------------------------------------");
                                        System.out.println("Thank you for your check in and return!");
                                        System.out.println("You will now be redirected to the Main Screen...");
                                        System.out.println("Just a sec...");
                                        System.out.println("---------------------------------------------");

                                        try {
                                            Thread.sleep(1500);
                                        } catch (InterruptedException e) {
                                            System.out.println("Code Broke");
                                            throw new RuntimeException();
                                        }
                                        return;

                                    } else {
                                        System.out.println("\n----------------------------");
                                        System.out.println("Invalid Input. Name does not match.");
                                        System.out.println("----------------------------");
                                        continue;
                                    }
                                }
                            }


                        }
                    }
                } else if (userMenuChoice == 'X') {
                    System.out.println("\nReturning to Main Screen...");
                    System.out.println("Just a sec...");

                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        System.out.println("Code Broke");
                        throw new RuntimeException();
                    }
                    return;
                } else {
                    System.out.println("\n----------------------------");
                    System.out.println("Invalid Input. (C) or (X).");
                    System.out.println("----------------------------");
                }
            }
        }
    }
}
