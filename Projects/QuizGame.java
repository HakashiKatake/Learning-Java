import java.util.Scanner;
public class QuizGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String[] questions = {"What is the main func of router?", 
                            "which part of computer is brain of computer",
                            "who is the father of apple",
                            "what was the first programming language?"};
        
        String[][] options = {{"1. Storing files", "2. Encrypting data", "3. Directing interface", "4. Managing password"},
                            {"1. CPU", "2. SSD", "3. RAM", "4. GPU"},
                        {"1. Steve jobs", "2. Bill Gates", "3. Joe darsan", "4. Elon musk"},
                    {"1. COBOL", "2. Fortran", "3. Assembly", "4. C"}};

        int[] answers = {3,1,1,2};
        int score = 0;
        int guess;
        int correctGuess=0, wrongGuess=0;
      

        System.out.println("*****************************");
        System.out.println("Welcome to the java quiz game!");
        System.out.println("*****************************");

         for(int i=0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for(String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if(guess == answers[i]) {
                System.out.println("***************");
                System.out.println("COORECT!");
                System.out.println("***************");
                score++;
                correctGuess++;
            } else {
                 System.out.println("**************");
                System.out.println("WRONG!");
                System.out.println("***************");
                wrongGuess++;
            }

         }

         System.out.println("Game Ended!");
         System.out.printf("Final score is: %d, you had %d correct guesses and %d wrong guesses",score, correctGuess, wrongGuess);
         
    





        scanner.close();





        
    }
}
