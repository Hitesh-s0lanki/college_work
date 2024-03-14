import java.util.*;

public class Thread_use {
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                String[] col = { "Red", "Blue" };

                for (String i : col) {
                    System.out.println("This Thread1 is " + i);
                }
            }
        }, "Thread_1");

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                String[] col = { "Red", "Blue" };

                for (String i : col) {
                    System.out.println("This Thread2 is " + i);
                }
            }
        }, "Thread_2");

        t1.sleep(200);
        t1.start();
        t2.start();
    }
}
