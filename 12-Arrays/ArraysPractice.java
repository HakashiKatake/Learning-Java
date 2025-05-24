import java.util.Arrays;
import java.util.Scanner;
public class ArraysPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] fruits = {"apple", "orange", "bannana"};
        String[] foods;
        int size;

        System.out.print("What $ of food do you want?");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];

        for (int i =0; i<foods.length; i++) {
            System.out.println("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        for(String food:foods){
            System.out.println(food);
        }

    





        System.out.println(fruits[0]);

        fruits[0] = "pineapple";
        //int numOfFruits = fruits.length;
        for (int i=0;i<fruits.length; i++) {
            System.out.println(fruits[i] + " ");
        }
        //foreach loop
        for(String fruit : fruits) {
            System.out.println(fruit);
        }

        //Arrays.sort(fruits);

        //Arrays.fill(fruits, "pineapple");






        System.out.println(fruits[0]);
    }
}
