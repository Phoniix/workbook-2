import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        boolean confirmed = false;
        Scanner scanner = new Scanner(System.in);

        while (!confirmed) {
            System.out.println(" YES OR NO"); //message
            System.out.println(" YES"); //options
            System.out.println("NO");
            char userChoice = scanner.nextLine().toUpperCase().charAt(0); //option getter

            //results
            if (userChoice == 'Y') {
                break;
            } else if (userChoice == 'N') {
                continue;
            } else {
                System.out.println("INVALID INPUT");
            }
        }


    }
}
