import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // for (int i = 1; i<=3; i++) {
        //     for(int j = 1; j <= 9; j++) {
        //     System.out.println(j + " ");
        // }
        // }

        int rows;
        int columns;
        char symbol;

        System.out.println("Enter the number of rows: ");
        rows = scanner.nextInt();

        System.out.println("Enter the number of columns: ");
        columns = scanner.nextInt();

        System.out.println("Enter the number of symbol: ");
        symbol = scanner.next().charAt(0);

        for (int i=0; i<rows; i++) {
            for(int j=0; j< columns; j++) {
            System.out.print(symbol);

        }
        System.out.println();
        }
        


        scanner.close();



        
    }
}  
