import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {


        String filePath = "/Users/saurabhyadav/Desktop/Learning new shit/Learning Java/Projects/words.txt";
        ArrayList<String> words = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = reader.readLine()) != null) {
                words.add(line.trim());
            }
        }catch(FileNotFoundException e) {
            System.out.println("Could not find file");
        } catch(IOException e) {
            System.out.println("Something went wrong");
        }
      
        Random random = new Random();

        String word = words.get(random.nextInt(words.size()));

        Scanner scanner = new Scanner(System.in);

        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;

        for(int i= 0; i<word.length(); i++) {
            wordState.add('_');
        }

        System.out.println("Welcome to java hangman");
        System.out.println(getHangmanArt(wrongGuesses));

        while(wrongGuesses < 6) {
             System.out.print("Word: ");
        for(char c : wordState) {
            System.out.print(c + " ");
        }

        System.out.println();

        System.out.println("Guess a letter");
        char guess = scanner.next().toLowerCase().charAt(0);
        if(word.indexOf(guess) >= 0) {
            System.out.println("Correct guesss!\n");
            for(int i = 0; i<word.length(); i++) {
                if(word.charAt(i) == guess) {
                    wordState.set(i,guess);
                }
            }
        } else {
            wrongGuesses++;
            System.out.println("Wrong guess!");
        }
        }

        if(wrongGuesses >= 6) {
            System.out.printf("The word was %s",word);
        }





        

        scanner.close();
    }

    static String getHangmanArt(int wrongGuesses) {
        return switch(wrongGuesses) {
            case 0 -> """
                    
                    """;
            case 1 -> """
                    O

            
                    """;
            case 2 -> """
                    O
                    |
            
                    """;
            case 3 -> """
                     O
                    /|
                    
                    """;
            case 4 -> """
                     O
                    /|\
                    
                    """;
            case 5 -> """
                     O
                    /|\
                    /
                    """;
            case 6 -> """
                     O
                    /|\
                    / \
                    """;
            default -> "";
                
            
        };
    }



}
