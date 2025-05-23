import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args) {
        //weight conversion program

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert to kgs to lbs");
        System.out.println("Choose an option: ");
        choice = scanner.nextInt();



        if(choice == 1) {
            System.out.println("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The new weight in kgs is: %.2f", newWeight);




        } else if (choice == 2) {
          
            System.out.println("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new weight in lbs is: %.2f", newWeight);

        } else {
            System.out.println("Invalid choice");
        }

        scanner.close();






    }
}
