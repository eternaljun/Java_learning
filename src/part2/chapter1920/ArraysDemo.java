package part2.chapter1920;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// Применение некоторых методов из класса Arrays
public class ArraysDemo {
    public static void main(String[] args) {
        // выделить и инициализировать массив
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = -3 * i;
        }

        // вывести содержимое, отсортировать и снова вывести содержимое массива
        System.out.println("Исходный массив");
        display(array);
        Arrays.sort(array);
        System.out.println("Отсортированный массив: ");
        display(array);

        // заполнить массив и вывести его содержимое
        Arrays.fill(array, 2, 6, -1);
        System.out.println("Массив после вызова метода fill(): ");
        display(array);

        // отсортировать и вывести содержимое массива
        Arrays.sort(array);
        System.out.println("Массив после повторной сортировки: ");
        display(array);

        // выполнить двоичный поиск значения -9
        System.out.println("Значение -9 находится на позиции ");
        int index = Arrays.binarySearch(array, -9);
        System.out.println(index);
        Queue<Integer> queue = new LinkedList<>();
    }

    static void display(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
