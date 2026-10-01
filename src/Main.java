import java.util.Scanner;
public class Main {
    static String convertMove(String Move) {
        if (Move.equalsIgnoreCase("r")) {
            return "Rock";
        }
        else if (Move.equalsIgnoreCase("p")) {
            return "Paper";
        }
        else if (Move.equalsIgnoreCase("s")) {
            return "Scissors";
        }
        else {
            return "";
        }
    }
    static void main() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("What is your move player A (R, P, S): ");
            String playerAMove = scanner.next();
            if (!playerAMove.equalsIgnoreCase("r") && !playerAMove.equalsIgnoreCase("p") && !playerAMove.equalsIgnoreCase("s")) {
                System.out.println("Invalid move");
                continue;
            }
            System.out.print("What is your move player B (R, P, S): ");
            String playerBMove = scanner.next();
            if (!playerBMove.equalsIgnoreCase("r") && !playerBMove.equalsIgnoreCase("p") && !playerBMove.equalsIgnoreCase("s")) {
                System.out.println("Invalid move");
                continue;
            }
            playerAMove = convertMove(playerAMove);
            playerBMove = convertMove(playerBMove);

            if (playerAMove.equalsIgnoreCase(playerBMove)) {
                System.out.println(playerAMove + " vs " + playerBMove + ", It's a Tie!");
            }
            else if (playerAMove.equals("Rock") && playerBMove.equals("Scissors")) {
                System.out.println("Player A Wins, Rock breaks Scissors");
            }
            else if (playerAMove.equals("Paper") && playerBMove.equals("Rock")) {
                System.out.println("Player A Wins, Paper Covers Rock");
            }
            else if (playerAMove.equals("Scissors") && playerBMove.equals("Paper")) {
                System.out.println("Player A Wins, Scissors Cuts Rock");
            }
            else if (playerBMove.equals("Rock") && playerAMove.equals("Scissors")) {
                System.out.println("Player B Wins, Rock breaks Scissors");
            }
            else if (playerBMove.equals("Paper") && playerAMove.equals("Rock")) {
                System.out.println("Player B Wins, Paper Covers Rock");
            }
            else if (playerBMove.equals("Scissors") && playerAMove.equals("Paper")) {
                System.out.println("Player B Wins, Scissors Cuts Rock");
            }
            while (true) {
                System.out.print("Do you want to Continue [Y/N]: ");
                String doesPlayerContinue = scanner.next();
                if (doesPlayerContinue.equalsIgnoreCase("Y")) {
                    break;
                } else if (doesPlayerContinue.equalsIgnoreCase("N")) {
                    System.out.println("Quitting");
                    System.exit(0);
                }
                else {
                    System.out.println("Invalid choice");
                }
            }
        }
    }
}
