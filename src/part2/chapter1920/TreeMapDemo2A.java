package part2.chapter1920;

import java.util.*;

// Использовать метод thenComparing() для сортировки счетов вкладчиков сначала по фамилии, а затем по имени
// сравнить фамилии вкладчиков
class CompLastNames implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j;

        // найти индекс символа с которого начинается фамилия
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        return aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
    }
}

// отсортировать счета вкладчиков по ФИО
class CompThenByFirstName implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j;

        return aStr.compareToIgnoreCase(bStr);
    }
}

public class TreeMapDemo2A {
    public static void main(String[] args) {
        // использовать метод thenComparing() для создания компаратора, сравнивающего сначала фамилии, а затем ФИО
        // вкладчиков, если фамилии одинаковы
        CompLastNames compLN = new CompLastNames();
        Comparator<String> compLastThenFirst = compLN.thenComparing(new CompThenByFirstName());

        // создать древовидное отображение
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
