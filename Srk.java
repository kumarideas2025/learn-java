// GO TO FILE Abstraction to find 1st part of it

// 2nd part-->


interface Animal{
    // interfaces properties --> search 
// int eye=2;--fixed property so it is public ,static and final;
// void walk()--- by default interface




    // there walk is only define 
    public void walk();
    // if we try to create Animal as constructor that can not be happen cause interfaces has no constructor
    // Animal(){
    // }

    // if there we want to implement any function error will show cause it is an non-abstract and we can not implement by us. it can by by specfic animal.
    // void eat(){
    // } 
}


// in java interfaces are not extends ...they are implement
class Horse implements Animal{
// there we need to implement walk;
 public void walk(){
    System.out.println("walks on 4 legs");
 }
}


public class Srk {
    public static void main(String args[]){
        Horse horse= new Horse();
        horse.walk();
    }
}
 