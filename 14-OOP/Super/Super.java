package Super;

public class Super {
    public static void main(String[] args) {
        Person person = new Person("harry", "styles");
        Student student = new Student("Harry", "Potter", 4.5);
        Employee employee = new Employee("Ruby","Yo", 0);
        person.showName();
        student.showName();
        student.showGpa();
        employee.showName();
        employee.getSalary();

    }
}
