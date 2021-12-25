package part2.chapter18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParseDemo {
    public static void main(String[] args) throws IOException {
        // создать буфферизованный поток чтения типа BufferedReader, используя стандартный поток ввода System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int sum = 0;
        int i;
        System.out.println("Введите число, 0 - для выхода");
        do {
            str = br.readLine();
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат");
                i = 0;
            }
            sum += i;
            System.out.println("Текущая сумма: " + sum);
        } while (i != 0);
    }
}
