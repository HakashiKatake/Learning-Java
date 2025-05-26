
public class Polymorphism {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vechicle[] vechicles = {car, bike, boat};

        for(Vechicle vechicle : vechicles) {
            vechicle.go();
        }
        
    }
}
