import java.util.Scanner;
public class AddressBuilder {

    public static void main (String [] args) {

        // Variable Introductions -------------------------------------------------------------------------------------
        Scanner scanner = new Scanner(System.in);
        StringBuilder billingAddress = new StringBuilder();
        StringBuilder shippingAddress = new StringBuilder();
        String billingStreetAddress = "";
        String billingCity = "";
        String billingState = "";
        String billingZipcode = "";
        String shippingStreetAddress = "";
        String shippingCity = "";
        String shippingState = "";
        String shippingZipcode = "";
        String userName = "";
        boolean confirmed = false;

        //Introducing the System --------------------------------------------------------------------------------------
        System.out.println("\nHello User! This is a program to concatenate a billing and shipping address!");
        System.out.println("We will do this one line at a time!");
        System.out.println("\nFirst step!");

        //Gather Name -------------------------------------------------------------------------------------------------
        getName();

        // Gather Billing Info ----------------------------------------------------------------------------------------
        System.out.println("Next Step: Billing Address!");
        System.out.println("What is your house number and street address?");
        billingStreetAddress = scanner.nextLine().trim();
        setFormatting(billingStreetAddress);

        System.out.println("\n");

    }
    //Method To Ensure Proper Spacing and Capitalization of Name ------------------------------------------------------
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

    public static void getName () {
        //Local Variable Introductions----------------------------------------------------------------------------------
        Scanner scanner = new Scanner(System.in);
        boolean confirmed = false;
        String userName = "";
        while (!confirmed) {

            System.out.println("What is your name?");
            System.out.println("\nEnter: ");
            userName = scanner.nextLine();

            //Confirm Name --------------------------------------------------------------------------------------------
            System.out.println("Is [" + nameToPartsToName(userName) + "[ correct? (Y) or (N)");
            System.out.println("(Y)es");
            System.out.println("(N)o");
            char isRight = scanner.nextLine().trim().toUpperCase().charAt(0);

            if (isRight == 'Y') {
                break;
            } else if (isRight == 'N') {
                continue;
            } else {
                System.out.println("-----------------------------------------");
                System.out.println("Invalid Input: DO OVER");
                System.out.println("-----------------------------------------");
            }
        }
    }

    public static String setFormatting (String stringName) {
        String [] nameParts = stringName.trim().split(" ");
        String formattedName = "";
        if (nameParts.length == 10) {
            String partZero = nameParts [0];
            String partOne = nameParts [1].toLowerCase().substring(0, 1).toUpperCase() + nameParts [1].substring(1);
            String partTwo = nameParts [2].toLowerCase().substring(0, 1).toUpperCase() + nameParts [2].substring(1);
            String partThree = nameParts [3].toLowerCase().substring(0, 1).toUpperCase() + nameParts [3].substring(1);
            String partFour = nameParts [4].toLowerCase().substring(0, 1).toUpperCase() + nameParts [4].substring(1);
            String partFive = nameParts [5].toLowerCase().substring(0, 1).toUpperCase() + nameParts [5].substring(1);
        }





        if (nameParts.length == 5) {
            String partZero = nameParts [0];
            String partOne = nameParts [1].toLowerCase().substring(0, 1).toUpperCase() + nameParts [1].substring(1);
            String partTwo = nameParts [2].toLowerCase().substring(0, 1).toUpperCase() + nameParts [2].substring(1);
            String partThree = nameParts [3].toLowerCase().substring(0, 1).toUpperCase() + nameParts [3].substring(1);
            String partFour = nameParts [4].toLowerCase().substring(0, 1).toUpperCase() + nameParts [4].substring(1);
            formattedName = partZero + " " + partOne + " " + partTwo + " " + partThree  + " " + partFour;
        } if (nameParts.length == 4); {
            String partZero = nameParts [0];
            String partOne = nameParts [1].toLowerCase().substring(0, 1).toUpperCase() + nameParts [1].substring(1);
            String partTwo = nameParts [2].toLowerCase().substring(0, 1).toUpperCase() + nameParts [2].substring(1);
            String partThree = nameParts [3].toLowerCase().substring(0, 1).toUpperCase() + nameParts [3].substring(1);
            formattedName = partZero + " " + partOne + " " + partTwo + " " + partThree;
        } if (nameParts.length == 3) {
            String partZero = nameParts [0];
            String partOne = nameParts [1].toLowerCase().substring(0, 1).toUpperCase() + nameParts [1].substring(1);
            String partTwo = nameParts [2].toLowerCase().substring(0, 1).toUpperCase() + nameParts [2].substring(1);
            formattedName =  partZero + " " + partOne + " " + partTwo;
        } if (nameParts.length == 2) {
            String partZero = nameParts [0];
            String partOne = nameParts [1].toLowerCase().substring(0, 1).toUpperCase() + nameParts [1].substring(1);
            formattedName = partZero + " " + partOne;
        } if (nameParts.length == 1) {
            String partZero = nameParts [0];
            formattedName = partZero;
        }
        return formattedName;
    }
}
