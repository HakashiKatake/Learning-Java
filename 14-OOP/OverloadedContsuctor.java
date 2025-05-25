public class OverloadedContsuctor {
    public static void main(String[] args) {
        User user1 = new User("Spongebob");
        User user2 = new User("Patrick", "whoknows@gmail.com");
        User user3 = new User("Sandy", "whoknows@gmail.com", 23);
        User user4 = new User();
        
        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);


    }
}
