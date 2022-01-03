package part2.chapter1920;

import java.util.Currency;
import java.util.Locale;

// Применение класса Currency
public class CurDemo {
    public static void main(String[] args) {
        Currency c = Currency.getInstance(Locale.US);

        System.out.println("Символ: " + c.getSymbol());
        System.out.println("Количество цифр в дробной части числа по умолчанию: " + c.getDefaultFractionDigits());
    }
}
