import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int points = 0;
        int enemyPoints = 0;

        while (true) {
            // Random generator
            int rand = random.nextInt(3) + 1;
            String comp = "";

            if (rand == 1) {
                comp = "Scissors";
            } else if (rand == 2) {
                comp = "Rock";
            } else if (rand == 3) {
                comp = "Paper";
            }

            System.out.print("Rock, Paper, Scissors? ");
            String player = scanner.nextLine();
            System.out.println("Enemy chooses " + comp);

            // game rules
            if (comp.equals(player)) {
                System.out.println("Tie");
            } else if ((player.equals("Scissors") && comp.equals("Paper")) ||
                    (player.equals("Rock") && comp.equals("Scissors")) ||
                    (player.equals("Paper") && comp.equals("Rock"))) {
                System.out.println("Du hast einen Punkt geholt");
                points++;
            } else {
                System.out.println("enemy player scored 1 point");
                enemyPoints++;
            }

            System.out.println(points + " : " + enemyPoints);

            // endresult
            if (points == 3) {
                System.out.println("VICTORY!");
                System.out.print("Wanna play again? ");
                String rematch = scanner.nextLine();
                if (!rematch.equalsIgnoreCase("Yes")) {
                    break;
                } else {
                    points = 0;
                    enemyPoints = 0;
                }
            }

            if (enemyPoints == 3) {
                System.out.println("DEFEAT!");
                System.out.print("Wanna play again? ");
                String rematch = scanner.nextLine();
                if (!rematch.equalsIgnoreCase("Yes")) {
                    break;
                } else {
                    points = 0;
                    enemyPoints = 0;
                }
            }
        }
    }
}
