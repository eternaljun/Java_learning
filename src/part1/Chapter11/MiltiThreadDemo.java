package part1.Chapter11;

// Создать второй поток исполнения, расширив класс Thread
class NewThread2 implements Runnable {
    String name;
    Thread t;

    NewThread2(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("Новый поток: " + t);
        t.start(); // запустить поток на исполнение
    }

    // Точка входа во второй поток исполнения
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван");
        }
        System.out.println(name + " завершен");
    }
}
public class MiltiThreadDemo {
    public static void main(String[] args) {
        new NewThread2("Один"); // запустить потоки на исполнение
        new NewThread2("Два");
        new NewThread2("Три");
        try {
            // Ожидать завершение других потоков исполнения
                Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершен");
    }
}


