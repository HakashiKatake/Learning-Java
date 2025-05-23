import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts=0;
        int min = 1, max = 100;
        int randomNumber = random.nextInt(min,max+1);

        System.out.println("Number Guesssing Game");
        System.out.printf("Guess a number between %d-%d\n",min,max);

        do {

            System.out.println("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too low! try again");
            } else if (guess > randomNumber) {
                System.out.println("Too high try again!");
            } else {
                System.out.println("Correct! the number was "+ randomNumber);
                System.out.printf("You took %d attemps",attempts);
            }
             
        }while(guess!= randomNumber);

        scanner.close();
    }

}