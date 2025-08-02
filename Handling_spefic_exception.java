import java.util.Scanner;

public class Handling_spefic_exception {
    public static void main(String[] args) {
        int marks[] = new int[3];
        marks[0] = 79;
        marks[1] = 29;
        marks[2] = 49;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array index:");
        int index = sc.nextInt();
        System.out.println("enter the number you want ot divide with");
        int number = sc.nextInt();
        try {
            System.out.println("the value at array index entered is :" + marks[index]);
            System.out.println("the value of array-value/number is:" + marks[index] / number);

        }

        catch (ArithmeticException e) {
            System.out.println("ArithmeticException  occured!");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException  occured!");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("some other exception occured!");
            System.out.println(e);
        }
    }
}
