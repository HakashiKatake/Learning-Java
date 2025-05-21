
public class IncrementDecrementOp {
    public static void main(String[] args) {
        int x = 1;
        x--; //0
        x--; //-1
        x--; //-2 
        x++; //-1
        x++; //0

        System.out.println(x);

        //order of operations [p-e-m-d-a-s]

        double result = 3 + 4 * (7-5) / 2.0;
        System.out.println(result);

        //first perentesis operation happens 
        //(7-5) = 2

        // now its 3 + 4 * 2 / 2.0
        //then multiplication 

        //3+8/2.0

        //then divide

        //3+4

        //then add

        //7




    }
}
