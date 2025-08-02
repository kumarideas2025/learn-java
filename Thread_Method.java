
class MyThread extends Thread {

    public void run() {
        int i = 0;
        while (i < 11) {
            System.out.println("THANK YOU");
            i++;
        }
    }

    class MYThread2 extends Thread {

        public void run() {
            int i = 0;
            while (i < 12) {
                System.out.println("YOU  ARE WELCOME");
                i++;
            }
        }

    }

}

public class Thread_Method {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();
        t1.start();
        // we use try-catch so than join method can not give a error.
        try{
        t1.join();// we want t2 start after t1 finish

        }
        catch(Exception e){
            System.out.println(e);
        }
 
        t2.start();
    }
}
