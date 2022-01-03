package part2.chapter1920;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

// Простое применение интерфейса Spliterator
public class SpliteratorDemo {
    public static void main(String[] args) {
        // создать списочный массив числовых значений типа double
        List<Double> vals = new ArrayList<>();

        // ввести значения в списочный массив
        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);
        // вызвать метод tryAdvance() для вывода содержимого списочного массива vals
        System.out.println("Содержимое списочного массива vals:\n");
        Spliterator<Double> spltitr = vals.spliterator();
        while (spltitr.tryAdvance((n) ->
                System.out.println(n))) ;
        System.out.println();

        // создать новый списочный массив, содержащий квадратные корни числовых значений из списочного массива vals
        spltitr = vals.spliterator();
        List<Double> sqrs = new ArrayList<>();
        while (spltitr.tryAdvance((n) -> sqrs.add(Math.sqrt(n)))) ;
        // вызвать метод forEachRemaining() для вывода содержимого списочного массива sqrs
        System.out.print("Содержимое списочного массива sqrs:\n");
        spltitr = sqrs.spliterator();
        spltitr.forEachRemaining((n) -> System.out.println(n));
        System.out.println();

    }
}
