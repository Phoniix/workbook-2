import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HighScoreWins {

    public static void main(String[] args) {

        // Variable Introduction --------------------------------------------------------------------------------------
        Scanner scanner = new Scanner(System.in);
        boolean confirmed = false;

        //Introducing The System --------------------------------------------------------------------------------------
        System.out.println("\nHello User! This program will take inputs for a game score\nAnd announce a victor based on inputs!");
        System.out.println("We will accomplish this one line at a time!");
        System.out.println("\nFirst Step:");

        while (!confirmed){
        System.out.println("Enter the team names and scores in the following format:");
        System.out.println("Home:Visitor|21:9");
        System.out.println("\nEnter: ");


            String userInput = scanner.nextLine(); // User input for team name and points -----------------------------
            String teamParts[] = userInput.split("[:|]");

            // Breaking Down Input Into Team Names and Points ---------------------------------------------------------
            String teamOneName = teamParts [0];
            String teamTwoName = teamParts [1];
            int teamOnePoints = Integer.parseInt(teamParts [2]);
            int teamTwoPoints = Integer.parseInt(teamParts[3]);


            // Confirm the inputs -------------------------------------------------------------------------------------
            System.out.println("Confirm the points and the team name. (Y) or (N)");
            System.out.println("(Y)es");
            System.out.println("(N)o");
            char confirmInput = scanner.nextLine().toUpperCase().charAt(0);

            if (confirmInput == 'Y') {

                // Deciding Which Team Is the Winner ------------------------------------------------------------------
                if (teamOnePoints > teamTwoPoints) {
                    String winner = teamOneName;
                    String notWinner = teamTwoName;
                    System.out.println("\nHere is your score breakdown!");
                    System.out.println("Winner: " + winner);
                    System.out.println("Loser: " + notWinner);
                }
                if (teamTwoPoints > teamOnePoints) {
                    String winner = teamTwoName;
                    String notWinner = teamOneName;
                    System.out.println("\nHere is your score breakdown!");
                    System.out.println("Winner: " + winner);
                    System.out.println("Loser: " + notWinner);
                    confirmed = true;
                    break;
                }
            } else if (confirmInput == 'N') {
                continue;
            } else {
                System.out.println("-------------------------------------");
                System.out.println("Invalid input: DO OVER");
                System.out.println("-------------------------------------");
            }
        }


    }
}
