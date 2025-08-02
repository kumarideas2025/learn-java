
 // practice question 2
interface Animal {
    void eat();
    void sleep();
}

 
class Monkey {
    public void jump() {
        System.out.println("Monkey jumps!");
    }

    public void bike() {
        System.out.println("Monkey rides a bike!");
    }
}

 class Human extends Monkey implements Animal {
    @Override
    public void eat() {
        System.out.println("Human eats!");
    }

    @Override
    public void sleep() {
        System.out.println("Human sleeps!");
    }
}

 class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog eats!");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps!");
    }
}

 public class Kwshik {
    public static void main(String[] args) {
         Animal[] animals = new Animal[2];
        
         animals[0] = new Human();
        animals[1] = new Dog();
        
         for (Animal animal : animals) {
            animal.eat();
            animal.sleep();
        }
        
         Human human = new Human();
        human.jump(); 
        human.bike(); 
}
 }