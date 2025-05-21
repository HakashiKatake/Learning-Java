import java.util.Scanner;
public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");

        String name = scanner.nextLine();

        int age;
        System.out.println("Enter your age: ");
        age = scanner.nextInt();

        //group 1
        if (name.isEmpty()) {
            System.out.println("You didnt enter your name");

        } else {
            System.out.println("Hello " + name);
        }
        


        //group 2
        if (age >= 18) {
            System.out.println("You are an adult!");
          
        } else if(age < 0) {
            System.out.println("You havent been born yet");
        
        } else if (age >= 65) {
            System.out.println("You are grandpa");
        }
        
        else if(age==0) {
            System.out.println("You are a baby!");
        }
        else {
            System.out.println("You are a child");
        }

        scanner.close();
    }
}
