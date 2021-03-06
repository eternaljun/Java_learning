package part2.chapter28;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Anatoly Tsybulya
 */

// Простой пример блокировки
public class LockDemo {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();

        new Thread(new LockThread(lock, "A")).start();
        new Thread(new LockThread(lock, "B")).start();
    }
}

// Общий ресурс
class Shared {
    static int count = 0;
}

// Поток исполнения, инкрементирующий значение счетчика
class LockThread implements Runnable {
    String name;
    ReentrantLock lock;

    public LockThread(ReentrantLock lock, String name) {
        this.name = name;
        this.lock = lock;
    }

    @Override
    public void run() {
        System.out.println("Запуск потока " + name);

        try {
            // сначала заблокировать счетчик
            System.out.println("Поток " + name + " ожидает блокировки счетчика");
            lock.lock();
            System.out.println("Поток " + name + " блокирует счетчик");
            Shared.count++;
            System.out.println("Поток " + name + ": " + Shared.count);
            // а теперь переключить контекст, если это возможно
            System.out.println("Поток " + name + " ожидает");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace(System.out);
        } finally {
            // снять блокировку
            System.out.println("Поток " + name + " разблокирует счетчик");
            lock.unlock();
        }
    }
}
