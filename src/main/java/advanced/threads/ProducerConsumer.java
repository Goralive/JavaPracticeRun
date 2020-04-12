package advanced.threads;

import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {
    private static BlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<>(10);

    public static void main(String[] args) throws InterruptedException {
        Thread thread1  = new Thread(() -> {
               produce();
        });

        Thread thread2 = new Thread(()->{
            try {
                consumer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

    }

    private static void produce() {
        Random random = new Random();
        while (true) {
            try {
                arrayBlockingQueue.put(random.nextInt(100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void consumer() throws InterruptedException {
        while (true){
            Thread.sleep(100);
            System.out.println(arrayBlockingQueue.take());
            System.out.println("Queue size is " + arrayBlockingQueue.size());
        }
    }
}
