package part2.chapter28;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Anatoly Tsybulya
 */

// Простой пример выполнения атомарных операций
public class AtomicDemo {
    public static void main(String[] args) {
        new Thread(new AtomThread("A")).start();
        new Thread(new AtomThread("B")).start();
        new Thread(new AtomThread("C")).start();
    }
}

class Shared1 {
    static AtomicInteger ai = new AtomicInteger(0);
}

// Поток исполнения, в котором инкрементируется значение счетчика
class AtomThread implements Runnable {
    String name;

    public AtomThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Запуск потока " + name);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Поток " + name + " получено: " + Shared1.ai.getAndSet(i));

        }
    }
}
