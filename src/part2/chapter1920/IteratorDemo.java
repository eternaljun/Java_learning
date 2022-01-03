package part2.chapter1920;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

// Применение итераторов
public class IteratorDemo {
    public static void main(String[] args) {
        // создать списочный массив
        ArrayList<String> al = new ArrayList<>();

        // ввести элементы в списочный массив
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");

        // использовать итераторы для вывода содержимого списочного массива al
        System.out.println("Исходное содержимое списочного массива al: ");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        // видоизменить перебираемые объекты
        ListIterator<String> litr = al.listIterator();
        while (litr.hasNext()) {
            String element = litr.next();
            litr.set(element + " ");
        }
        System.out.print("Измененное содержимое списочного массива al: ");
        itr = al.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        // список в обратном направлении

        System.out.print("Измененный в обратном порядке список al: ");
        while (litr.hasPrevious()) {
            String element = litr.previous();
            System.out.print(element + " ");
        }
        System.out.println();
     }
}
