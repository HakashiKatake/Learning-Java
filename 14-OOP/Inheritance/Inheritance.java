package Inheritance;
public class Inheritance {
    public static void main(String[] args) {
        
        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        dog.eat();
        cat.eat();

        dog.speak();
        cat.speak();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);
        System.out.println(dog.lives);
        System.out.println(cat.lives);

        plant.photosynthesize();

        

    }
}
