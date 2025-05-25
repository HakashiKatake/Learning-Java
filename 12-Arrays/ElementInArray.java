import java.util.Scanner;
public class ElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {1,4,5,4,2,6,7,8};
        String[] fruits = {"orange", "fsd", "banana"};
        boolean isFound = false;
        String target;

        System.out.println("Enter a fruit to search for: ");
        target = scanner.nextLine();
       

        // for(int i = 0; i< numbers.length; i++){
        //     if (target==numbers[i]) {
        //         System.out.println("Element found at index: "+i);
        //         isFound=true;
        //         break;
        //     }
        // }

    

        for(int i = 0; i< numbers.length; i++){
            if (fruits[i].equals(target)) {
                System.out.println("Element found at index: "+i);
                isFound=true;
                break;
            }
        }

        if(!isFound) {
            System.out.println("Element not found in array");
        }

        scanner.close();
    }
}
