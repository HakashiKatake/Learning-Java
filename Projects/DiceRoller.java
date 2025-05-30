import java.util.Scanner;
import java.util.Random;



public class DiceRoller {
    public static void main(String[] args) {
        //declare vars
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int numOfDice;
        int total=0;

        System.out.println("Enter the # of dice to roll");
        numOfDice = scanner.nextInt();

        if (numOfDice > 0) {
            for(int i =0; i<numOfDice;i++) {
                int roll = random.nextInt(1,7);
                System.out.println("You rolled: "+roll);
                total = total + roll;
                printDie(roll);

            }
            System.out.printf("total: %d",total);
        } else {
            System.out.println("Should be greater  than 0");
        }
        scanner.close();

        




    }

    static void printDie(int roll) {
        String dice1 = " +-------+\n" + //
                        " |       |\n" + //
                        " |   •   |\n" + //
                        " |       |\n" + //
                        " +-------+";
        
        String dice2 = " +-------+\n" + //
                        " | •     |\n" + //
                        " |       |\n" + //
                        " |     • |\n" + //
                        " +-------+";

        String dice3 = " +-------+\n" + //
                        " | •     |\n" + //
                        " |   •   |\n" + //
                        " |     • |\n" + //
                        " +-------+";

        String dice4 = "\n" + //
                        " +-------+\n" + //
                        " | •   • |\n" + //
                        " |       |\n" + //
                        " | •   • |\n" + //
                        " +-------+";

        String dice5 = " +-------+\n" + //
                        " | •   • |\n" + //
                        " |   •   |\n" + //
                        " | •   • |\n" + //
                        " +-------+";

        String dice6 = "+-------+\n" + //
                        " | •   • |\n" + //
                        " | •   • |\n" + //
                        " | •   • |\n" + //
                        " +-------+";
          
        switch(roll) {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid roll");

        }
        
    }
}
