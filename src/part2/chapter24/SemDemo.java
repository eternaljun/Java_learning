package part2.chapter24;

import java.util.concurrent.Semaphore;

/**
 * @author Anatoly Tsybulya
 */

// Простой пример использования семафора
public class SemDemo {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(1);

//        new IncThread(sem, "A").start();
//        new DecThread(sem, "B").start();
        Thread myThread1 = new Thread(new IncThread(sem, "A"));
        Thread myThread2 = new Thread(new DecThread(sem, "B"));
        myThread1.start();
        myThread2.start();
    }
}

// общий ресурс
class Shared {
    static int count = 0;
}

// Поток исполнения, увеличивающий значение счетчика на единицу
class IncThread implements Runnable {
    String name;
    Semaphore sem;

    public IncThread(Semaphore sem, String name) {
        this.name = name;
        this.sem = sem;
    }

    public void run() {
        System.out.println("Запуск потока " + name);
        try {
            // сначала получить разрешение
            System.out.println("Поток " + name + " ожидает разрешения");
            sem.acquire();
            System.out.println("Поток " + name + " получает разрешение");
            // а теперь получить доступ к общему ресурсу
            for (int i = 0; i < 5; i++) {
                Shared.count++;
                System.out.println(name + ": " + Shared.count);

                // разрешить, если возможно, переключение контекста
                Thread.sleep(10);
            }
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }

        // освободить разрешение
        System.out.println("Поток " + name + " освобождает разрешение");
        sem.release();
    }
}

// Поток исполнения, уменьшающий значение на единицу
class DecThread implements Runnable {
    String name;
    Semaphore sem;

    public DecThread(Semaphore sem, String name) {
        this.name = name;
        this.sem = sem;
    }

    public void run() {
        System.out.println("Запуск потока " + name);

        try {
            // сначала получить разрешение
            System.out.println("Поток " + name + " ожидает разрешения");
            sem.acquire();
            System.out.println("Поток " + name + " получает разрешение");
            // а теперь получить доступ к общему ресурсу
            for (int i = 0; i < 5; i++) {
                Shared.count--;
                System.out.println(name + ": " + Shared.count);

                // разрешить, если возможно, переключение контекста
                Thread.sleep(10);
            }
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }
    }
}
