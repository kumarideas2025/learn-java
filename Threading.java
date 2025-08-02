/*concurrent is likely Threading.parallelism is not like threading.
concurrent==> doing multiple thing in same time but not in one time.example: you cook, then eat ,then watch tv.
parallelism==> doing multiple in one time .  example:you cook and your friend read.

*/

class MyThread1 extends Thread {
    @Override
    public void run() {
        int i = 0;

        while (i < 40) {
            System.out.println("MY thread is running");
            i++;
        }

    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        int i = 0;

        while (i < 40) {
            System.out.println("FUCK YOUR SYSTEM");
            i++;
        }

    }
}

public class Threading {
    public static void main(String[] args) {
        MyThread1 Th = new MyThread1();
        MyThread2 Th2 = new MyThread2();

        Th.start(); // use start to execute thread.
        Th2.start();

    }
}
