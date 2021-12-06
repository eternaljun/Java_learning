package part1.Chapter10;

import java.util.Random;

// Обработать исключение и продолжить работу
public class HandleError {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        Random r = new Random();

        for (int i = 0; i < 32000; i++) {
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b/c);
            } catch (ArithmeticException e) {
                System.out.println("Деление на ноль");
                a = 0; // присвоить ноль и продолжить работу
            }
            System.out.println("a: " + a);
        }
    }
}
