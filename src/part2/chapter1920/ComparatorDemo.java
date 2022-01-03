package part2.chapter1920;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

// Компаратор для сравнения символьных строк в обратном порядке
class MyComp implements Comparator<String> {
    public int compare(String a, String b) {
//        String aStr, bStr;
//        aStr = a;
//        bStr = b;
//        return bStr.compareTo(aStr);ч
        return b.compareTo(a);
    }
}
public class ComparatorDemo {
    public static void main(String[] args) {
        // создать древовидное множество типа TreeSet
        Set<String> ts = new TreeSet<>(new MyComp());
        // ввести элементы в древовидное множество
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        // вывести элементы из древовидного множества
        for (String element : ts) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
