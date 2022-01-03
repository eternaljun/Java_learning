package part2.chapter1920;

import java.util.Formatter;

// Применение спецификатора точности
public class PrecisionDemo {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();

        // формат с четырьмя цифрами после десятичной точки
        fmt.format("%.4f", 123.1234567);
        System.out.println(fmt);
        fmt.close();

        // формат с двумя цифрами после десятичной точки в поле из 16 символов
        fmt = new Formatter();
        fmt.format("%16.2e", 123.1234567);
        System.out.println(fmt);
        fmt.close();

        // вывести максимум 15 символов из строки
        fmt = new Formatter();
        fmt.format("%.15s", "Форматировать в Java теперь очень просто.");
        System.out.println(fmt);
        fmt.close();
    }
}
