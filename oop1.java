class pen{
    String color;
    String type;

    public void write(){
        System.out.println("write something");
    }
    public void printcol(){
        System.out.println(this.color);
        System.out.println(this.type);
    }
}
class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
//    constractor-- no perameter
    Student(){
        System.out.println("constractor called");
    }

    //constractor --- with perameter
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }

//    COPY CONSTRACTOR--create new constructor and add  properties from s1
Student(Student s2){
    this.name=s2.name;
    this.age=s2.age;
}
// IN JAVA THERE IS NO DESTRUCTOR..HERE IS A GARBEG COLLECTOR
}
public class oop1{
    public static void main(String args[]){
        pen pen1=new pen();
        pen1.color="blue";
        pen1.type="gel";

        pen1.write();

        pen pen2=new pen();
        pen2.color="black";
        pen2.type="gel";

        pen1.printcol();
        pen2.printcol();

        Student s1=new Student();
        s1.name="kowshik";
        s1.age=224;
        s1.printInfo();

        Student s2=new Student(s1);
//        s1  properties will copy in s2
        s2.printInfo();


    }
}
