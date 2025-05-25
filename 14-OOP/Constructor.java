public class Constructor {
    public static void main(String[] args) {
        Students student1 = new Students("Yo", 30, 3.2);
        Students student2 = new Students("Meow", 34, 4.5);
        Students student3 = new Students("helo", 3, 6.4);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);

        student1.study();
        student2.study();
        student3.study();
        


    }
}
