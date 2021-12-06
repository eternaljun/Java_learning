package part1.Chapter10;

// Продемонстрировать цепочки исключений
public class ChainExcDemo {
    static void demoproc() {

        // создать исключение
        NullPointerException e = new NullPointerException("Верхний уровень");

        // добавить причину исключения
        e.initCause(new ArithmeticException("причина"));

        throw e;
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            // вывести исключение верхнего уровня
            System.out.println("Перехвачено исключение: " + e);

            // вывести сключение, послужившее причиной
            // для исключения верхнего уровня
            System.out.println("Первопричина: " + e.getCause());
        }
    }
}
