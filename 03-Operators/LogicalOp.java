import java.util.Scanner;

public class LogicalOp {
    public static void main(String[] args) {
        // && = and
        // || = or
        // ! = not

        Scanner scanner = new Scanner(System.in);

        double temp = 20;
        boolean isSunny = false;

        if (temp <= 30 && temp >= 0 && isSunny) {
            System.out.println("The weather is Good");
            System.out.println("It is Sunny outside");

        } else if (temp <= 30 && temp >= 0 && !isSunny) {
             System.out.println("The weather is Mild");
            System.out.println("It is Cloudy outside");
        }

        else if (temp > 30 || temp < 0) {
            System.out.println("The weather is bad :(");
        }


        String username;
        System.out.println("Enter your new username: ");
        username = scanner.nextLine();

        if(username.length() < 4 || username.length() > 12) {
            System.out.println("Username must be between 4-12 char");
        } else if (username.contains(" ") || username.contains("_")) {
            System.out.println("Username must not contain spaces or underscores");
        }
        else {
            System.out.println("Welcome "+ username);
        }

        scanner.close();










    }
}
