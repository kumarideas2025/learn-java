import java.util.Scanner;

class MyException extends Exception {
    @Override
    public String toString() {
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

public class ExceptionClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        if (a < 9) {
            try {
                throw new MyException();
                // throw new ArithmeticException("this is an exception");
            } catch (MyException e) {
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                System.out.println(e);// toString method will runfor this
                e.printStackTrace();// this will give a strack trace(custom)
                System.out.println("finished");
            }
            System.out.println("yes! finished");
        }
        sc.close(); 
    }
}

// search exception in java (Oracel) for more information.