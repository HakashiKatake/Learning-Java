

public class Abstract {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Triangle triangle = new Triangle(2,5);  
        Rectangle rectangle = new Rectangle(4.5,5.5);       
        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
    }
}
