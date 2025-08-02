import java.util.Scanner;

public class Error_demo {
    public static void main(String[] args) {
        
        // syntax error demo-->
        // int a=0 //error :no semicolon
        // b=8 // be not declared







        // logical error demo..
        System.out.println(2);
        for (int i = 1; i < 5; i++) {
            System.out.println(2 * i + 1);





            // runtime error:
            // something exception that programme. (this is usually throw by user)....to check take input 0.
            int k;
            Scanner sc = new Scanner(System.in);
            k = sc.nextInt();
            System.out.println( "integer part of 100 divided by k is: "  + 1000/k);
        }
    }
}
