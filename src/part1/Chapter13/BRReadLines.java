package part1.Chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Чтение символьных строк с консоли средствами класса BufferedReader
public class BRReadLines {
    public static void main(String[] args) throws IOException {
        // создать поток ввода типа BufferedReader, используя стандартный поток ввода System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Введите строки текста");
        System.out.println("Введите \"стоп\", для завершения.");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("стоп"));
    }
}
