import java.util.Scanner;

public class CompoundInterestCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    double principal;
    double rate;
    int timesCompunded;
    int years;
    double amount;

    System.out.println("Enter the principal amt: ");
    principal = scanner.nextDouble();

    System.out.println("Enter the interest rate (in %): ");
    rate = scanner.nextDouble();

    System.out.println("Enter the # of times compounded per year: ");
    timesCompunded = scanner.nextInt();

    System.out.println("Enter the # of the year: ");

    years = scanner.nextInt();

    amount = principal  * Math.pow(1 + rate/timesCompunded, timesCompunded * years);
    System.out.println("The amount after " + years + "is $" + amount);

    scanner.close();
    
    }
    
}
