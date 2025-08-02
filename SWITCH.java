import java.util.Scanner;
public class SWITCH {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your age:");
        int age=scan.nextInt();
        System.out.println(age);
        switch(age){
            case 12:
                System.out.println("you aare 12 years old");
                break;
            case 23:
                System.out.println("you are 23 years old");
                break;
            default:
                System.out.println("you did not match any cases");
        }
    }
}
