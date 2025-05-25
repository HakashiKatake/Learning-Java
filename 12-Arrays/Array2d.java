

public class Array2d {
    public static void main(String[] args) {
        String[] fruits = {"apple", "orange", "bannana"};
        String[] vegatables = {"potato", "onion", "carrot"};
        String[] meats = {"chicken","pork","beef"};

        String[][] groceries = {fruits, vegatables, meats};
        //first is row second is column
        groceries[1][0] = "pineapple";

        for (String[] foods : groceries) {
            for(String food: foods) {
                System.out.println(food + " ");
            }
            System.out.println();
        }
    }
}
