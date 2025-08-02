
class MyThread extends Thread {
    public MyThread(String name) {
        super(name);// Calls the constructor of the Thread class
    }

    public void run() {
        int i = 0;
        while (i < 3) {
            System.out.println("i am a thread");
            i++;
        }
    }

}

public class Constractor_of_Thread {
    public static void main(String[] args) {
        MyThread t = new MyThread("kowshik");
        MyThread t2 = new MyThread("Rohit");

        t.start();
        t2.start();
        System.out.println("the id of the thread is" + t.getId());
        System.out.println("the name of the thread is " + t.getName());

        System.out.println("the id of the thread is" + t2.getId());
        System.out.println("the name of the thread is " + t2.getName());

    }
}
