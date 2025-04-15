import java.util.Scanner;

public class FullNameApplication {
    Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        // Introduce Variables ----------------------------------------------------------------------------------------
        Scanner scanner = new Scanner(System.in);
        String firstName = "";
        String middleName = "";
        String lastName = "";
        String suffixName = "";
        boolean firstNameConfirm = false;
        boolean secondNameConfirm = false;
        boolean lastNameConfirm = false;
        boolean suffixConfirm = false;

        // Introduce System -------------------------------------------------------------------------------------------
        System.out.println("Hello User! This is your name compiler");
        System.out.println("You just have to fill out a few fields and I'll spit out your name!");
        System.out.println("\n First Step");

        //Gather First Name -------------------------------------------------------------------------------------------
        while (!firstNameConfirm) {
            System.out.println("What is your first name?");
            firstName = scanner.nextLine().toLowerCase().trim(); // FirstName Input -----------------------------------

            System.out.println("\nIs [" + firstName + "] correct? All lowercase is expected here.");
            System.out.println("(Y)es");
            System.out.println("(N)o");
            System.out.println("Enter: ");
            char confirmed = scanner.nextLine().toUpperCase().charAt(0); // Confirm Possibility Input -----------------
            if (confirmed == 'Y') {
                confirmed = 0;
                firstNameConfirm = true;
                break;
            } else if (confirmed == 'N') { // First Name Does not need Re-Entry Input ---------------------------------
                continue;
            } else {
                System.out.println("---------------------------");
                System.out.println("Invalid Input: DO OVER");
                System.out.println("---------------------------");
            }
        }
        // Gather Middle Name -----------------------------------------------------------------------------------------
        while (!secondNameConfirm) {
            System.out.println("\nDo you have a middle/second name?");
            System.out.println("(Y)es");
            System.out.println("(N)o");
            char doYou = scanner.nextLine().toUpperCase().trim().charAt(0);// Confirm Possibility Input ---------------
            if (doYou == 'Y') {
                System.out.println("\nWhat is your middle name?");
                middleName = scanner.nextLine().toLowerCase().trim(); //MiddleName Input ------------------------------
                break;
            } else if (doYou == 'N') {
                System.out.println("Gotcha no middle name!");
                middleName = "0";
                break;
            } else {
                System.out.println("---------------------------");
                System.out.println("Invalid Input: DO OVER");
                System.out.println("---------------------------");
                continue;
            }
        }

        while (!secondNameConfirm) {
            System.out.println("\nIs [" + middleName + "] correct? All lowercase is expected here.");
            System.out.println("If you typed nothing it should be '0'.");
            System.out.println("(Y)es");
            System.out.println("(N)o");
            System.out.println("Enter: ");
            char confirmed = scanner.nextLine().toUpperCase().charAt(0); // Confirm Possibility Input -----------------
            if (confirmed == 'Y') {
                secondNameConfirm = true;
                break;
            } else if (confirmed == 'N') {
                System.out.println("\nPlease re-enter middle name");
                middleName = scanner.nextLine().trim().toLowerCase(); //Re-Entry Middle Name Input ---------------------
                continue;
            } else {
                System.out.println("---------------------------");
                System.out.println("Invalid Input: DO OVER");
                System.out.println("---------------------------");
            }
        }

        // Gather Last Name -------------------------------------------------------------------------------------------
            System.out.println("\nWhat is your last name?");
            lastName = scanner.nextLine().toLowerCase().trim(); // Last Name Input ------------------------------------

        while (!lastNameConfirm) {
            System.out.println("\nIs [" + lastName + "] correct? All lowercase is expected here.");
            System.out.println("(Y)es");
            System.out.println("(N)o");
            System.out.println("Enter: ");
            char confirmed = scanner.nextLine().toUpperCase().charAt(0);// Confirm Possibility Input ------------------
            if (confirmed == 'Y') {
                confirmed = 0;
                lastNameConfirm = true;
                break;
            } else if (confirmed == 'N') {
                System.out.println("\nPlease re-enter last name"); // Re-Entry Last Name Input ------------------------
                lastName = scanner.nextLine().trim().toLowerCase();
                continue;
            } else {
                System.out.println("---------------------------");
                System.out.println("Invalid Input: DO OVER");
                System.out.println("---------------------------");
            }
        }

        // Gather Suffix ----------------------------------------------------------------------------------------------
        while (!suffixConfirm) {
            System.out.println("\nDo you have a suffix?");
            System.out.println("(Y)es");
            System.out.println("(N)o");
            char doYou = scanner.nextLine().toUpperCase().trim().charAt(0); //Confirm Possibility Input  --------------
            if (doYou == 'Y') {
                System.out.println("\nWhat is your suffix? Be case Sensitive here.");
                suffixName = scanner.nextLine().trim(); // SuffixName Input -------------------------------------------
                break;
            } else if (doYou == 'N') {
                System.out.println("Gotcha no suffix!");
                suffixName = "0";
                break;
            } else {
                System.out.println("---------------------------");
                System.out.println("Invalid Input: DO OVER");
                System.out.println("---------------------------");
                continue;
            }
        }
        while (!suffixConfirm) {
            System.out.println("\nIs [" + suffixName + "] correct? Check Case here.");
            System.out.println("If you typed nothing it should be '0'.");
            System.out.println("(Y)es");
            System.out.println("(N)o");
            System.out.println("Enter: ");
            char confirmed = scanner.nextLine().toUpperCase().charAt(0); // Confirm Possibility Input -----------------
            if (confirmed == 'Y') {
                suffixConfirm = true;
                break;
            } else if (confirmed == 'N') {
                System.out.println("\nPlease re-enter suffix");
                suffixName = scanner.nextLine().trim().toLowerCase(); // Re-Entry Suffix Input ------------------------
                continue;
            } else {
                System.out.println("---------------------------");
                System.out.println("Invalid Input: DO OVER");
                System.out.println("---------------------------");
            }
        }

        String fullName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1) + " " + middleName.substring(0, 1).toUpperCase() + ". " + lastName.substring(0, 1).toUpperCase() + lastName.substring(1) + ", " +suffixName;

        if (middleName.equals("0") && suffixName.equals("0")) {
            fullName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1) + " " + lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
        } else if (middleName.equals("0")) {
            fullName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1) + " " + lastName.substring(0, 1).toUpperCase() + lastName.substring(1) + ", " +suffixName;
        } else if ((suffixName.equals("0"))) {
            fullName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1) + " " + middleName.substring(0, 1).toUpperCase() + ". " + lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
        }


        System.out.println("\nHere is your Full Name!");
        System.out.println(fullName);
    }
}







