// Static keyword??
// --> those key who are common for class and accessable for all



// static we use for to set something in common
class Student{
    String name;
// as for all student school name is same ..we use static.

     static String school;
}

// we CAN change static method name for all--
public static void changeSchool(){
    school="DIU";
}


public class Static {

    public static void main(String args[]){
        // we can access it with class name(school cause it is static)
        // it is class part(school){common} .......
        // not object part which is private(name){every one name is unique}[so can not access]
         Student.school="GCc";



         Student student1=new Student();
         student1.name="Kowshik";
         System.out.println(student1.school);
    }
}



// we can use static key in 4 way-->
// static will save  memory
