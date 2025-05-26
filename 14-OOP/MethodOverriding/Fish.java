package MethodOverriding;

public class Fish extends Animal {
    @Override
    void move(String name) {
        System.out.println("This " + name + " is moving");
    }
}
