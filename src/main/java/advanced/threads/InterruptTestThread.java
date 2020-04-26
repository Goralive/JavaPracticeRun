package advanced.threads;

import java.util.Random;

public class InterruptTestThread {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            Random r = new Random();
            for (int i = 0; i < 1_000_000_000; i++) {
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("Thread was interrupted");
                    break;
                }
                Math.sin(r.nextDouble());
            }

        });

        System.out.println("Start thread");

        thread.start();
        Thread.sleep(1000);

        thread.interrupt();
        thread.join();




        System.out.println("Thread has finished");

    }
}
