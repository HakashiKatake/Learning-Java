
public class Strings {
    public static void main(String[] args) {
        String name = "Bro code";
        String empty = "";

        int length = name.length();
        char letter = name.charAt(1);
        int index = name.indexOf(" ");
        int lastIndex = name.lastIndexOf('0');
        String upperCase = name.toUpperCase();
        String LowerCase = name.toLowerCase();
        String trim = name.trim();
        String replace = name.replace("o", "a");
        boolean Empty = empty.isEmpty();



        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(upperCase);
        System.out.println(LowerCase);
        System.out.println(trim);
        System.out.println(replace);
        System.out.println(Empty);

        // if (name.isEmpty()) {
        //     System.out.println("Your name is name");
        // } else {
        //     System.out.println("Hello " + name);
        // }

        // if (name.contains(" ")) {
        //     System.out.println("Your name contains a space");
        // } else {
        //     System.out.println("Your name doesn't contain any spaces");
        // }

        // if (name.equals("passsword")) {
        //     System.out.println("Your name can't be password");
        // } else {
        //     System.out.println("Hello "+ name);
        // }


        

        


 


    }
}
