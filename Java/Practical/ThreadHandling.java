//Thread using interface runnable
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("This thread is mad  using Runnable interface ");
    }
}

// Using inheritance
class MyThread extends Thread {
    public void run() {
        System.out.println("This is a extends thread");
    }
}

public class ThreadHandling {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

        Thread thread1 = new Thread(new MyRunnable());
        thread1.start();

        // lamba thread
        Thread thread2 = new Thread(() -> {
            System.out.println("This is lamba thread");
        });
        thread2.start();

        // make runnable
        Thread thread3 = new Thread(new Runnable() {
            public void run() {
                System.out.println("Inline thread");
            }
        }, "Thread_1");
        thread3.start();

    }
}
