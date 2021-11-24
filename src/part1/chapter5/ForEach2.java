package part1.chapter5;

// Применение оператора break в цикле for в стиле for each
public class ForEach2 {
    public static void main(String[] args) {
        int sum = 0;
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // использовать цикл for в стиле for each для вывода и суммирования значений из части массива
        for (int x : nums) {
            System.out.println("Значение равно " + x);
            sum += x;
            if (x == 5) break; // прервать цикл после получения пяти значений
        }
        System.out.println("Сумма пяти первых элементов равна: " + sum);
    }
}
