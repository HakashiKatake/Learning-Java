import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();
        System.out.print("What price for each?: ");
        price = scanner.nextDouble();
        System.out.print("What will be the quantity?: ");
        quantity = scanner.nextInt();
        total = price * quantity;

        System.out.println("\n You have bought " + quantity + " " + item + "/s");



        scanner.close();
    }
}
