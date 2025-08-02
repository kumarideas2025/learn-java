
// code always run as we handle exception or not.

import java.util.Scanner;

public class Finaly_Block {
    public static int greet() {
        try {

            int a = 60;
            int b = 4;// use 0 to see exception occur. and will return 0.
            int c = a / b;
            return c;

        } catch (Exception e) {

            System.out.println(e);
        } finally {
            System.out.println("This is the end of my programme");
        }
        return 0;
    }

    public static void main(String[] args) {
        int k = greet();
        System.out.println(k);// in output 15 will print and finally statement also print.
        
        // practice another one using while loop
        
        int a = 70;
        int b = 7;
        while (true) {
            try {
                System.out.println(a / b);
            } catch (Exception e) {
                System.out.println("Exception");
                System.out.println(e);
                break;// if we break then also finally will run
            } finally {
                System.out.println("i am finally for value of b="+b);
            }
            a++;
            b--;
        }
        // yes! we can use only try without catch iin finally
        try{
            System.out.println(5/0);
        }
        finally{
            System.out.println("yes! we can use only try without catch iin finally");
        }
    }
}
