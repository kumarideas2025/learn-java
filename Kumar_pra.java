
interface Animal {
    void eat();

    void sleep();
}

class Monkey {
    public void jump() {
        System.out.println("jump you monkey");
    }

    public void bike() {
        System.out.println("bike get you monkey");
    }

}

class Human extends Monkey implements Animal {
    public void eat() {
        System.out.println("you eat human");
    }

    public void sleep() {
        System.out.println("go human and took a sleep");
    }
}

class Dog implements Animal {
    public void eat() {
        System.out.println("you eat dog");
    }

    public void sleep() {
        System.out.println("go doggy and took a sleep");
    }
}

public class Kumar_pra {
    public static void main(String[] args){
        Animal animals[]=new Animal[2];
         animals[0]=new Human();
         animals[1]=new Dog();
for(Animal animal:animals){
    animal.eat();
    animal.sleep();

}
Human kowshik=new Human();    
kowshik.jump();
kowshik.bike();
    }

}
