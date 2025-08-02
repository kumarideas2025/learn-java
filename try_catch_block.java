// HAnding exception using try- catch - block

// 1. check exception=>it is a compile time exception(handled by compiler)
// 2. uncheck exception=>runtime exception.

public class try_catch_block {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;

// WITHOUT TRY:->
// int c=a/b
// System.out.println("the result is :"+c);// at output  we did not find( end of the programme) line.




        // WITH TRY:->
        try {
            int c = a / b;
            System.out.println("the result is " + c);
        } catch (Exception e) {
            System.out.println("we failed to divide. Reason");
            System.out.println(e); // FOR THIS PART WE GET A REASON.
        }
        System.out.println("END OF THE PROGRAMME");
    }
}
