

public class varags {
    public static void main(String[] args) {
        //varargs allow a method to accept a varying # of arguments
        //makes method more flexible no need for overloaded methods
        // ... ellipsis
        System.out.println(add(1,3,4,5,6,4));
    
    }

    static int add(int... numbers) {
        int sum = 0;

        for(int number: numbers ){
            sum += number;
        }
        return sum;
    }
}
