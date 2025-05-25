import java.util.Scanner;
import java.util.Random;
public class RPS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();


        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";
        int compScore = 0;
        int playerScore = 0;
        int ties = 0;

        do {
            System.out.println("Enter your move (rps): ");
        playerChoice = scanner.nextLine().toLowerCase();

        if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")){
            System.out.println("Invalid choice");
            continue;
        }

        computerChoice = choices[random.nextInt(3)];
        System.out.println("Computer choice: " + computerChoice);

        if(playerChoice.equals(computerChoice)) {
            System.out.println("Its a tie");
            ties++;
        } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) || (playerChoice.equals("paper") && computerChoice.equals("rock")) || (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
            System.out.println("You win");
            playerScore++;
        } else {
            System.out.println("You lose!");
            compScore++;
        }

        System.out.print("Play again? (yes/no): ");
        playAgain = scanner.nextLine().toLowerCase();

        } while (playAgain.equals("yes"));

        

        System.out.printf("Your score is: %d, Computer's Score is: %d\n",playerScore,compScore);

        if (playerScore > compScore) {
            System.out.println("You win the whole game!");
        } else {
            System.out.println("Better luck next time computer had more scores!");
        }
        
        System.out.printf("You had %d ties\n",ties);
        System.out.println("Good bye!");






        scanner.close();
    }
}
