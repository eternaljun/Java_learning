package part2.chapter1920;

import java.util.Formatter;

// Выравнивание по левому краю
public class LeftJustify {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();

        // выровнять по правому краю (по умолчанию)
        fmt.format("|%10.2f|", 123.123);
        System.out.println(fmt);
        fmt.close();

        // выровнять по левому краю
        fmt = new Formatter();
        fmt.format("|%-10.2f|", 123.123);
        System.out.println(fmt);
        fmt.close();
    }
}
