//abstract is likely is something that we can think off but may not real exits...here animal is something from
//where horse ,chicken class might come.....(we can creATE HORSE FROM HORSE...)

// search abstract method 


// 2nd type of abstraction  which is called interfaces abstraction(it is not a pure abstraction )
// pure abstraction will hide useful and show useful information.
// interface is like class but have some methods. ---> see Srk file

abstract class Animal{


    //  in abstract can be constructor
  Animal  (){
    System.out.println("you are creating new animal");
  }

//    as walk is common in all so we can start it like abstract..and here the process is end. no need to add {} this and write here.
    abstract void walk();

    public void eat(){
     System.out.println("animal eat");
 }
}

class Horse extends Animal{
    Horse(){
        System.out.println("created a horse");
    }
    public void walk(){
        System.out.println("walks on 4 legs");

    }
}


class Chiken extends Animal{
    public void walk(){
        System.out.println("walks on 2 legs");

    }
}



public class Abstract{
    public static void main(String args[]){
        Horse horse=new Horse();

        horse.walk();
        // in horse class there is not eat method .so it  inherite eat from animal
        horse.eat();





        // if we try to do this there will be an error--cannot instantiated(means create){so Animal walk cannot create}
        //this is a run time error; cause at the time of compilation there is not a red underline .we find it after complie so it is a run time error.
        // Animal animal=new Animal();
        // animal.walk();
    }
}





// output--->

//in 2 constructor basic constructor to driven constructor is continue --- is call chain 0f constructor
// first : you are creating new animal
// second: creating a horse
// this how 