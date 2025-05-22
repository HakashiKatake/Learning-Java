
public class Precision {
    public static void main(String[] args) {
        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;

        // + = output a plus
        // , = comma group sep
        // ( = negative num are enclosed in ()
        // space = display a minus if negative, space if pos

        System.out.printf("%.1f\n", price1);
        System.out.printf("%.2f\n", price2);
        System.out.printf("%.3f\n", price3);

         System.out.printf("%+.1f\n", price1);
        System.out.printf("%+.2f\n", price2);
        System.out.printf("%+.3f\n", price3);

         System.out.printf("%,.1f\n", price1);
        System.out.printf("%,.2f\n", price2);
        System.out.printf("%,.3f\n", price3);

         System.out.printf("%(.1f\n", price1);
        System.out.printf("%(.2f\n", price2);
        System.out.printf("%(.3f\n", price3);

         System.out.printf("% .1f\n", price1);
        System.out.printf("% .2f\n", price2);
        System.out.printf("% .3f\n", price3);


        int id1 = 1;
        int id2 = 23;
        int id3 = 354;
        int id4 = 5432;

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding


        System.out.printf("%04d\n",id1);
        System.out.printf("%04d\n",id2);
        System.out.printf("%04d\n",id3);
        System.out.printf("%04d\n",id4);

        System.out.printf("%4d\n",id1);
        System.out.printf("%4d\n",id2);
        System.out.printf("%4d\n",id3);
        System.out.printf("%4d\n",id4);

        System.out.printf("%-4d\n",id1);
        System.out.printf("%-4d\n",id2);
        System.out.printf("%-4d\n",id3);
        System.out.printf("%-4d\n",id4);



    }
}
