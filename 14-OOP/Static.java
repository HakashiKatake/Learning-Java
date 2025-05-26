public class Static {
    public static void main(String[] args) {
        //static = makes a variable or method belong to the class
        //rather than any specific object
        //commonly used for utility methods or shared resouces

        Friend friend = new Friend("Spongebob");
        Friend friend2 = new Friend("Bob");
        Friend friend3 = new Friend("Harry");


        System.out.println(friend.numOfFriends);
        System.out.println(friend2.numOfFriends);
        System.out.println(friend3.numOfFriends);

        System.out.println(Friend.numOfFriends);
        Friend.showFriends();

    }
}
