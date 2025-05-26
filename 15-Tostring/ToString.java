

public class ToString {
    public static void main(String[] args) {

        //tostring method inherited from object class
        //used to return a string representation of obj
        //by default it returns an hash code as a unique identifier
        //it can be overriden to provide meaning details
        Car car = new Car("Ford", "Mustang", 2025, "Red");
        System.out.println(car);
         
    }
}
