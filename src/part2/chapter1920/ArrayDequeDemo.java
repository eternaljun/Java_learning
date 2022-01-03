package part2.chapter1920;

import java.util.ArrayDeque;

// Применение класса ArrayDeque
public class ArrayDequeDemo {
    public static void main(String[] args) {
        // создать двустороннюю очередь
        ArrayDeque<String> adq = new ArrayDeque<>();

        // использовать класс ArrayDeque для организации стека
        adq.push("A");
        adq.push("B");
        adq.push("D");
        adq.push("E");
        adq.push("F");

        System.out.println("Извлечение из стека: ");

        while (adq.peek() != null) {
            System.out.print(adq.pop() + " ");
        }
        System.out.println();
    }
}
