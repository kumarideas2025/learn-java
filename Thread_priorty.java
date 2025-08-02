// search java thread priority for more information.

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        
        while (true) {
            System.out.println("THANK YOU"   + this.getName());
            
        }
    }

}

public class Thread_priorty {
    public static void main(String[] args) {
        // there is ready queue for running multiple thread. we called it as GBM.
        MyThread t1 = new MyThread("kowshik");
        MyThread t2 = new MyThread("Rohit1");
        MyThread t3 = new MyThread("Rohit22");
        MyThread t4 = new MyThread("Rohit77");
        MyThread t5 = new MyThread("Rohit45$$$$$ (most important)");
        t5.setPriority(Thread.MAX_PRIORITY); // that sure that that part will show most of the time
        t1.setPriority(Thread.MIN_PRIORITY);
  t1.start();
  t2.start();
  t3.start();
  t4.start();
  t5.start();
  
    }
}
