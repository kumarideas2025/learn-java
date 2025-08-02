// two base class to derive class ?
// not possible in class but in interface it is possible
//called multiple inheritance


//animal can walk and eat --(basic class)---> (derive class) horse who can eat



interface Animal{
  public void walk();

}

interface Herbivore{
 public void eat();

}


class Horse implements Animal, Herbivore{
 public void walk(){
    System.out.println("walks on 4 legs");
 }
public void eat(){
    System.out.println("eat only grass");
 }

}
public class Srk2 {

    public static void main(String args[]){
        Horse horse= new Horse();
        horse.walk();
        horse.eat();
    }
}

