package part2.chapter1920;

import java.util.Timer;
import java.util.TimerTask;

// Применение классов Timer и TimerTask
class MyTimerTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("Задание по таймеру выполняется.");
    }
}
public class TimerTest {
    public static void main(String[] args) {
        MyTimerTask myTask = new MyTimerTask();
        Timer myTimer = new Timer();
        // Установить первоначальную паузу в течение одной секунды, а затем повторять каждые полсекунды
        myTimer.schedule(myTask, 1000, 500);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

        }
        myTimer.cancel();
    }
}
