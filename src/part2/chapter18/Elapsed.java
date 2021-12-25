package part2.chapter18;

// Измерение времени выполнения программы
public class Elapsed {
    public static void main(String[] args) {
        long start, end;

        System.out.println("Измерение времени перебора от 0 до 100000000");
        start = System.currentTimeMillis();
        for (int i = 0; i < 100000000L; i++) {
            Runtime.getRuntime().gc();
        }
        end = System.currentTimeMillis();
        System.out.println("Время выполнения: " + (end - start));
    }
}
