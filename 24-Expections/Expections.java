import java.util.InputMismatchException;
import java.util.Scanner;


public class Expections {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
           System.out.println("Enter a number: ");
           int number = scanner.nextInt();
           System.out.println(number);
        }
        catch(InputMismatchException e) {
            System.out.println("That wasnt a number");
        }
        catch(ArithmeticException exception) {
            System.out.println("You cant divide by zero");
        }
        catch(Exception e) {
           
            System.out.println("Something went wrong");
        }
        finally {
            scanner.close();
        }

    }
}
