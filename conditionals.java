import java.util.Scanner;
public class conditionals {
    public static void main(String args[]) {
//if -else conditionals---
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your age:");
        int age=scan.nextInt();
        System.out.println(age);
    if(age>25){
        System.out.println("you now become a men");
    }
    else if(age>5){
        System.out.println("you are not a kid ");
    }
    else{
        System.out.println("you are a kid");
    }
    }
}

