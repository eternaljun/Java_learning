package part2.chapter1920;

import java.util.Formatter;

// Применение спецификатора ширины поля
public class FormatDemo3 {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();

        fmt.format("|%f|%n|%12f|%n|%012f|",10.12345, 10.12345, 10.12345);
        System.out.println(fmt);
        fmt.close();
    }
}
