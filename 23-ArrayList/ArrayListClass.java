
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListClass {
    public static void main(String[] args) {
        // ArrayList<String> list = new ArrayList<>();
        // list.add("Orange");
        // list.add("Banana");
        // list.add("Mango");
        // System.out.println(list);

        // list.remove(0);
        // list.set(0, "Pineapple");

        // System.out.println(list.get(1));
        // System.out.println(list.size());
        
        // Collections.sort(list);
        // for(String listt : list) {
        //     System.out.println(listt);
        // }

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();
        System.out.println("Enter the # of food you would like: ");
        int numOfFood = scanner.nextInt();
        

        scanner.nextLine();

        for(int i = 1; i<= numOfFood ; i++) {
            System.out.println("Enter food # " + i + ": ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println(foods);



         


    }
}
