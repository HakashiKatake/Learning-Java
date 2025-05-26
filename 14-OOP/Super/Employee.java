package Super;

public class Employee extends Person{

    int salary;

    Employee(String first, String last, int salary) {
        super(first, last);
        this.salary = salary;
    }

    void getSalary() {
        System.out.println(this.first + "'s salary is $"+this.salary);
    }
}