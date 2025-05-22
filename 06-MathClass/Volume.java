import java.util.Scanner;
public class Volume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius, circumference, area, volume;

        System.out.println("Enter the radius: ");
        radius = scanner.nextDouble();


        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("The circumference is: %.1fcm\n", circumference);

        System.out.printf("The area is: %.1fcm\n", area);
        System.out.printf("The volume is: %.1fcm", volume);

        scanner.close();


    }
}
