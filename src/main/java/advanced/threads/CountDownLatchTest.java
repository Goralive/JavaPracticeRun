package advanced.threads;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchTest {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch cdl = new CountDownLatch(3);

        ExecutorService es = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 3; i++) {
            es.submit(new Processor(cdl));
        }

        es.shutdown();

        cdl.await();
        System.out.println("Latch has been opened main thread is proceeding!");
    }
}

class Processor implements Runnable {
    private CountDownLatch cdl;

    public Processor(CountDownLatch cdl) {
        this.cdl = cdl;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         cdl.countDown();
    }
}
