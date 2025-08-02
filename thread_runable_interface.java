
class MyThreadRunnable implements Runnable {

    public void run() {
       int i=0;
        while(i<40){
        System.out.println("i am a thread");
        i++;
    }
    }
}

class MyThreadRunnable2 implements Runnable {

    public void run() {
        int i=0;
        while(i<40){
        System.out.println("and thus you fucked up");
        i++;
    }
    }
}

public class thread_runable_interface {
    public static void main(String[] args) {
        // we can not run runable interface only using normal start method approach.so we did this.
        MyThreadRunnable t1 = new MyThreadRunnable();
        Thread k1 = new Thread(t1);
        MyThreadRunnable2 t2 = new MyThreadRunnable2();
        Thread k2 = new Thread(t2);
        k1.start();
        k2.start();
    }
}
