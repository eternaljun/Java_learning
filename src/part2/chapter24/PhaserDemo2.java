package part2.chapter24;

import java.util.concurrent.Phaser;

/**
 * @author Anatoly Tsybulya
 */

// Расширить класс Phaser, и переопределить метод onAdvance() таким образом, чтобы было выполнено только
// определенное число фаз

// расширить класс Phaser, чтобы выполнить только определенное количество фаз
class MyPhaser extends Phaser {
    int numPhases;

    public MyPhaser(int parties, int numPhases) {
        super(parties);
        this.numPhases = numPhases - 1;
    }

    // переопределить метод onAdvance(), чтобы выполнить определенное количество фаз
    protected boolean onAdvance(int p, int regParties) {
        // Следующий вызов метода printLn() требуется только для целей иллюстрации. Как правило, метод onAdvance()
        // не отображает выводимые данные
        System.out.println("Фаза " + p + " завершена.\n");

        // возвратить логическое значение true, если все фазы завершены, в противном случае вернуть false
        return p == numPhases || regParties == 0;
    }
}

public class PhaserDemo2 {
    public static void main(String[] args) {
        MyPhaser phsr = new MyPhaser(1,4);

        System.out.println("Запуск потоков\n");

        new Thread(new MyThread3(phsr,"A")).start();
        new Thread(new MyThread3(phsr,"B")).start();
        new Thread(new MyThread3(phsr,"C")).start();

        // ожидать завершения определенного количества фаз
        while (!phsr.isTerminated()) {
            phsr.arriveAndAwaitAdvance();
        }

        System.out.println("Синхронизатор фаз завершен");
    }
}

class MyThread3 implements Runnable {
    Phaser phsr;
    String name;

    public MyThread3(Phaser phsr, String name) {
        this.phsr = phsr;
        this.name = name;
        phsr.register();
    }

    @Override
    public void run() {
        while (!phsr.isTerminated()) {
            System.out.println("Поток " + name + " начинает фазу " + phsr.getPhase());
            phsr.arriveAndAwaitAdvance();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
