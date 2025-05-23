import java.util.Scanner;
public class ForLoops {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter how many times you want to loop: ");
        // int max = scanner.nextInt();

        // for (int i  = 1; i <=max; i++){
        //     System.out.println(i);
        // }
        // for(int i = 1; i<=10; i+=2) {
        //     System.out.println(i);
        // }

        
        int timer;
        System.out.println("How many seconds to countdown from?: ");

        timer = scanner.nextInt();

        int start = timer;
        for (int i = start; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("Happy new year!!");

    }
}
