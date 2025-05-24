public class MethodOverloading {

    public static void main(String[] args) {
        System.out.println(add(1, 3));
        System.out.println(add(1, 4, 5));
        System.out.println(bakePizza("macaroni"));
        System.out.println(bakePizza("macaroni", "peparoni"));
    }

    static double add(double a, double b) {
        return a + b;
    }

    static double add(double a, double b, double c) {
        return a + b + c;
    }

    static String bakePizza(String bread) {
        return bread + " pizza";
    }

    static String bakePizza(String bread, String toppings) {
        return bread + toppings + " pizza";
    }

}


