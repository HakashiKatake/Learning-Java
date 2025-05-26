
public class GetterSetter {
    public static void main(String[] args) {
        Car car = new Car("Charger", "Yellow", 10000);

        car.setColor("Blue");
        car.setPrice(10000);
        System.out.println(car.getColor()+ " " + car.getModel() + " " + car.getPrice() );
    }
}
