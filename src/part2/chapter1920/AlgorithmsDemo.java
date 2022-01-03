package part2.chapter1920;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

// Применение различных алгоритмов коллекций
public class AlgorithmsDemo {
    public static void main(String[] args) {
        // создать неинициализированный связный список
        List<Integer> l1 = new LinkedList<>();
        l1.add(-8);
        l1.add(20);
        l1.add(-20);
        l1.add(8);

        // создать компаратор с обратным упорядочиванием
        Comparator<Integer> r = Collections.reverseOrder();

        // отсортировать список с помощью этого компаратора
        Collections.sort(l1, r);

        System.out.print("Список отсортирован в обратном порядке: ");

        for (Integer i : l1) {
            System.out.print(i + " ");
        }
        System.out.println();

        // перетасовать список
        Collections.shuffle(l1);

        // вывести перетасованный список
        System.out.print("Список перетасован: ");

        for (Integer i : l1) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Минимум: " + Collections.min(l1));
        System.out.println("Максимум: " + Collections.max(l1));

    }
}
