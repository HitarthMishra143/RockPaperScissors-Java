import java.util.Random;
import java.util.Scanner;

public class Rock_paper_Scissor {

    public static void main(String[] args) {
        System.out.println("🎮 Welcome to Hitarth HUB");
        System.out.println("✨ A Marvelous Rock-Paper-Scissors Game ✨");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String playAgain = "yes";

        // Available moves
        String[] choices = {"rock", "paper", "scissors"};

        do {
            // Player's move
            System.out.print("Enter your move (rock, paper, scissors): ");
            String playerChoice = scanner.nextLine().trim().toLowerCase();

            // Validate input
            if (!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissors")) {
                System.out.println("❌ Invalid choice. Please try again.\n");
                continue;
            }

            // Computer's move
            String computerChoice = choices[random.nextInt(3)];
            System.out.println("💻 Computer chose: " + computerChoice);

            // Determine winner
            if (playerChoice.equals(computerChoice)) {
                System.out.println("🤝 It's a tie!");
            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("🎉 You win!");
            } else {
                System.out.println("😢 You lose!");
            }

            // Play again?
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.nextLine().trim().toLowerCase();
            System.out.println();

        } while (playAgain.equals("yes"));

        System.out.println("🙏 Thanks for playing! See you next time.");
        scanner.close();
    }
}
