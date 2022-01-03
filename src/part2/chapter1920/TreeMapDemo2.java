package part2.chapter1920;

import java.util.*;

// Компаратор для сортировки счетов по фамилиям вкладчиков
// сравнить последние слова в обеих символьных строках
class TComp implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j, k;

        // найти индекс символа с которого начинается фамилия
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        k = aStr.substring(i).compareTo(bStr.substring(j));
        if (k == 0) {
            // Фамилии совпадают, проверить имя и фамилию полностью
            return aStr.compareTo(bStr);
        } else {
            return k;
        }
    }
}

public class TreeMapDemo2 {
    public static void main(String[] args) {
        // создать древовидное множество типа TreeSet
        Map<String, Double> tm = new TreeMap<>(new TComp());
        // ввести элементы в древовидное множество
        tm.put("Джон Доу", 3434.34);
        tm.put("Том Смит", 123.22);
        tm.put("Джейн Бейкер", 1378.00);
        tm.put("Тод Холл", 92.22);
        tm.put("Ральф Смит", -19.08);

        // получить множество элементов
        Set<Map.Entry<String,Double>> set = tm.entrySet();

        // вывести множество записей
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        // внести сумму 1000 на счет Джона Доу
        double balance = tm.get("Джон Доу");
        tm.put("Джон Доу", balance + 1000);
        System.out.println("Новый остаток на счету Джона Доу: " + tm.get("Джон Доу"));
    }
}
