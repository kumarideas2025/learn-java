abstract class pen {
    pen() {
        System.out.println("this is my pen");
    }

    abstract void write();

    abstract void refill();
}

class learn extends pen {
    learn() {
        System.out.println("can u");
    }

    public void write() {
        System.out.println("you are not gay");
    }

    public void refill() {
        System.out.println("you are not boy");
    }

}

public class Practice {

    public static void main(String[] args) {
        learn pens = new learn();
        pens.write();
        pens.refill();

    }
}





 