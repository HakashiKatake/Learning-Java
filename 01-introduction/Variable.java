public class Variable {
    public static void main(String[] args) {
        //primatie data types
        int a = 10; // 4 bytes
        float b = 10.5f; // 4 bytes
        double c = 10.5; // 8 bytes
        char d = 'A'; // 2 bytes
        boolean e = true; // 1 byte
        byte f = 10; // 1 byte
        short g = 10; // 2 bytes
        long h = 10; // 8 bytes

        //reference data types
        String i = "Hello"; // 2 bytes per character
        String j = "World"; // 2 bytes per character

        //printing the variables
        System.out.println("int: " + a);
        System.out.println("float: " + b);
        System.out.println("double: " + c);
        System.out.println("char: " + d);
        System.out.println("boolean: " + e);
        System.out.println("byte: " + f);
        System.out.println("short: " + g);
        System.out.println("long: " + h);
        System.out.println("String: " + i);
        System.out.println("String: " + j);
    }
}
