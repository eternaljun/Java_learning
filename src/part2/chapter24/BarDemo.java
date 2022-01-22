package part2.chapter24;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author Anatoly Tsybulya
 */

// Применение класса CyclicBarrier
public class BarDemo {
    public static void main(String[] args) {
        CyclicBarrier cd = new CyclicBarrier(3, new BarAction());
        System.out.println("Запуск потоков");

        new Thread(new MyThread1(cd, "A")).start();
        new Thread(new MyThread1(cd, "B")).start();
        new Thread(new MyThread1(cd, "C")).start();
        new Thread(new MyThread1(cd, "X")).start();
        new Thread(new MyThread1(cd, "Y")).start();
        new Thread(new MyThread1(cd, "Z")).start();
    }
}

// Поток исполнения, использующий барьер типа CyclicBarrier

class MyThread1 implements Runnable {
    CyclicBarrier cbar;
    String name;

    public MyThread1(CyclicBarrier cbar, String name) {
        this.cbar = cbar;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name);
        try {
            cbar.await();
        } catch (BrokenBarrierException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Объект этого класса вызывается по достижении барьера типа CyclicBarrier
class BarAction implements Runnable {
    @Override
    public void run() {
        System.out.println("Барьер достигнут");
    }
}
