package part1.chapter4;

// Продемонстрировать применение нескольких операций с присваиванием
public class OpEquals {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        a += 5;
        b *= 4;
        c += a * b;
        c %= 6;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
