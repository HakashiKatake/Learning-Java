
public class PrintF {
    public static void main(String[] args) {
        String name = "Spongebob";

        char firstletter = 'S';

        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s", name);

        System.out.printf("Your name starts with a %c\n", firstletter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %f inches tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);
        System.out.printf("%s is %d years old\n", name, age);

        
    }
}
