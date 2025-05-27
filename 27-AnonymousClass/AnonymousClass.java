

public class AnonymousClass {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog dog1 = new Dog() {
            @Override
            void speak() {
                System.out.println("Scooby Doo says ruh rooh");
            }
        };

        dog.speak();
        dog1.speak();
    
    }
}
