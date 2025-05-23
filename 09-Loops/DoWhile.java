import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;

        do {
            System.out.println("Enter a number between 1 - 10: ");
            number = scanner.nextInt();
        } while (number < 1 || number > 10);
           
        
         System.out.println("You picked " + number);
       
        scanner.close();

        // int age = 0;

        // do {
        //     System.out.println("Your age can't be negative");
        //     System.out.println("Enter your age: ");
        //     age = scanner.nextInt();
        // } while(age<0) {
        //     System.out.println("Your are "+ age + " years old");
        //     scanner.close();
        // }

         
    }
}
