
// with throw key word a user can give a error and end that programme.
import java.util.Scanner;
// we did not want any negative area value..so use custom exception

class negativeRadiusException extends  Exception
{
    @Override
    public String toString() {
        return " RADIUS CAN NOT BE NEGATIVE";
    }

    @Override
    public String getMessage() {
        return " RADIUS CAN NOT BE NEGATIVE";
    }
}

public class Throw_vs_throws {

    public static double area(int r) throws negativeRadiusException {
        if (r<0){
            throw  new negativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;// store result of double. use return to give the result to main fun part.
    }
    
    // public static int divide(int a, int b) throws ArithmeticException {
    // // made by me
    // int result = a / b;
    // return result;
    // }

    public static void main(String[] args) {
        //  Kumar- uses divide function by me.
//         try{
//             int c=divide(6,0);
//              System.out.println(c);


//          }
//          catch(Exception e){
// System.out.println("Exception");
//          }
try{
         double ar=area(6);// area give 6 to double area method and the return value give it to ar .so if we print that we have to print ar.
         System.out.println(ar);//"After calling `area(6)`, the `double` value returned from the `area` method (which is the result of `Math.PI * 6 * 6` in this case)
                                 // has been stored in the `double` variable named `ar`."
     
}
     catch(negativeRadiusException e){
System.out.println("exception");
System.out.println(e);
     }}
}




// 