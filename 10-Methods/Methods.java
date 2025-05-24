

public class Methods {
    public static void main(String[] args) {

        String name = "bro";
        int age = 25;
        
        happyBirthday();
        happyBirthday(name, age);
        double result = square(4.4);
        System.out.println(result);
        if (ageCheck(age)) {
            System.out.println("you may sign up");
        } else {
            System.out.println("You must be 18+ to sign up");
        }


    }

    //normal method
    static void happyBirthday() {
        System.out.println("Happy birthday to you");
        System.out.println("Happy birthday dear you");
        System.out.println("You are x year old");
   
    }

    //method with params
    static void happyBirthday(String name, int age)  {

        System.out.println("Happy birthday to you");
        System.out.printf("Happy birthday dear %s\n",name);
        System.out.printf("You are %d year old",age);
   
    }

    static double square(double number) {
        return number * number;
    }

    static double cube(double number) {
        return number * number * number;
    }

    static String getFullName(String first, String last) {
        return first + " " + last;
    }

    static boolean ageCheck(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
