public class ArrayOfObjects {
    public static void main(String[] args) {
        // Car2 car1 = new Car2("Mustang", "Red");
        // Car2 car2 = new Car2("Corvette", "Blue");
        // Car2 car3 = new Car2("Tata", "Yellow");

        // Car2[] cars = {car1, car2, car3};

        // for(int i=0; i<cars.length; i++) {
        //     System.out.println(cars[i].model);
        //     System.out.println(cars[i].color);
        // }

        // for (Car2 car : cars) {
        //     System.out.println(car.model);
        //     System.out.println(car.color);
        // }

        Car2[] cars = {new Car2("Mustang", "Red"),
                        new Car2("Mustang", "Red")};

        for (Car2 car: cars) {
            car.color = "black";
        }

        for (Car2 car : cars) {
            System.out.println(car.model);
            System.out.println(car.color);
            car.drive();
        }





    }
}
