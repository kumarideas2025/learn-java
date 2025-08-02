import java.util.Scanner;
public class Nested_catch {
    public static void main(String[] args) {
        int marks[] = new int[3];
        marks[0] = 79;
        marks[1] = 29;
        marks[2] = 49;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of index:");
        int index=sc.nextInt();
        try {
            System.out.println("Welcome Back ! dear");
                        try {
                        System.out.println(marks[index]);
                            } 
                        catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("sorry this index does not exist");
                        System.out.println("exception in level 2");
                        System.out.println(e);
                            }
        } 
        catch (Exception e) {
            System.out.println("exception in level 1");
        }
    }
}
