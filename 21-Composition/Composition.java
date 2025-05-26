public class Composition {
    public static void main(String[] args) {

        //compostion a part of relationship between objects
        //for example a engine is part of a car
        Car car = new Car("Corvette", 2025, "V8");
        System.out.println(car.model);
        System.out.println(car.engine.type);
        System.out.println(car.year);
        car.start();
    }
}
