import java.util.Scanner;
public class Hypotenuse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.println("Enter the length of side A: ");
        a = scanner.nextDouble();

        System.out.println("Enter the lenght of side b: ");
        b = scanner.nextDouble();

        c = Math.round(Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));

        System.out.println("The hypotenuse (side c) is: " + c + "cm");



        scanner.close();




    }
}
