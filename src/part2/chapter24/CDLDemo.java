package part2.chapter24;

import java.util.concurrent.CountDownLatch;

/**
 * @author Anatoly Tsybulya
 */

// Применение класса CountDownLatch
public class CDLDemo {
    public static void main(String[] args) {
        CountDownLatch cdl = new CountDownLatch(5);

        System.out.println("Запуск потока исполнения");

        new Thread(new MyThread(cdl)).start();

        try {
            cdl.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Завершение потока исполнения");
    }
}

class MyThread implements Runnable {
    CountDownLatch latch;

    public MyThread(CountDownLatch latch) {
        this.latch = latch;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            latch.countDown(); // обратный отсчет
        }
    }
}
