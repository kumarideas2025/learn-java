
//    2 types ---- function overloading and function overriding
//    1st one is compile time and 2nd one is run time
//    run time polymorphizom will discuss in inheritance topic
//    overriding different function but same work

//same number function crete in one class---overloading
//-- if one is void then other one  should not be void / if argu is string then other one is int/ add 2 arguments
// complie time error will come when complie but run time error come at the time of run(more danger).
class Sms {
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);

}

    public void printInfo(int age){
        System.out.println(age);

    }
    public void printInfo(String name,int age){
         System.out.println(name+" "+age);

    }}
    public class POL{
        public static void main(String args[]){


            Sms s1=new Sms();
            s1.name="kowshik";
            s1.age=224;
            s1.printInfo(s1.name,s1.age);

        }
    }
