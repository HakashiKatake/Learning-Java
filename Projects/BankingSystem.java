

import java.util.Scanner;
public class BankingSystem {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //declare vars
        
        double bal = 0;
        boolean  isRunning = true;
        int choice = 0;

        while(isRunning) {
            System.out.println("******************");
            System.out.println("Banking System");
            System.out.println("******************");
            System.out.println("1. Show bal");
            System.out.println("2. Dep");
            System.out.println("3. With");
            System.out.println("4. Exit");

            System.out.println("Enter your choice 1-4");
            choice = scanner.nextInt();

            switch(choice) {
                case 1 -> showBalance(bal);
                case 2 -> bal += deposit();
                case 3 -> bal -= withdraw(bal);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice");
            }

        }

       
        scanner.close();

    }

    static void showBalance(double balance) {
        System.out.println("******************");
        System.out.printf("$%.2f\n",balance);
    }

    static double deposit() {
        double amount;

        System.out.print("Enter an amt to be deposited: ");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Amt cant be negative");
        } else {
            return amount;
        }
        return 0.0;
    }

    static double withdraw(double balance) {
        double amount;

        System.out.println("Enter amount to be withdrawn");
        amount = scanner.nextDouble();

        if(amount>balance) {
            System.out.println("Issuficient funds");
        } else if(amount < 0){
            System.out.println("Amount cant be negative");
        } else {
            return amount;
        }
        return 0.0;
    }
}
