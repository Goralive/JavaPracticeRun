package advanced.threads;

import java.util.Scanner;

public class Multithread {
    public static void main(String[] args) {
        CustomThread thread = new CustomThread();
        thread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        thread.shutdown();

        // Thread thread2 = new Thread(new Runer());
        // thread2.start();

        System.out.println("BOB");
    }
}

class Runer implements Runnable {

    @Override
    public void run() {
        System.out.println("---------------STARTING----------------------------------");
        for (int i = 0; i < 1000; i++) {
            System.out.println("Hello from MyThread" + i);
        }
    }
}


class CustomThread extends Thread {
    private volatile boolean running = true;

    public void run() {
        while (running) {
            System.out.println("Hello!!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown() {
        this.running = false;
    }
}
