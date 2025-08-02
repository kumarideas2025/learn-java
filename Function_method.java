// public class method {
//     static int logic(int x, int y) {
//         int z;

//         if (x > y) {
//             z = x + y;
//         } else {
//             z = (x + y) * 5;
//         }
//         x = 625;
//         return z;
//     }

//     public static void main(String args[]) {
//         int a = 5;
//         int b = 7;
//         int c;
//         c = logic(a, b);
//         System.out.println(a + " " + b);
//         int a1 = 2;
//         int b1 = 1;
//         int c1;
//         c1 = logic(a1, b1);
//         System.out.println(c);
//         System.out.println(c1);
//     }
// }

// public class method{
//use static that will share the class with method rather than object.
//     static void telljoke(){
//         System.out.println("i am kowshik");
//     }
//     public static void main(String[] args){
//         telljoke();
//     }
// }

// public class method {
//     static void change(int a) {
//         a = 98;
//     }

//     static void change2(int arr[]) {
// arr[0] = 98; // when talk about this arr then same object will change.
// }

// public static void main(String[] args) {

//     int[] marks = { 44, 66, 77, 88, 99, 100 };
// case 1; changing the integer-

// int x=45;
// change(x):
// System.out.println("the value of x after vhange is :"+x);

// case2:changing the array-
// we pass the marks reference to the change 2 method
// change2(marks);
// System.out.println("the value is :"+marks[0]);
//     }
// }

// method overloading-->

public class Function_method {
    static void kk() {
        System.out.println("good morning kowshik ");
    }

    static void kk(int a) {
        System.out.println("love you" + a);
    }

    
    static void kk(int a, int b) {
        System.out.println("love you" + a +  "  but she love you"+b);
    }


    public static void main(String[] args) {
        kk();
        kk(3000);
        kk(9000, 9);
    }
}