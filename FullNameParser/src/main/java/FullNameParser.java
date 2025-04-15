
import java.util.Scanner;

public class FullNameParser {

    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = "";
        String middleName = "";
        String lastName = "";
        String nameInput = "";
        boolean confirmed = false;


        System.out.println("\nHello User! This application will take your full name and divide it into parts!");
        System.out.println("This will be done in just one Step!");

        while (!confirmed) {
            System.out.println("\nFirst, please enter your name!");
            System.out.println("Enter: ");
            nameInput = scanner.nextLine().toLowerCase().trim();
            System.out.println("[" + nameInput + "] is the correct spelling right? (Y) or (N).");
            System.out.println("(Y)es");
            System.out.println("(N)o");
            char isRight = scanner.nextLine().toUpperCase().charAt(0);

            if (isRight == 'Y') {
                confirmed = true;
                break;
            } else if (isRight == 'N') {
                continue;
            } else {
                System.out.println("----------------------------------------");
                System.out.println("Invalid Input. DO OVER");
                System.out.println("----------------------------------------");
            }
        }
        String nameParts [] = nameInput.split(" ");
        if (nameParts.length == 3) {
            System.out.println("\nHere is your name breakdown:");
            System.out.println("First Name: " + nameParts[0].substring(0, 1).toUpperCase() + nameParts[0].substring(1));
            System.out.println("Middle Initial/Name: " + nameParts[1].substring(0, 1).toUpperCase() + "." + " / " + nameParts[1].substring(0, 1).toUpperCase() + nameParts[1].substring(1));
            System.out.println("Last Name: " + nameParts[2].substring(0, 1).toUpperCase() + nameParts[2].substring(1));
        } else if (nameParts.length == 2) {
            System.out.println("\nHere is your name breakdown:");
            System.out.println("First Name: " + nameParts[0].substring(0, 1).toUpperCase() + nameParts[0].substring(1));
            System.out.println("Last Name: " + nameParts[1].substring(0, 1).toUpperCase() + nameParts[1].substring(1));
        } else if (nameParts.length == 1) {
            System.out.println("\nHere is your name breakdown:");
            System.out.println("Your Name is: " + nameParts[0].substring(0, 1).toUpperCase() + nameParts[0].substring(1));
        } else {
            System.out.println("I Think this is beyond my pay grade...");
        }
    }

}
