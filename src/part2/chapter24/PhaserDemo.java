package part2.chapter24;

import java.util.concurrent.Phaser;

/**
 * @author Anatoly Tsybulya
 */

// Применение класса Phaser
public class PhaserDemo {
    public static void main(String[] args) {
        Phaser phsr = new Phaser(1);
        int curPhase;

        System.out.println("Запуск потоков");

        new Thread(new MyThread2(phsr, "A")).start();
        new Thread(new MyThread2(phsr, "B")).start();
        new Thread(new MyThread2(phsr, "C")).start();

        // ожидать завершения всеми потоками исполнения первой фазы
        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Фаза " + curPhase + " завершена");

        // ожидать завершения всеми потоками второй фазы
        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Фаза " + curPhase + " завершена");

        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Фаза " + curPhase + " завершена");

        // снять основной поток исполнения с регистрации
        phsr.arriveAndDeregister();

        if (phsr.isTerminated()) {
            System.out.println("Синхронизатор фаз завершен");
        }
    }
}

// Поток исполнения, применяющий синхронизатор фаз типа Phaser
class MyThread2 implements Runnable {
    Phaser phsr;
    String name;

    public MyThread2(Phaser phsr, String name) {
        this.phsr = phsr;
        this.name = name;
        phsr.register();
    }

    @Override
    public void run() {
        System.out.println("Поток " + name + " начинает первую фазу");
        phsr.arriveAndAwaitAdvance(); // известить о достижении фазы

        // Небольшая пауза, чтобы не нарушить порядок вывода. Это сделано для целей демонстрации, но совсем не
        // обязательно для правильного функционирования синхронизатора фаз
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Поток " + name + " начинает вторую фазу");
        phsr.arriveAndAwaitAdvance(); // известить о достижении фазы

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Поток " + name + " третью вторую фазу");
        phsr.arriveAndDeregister(); // известить о достижении фазы и снять потоки с регистрации
    }
}
