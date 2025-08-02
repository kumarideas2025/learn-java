// 4 types of inheritance--
// single line = base ---> deriv
//
//class Shape{
//    public void area(){
//        System.out.println("display area");
//    }
//
//}
//// drive class then base class
//class Triangle extends Shape{
//public void area(int l, int h){
//    System.out.println(1/2*l*h);
//}
//}



//multilevel inhetance--
//class Shape{
//    public void area(){
//        System.out.println("display area");
//    }
//
//}
//// drive class then base class
//class Triangle extends Shape{
//    public void area(int l, int h){
//        System.out.println(1/2*l*h);
//    }
//}
//
//class EquiulateralTriangle extends Triangle{
//    public void area(int l, int h){
//        System.out.println(1/2*l*h);
//    }
//}



// hierarchial inheritance-- mulitiple subclass ,child class from one base class

class Shape{
    public void area(){
        System.out.println("display area");
    }

}
// drive class then base class
class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

class EquiulateralTriangle extends Triangle{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
     class Circul extends Shape{
         public void area(int r){
             System.out.println((3.1416)*r*r);
         }
     }
}


//Hybride inheritance---





//
//class Shape{
//    String color;
//
//}
//// that will take properties from one to another class.base to sub
//class Triangle extends Shape{
//
//}
public class inheritance {
   public static void main(String agrs[]){
       Triangle t1= new Triangle();
    //    t1.color="red";
   }
}
