package part1.chapter5;

// Эта программа содержит ошибку
public class BreakErr {
    public static void main(String[] args) {
        one:
        for (int i = 0; i < 3; i++) {
            System.out.println("Проход " + i + ": ");
        }
        for (int i = 0; i < 100; i++) {
            //if (i == 10) break one; // ошибка
            //System.out.println(i + " ");
        }
    }
}
