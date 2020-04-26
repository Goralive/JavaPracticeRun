package advanced.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.main();
    }
}

class Worker {
    Random random = new Random();

    Object lock1 = new Object();
    Object lock2 = new Object();

    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();

    public synchronized void addToList1() {
        synchronized (lock1) {
            for (int i = 0; i < 1000; i++) {
                list1.add(random.nextInt(100));
            }
        }
    }

    public synchronized void addToList2() {
        synchronized (lock2) {
            for (int i = 0; i < 1000; i++) {
                list2.add(random.nextInt(100));
            }
        }
    }

    public void work() {
        addToList1();
        addToList2();
    }


    public void main() {

        long before = System.currentTimeMillis();

        Thread thread1 = new Thread(() -> {
            work();
        });

        Thread thread2 = new Thread(() -> {
            work();
        });
        ;

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long after = System.currentTimeMillis();
        System.out.println("Programm took " + (after - before));
        System.out.println("list 1 " + list1.size());
        System.out.println("list 2 " + list2.size());
    }
}
