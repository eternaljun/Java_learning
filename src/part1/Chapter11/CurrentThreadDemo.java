package part1.Chapter11;

// Управление главным потоком исполнения
public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println("Текущий поток исполнения: " + t);

        // изменить имя потока исполнения
        t.setName("My thread");
        System.out.println("После изменения имени потока: " + t);

        try {
            for (int i = 3; i > 0 ; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток исполнения прерван");
        }
    }
}
