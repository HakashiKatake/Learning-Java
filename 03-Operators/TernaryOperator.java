public class TernaryOperator {
    public static void main(String[] args) {
        // ternary op ? = return 1 or 2 value , if condition is true

        //variable = (condition) ? ifTrue : ifFalse;

        int score = 55;

        // if (score >= 60) {
        //     System.out.println("Pass");
        // } else {
        //     System.out.println("Fail");
        // }

        //or 

        String passOrFail = (score >= 60) ? "Pass" : "Fail";
        System.out.println(passOrFail);


        int number = 5;

        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(evenOrOdd);

        int hours = 13;

        String timeOfDay = (hours < 12) ? "A.M" : "P.M";

        System.out.println(timeOfDay);

        int income = 60000;
        double taxRate = (income >= 40000) ? 0.24 : 0.15;

        System.out.println(taxRate);


        




    }
}
