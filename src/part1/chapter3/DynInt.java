package part1.chapter3;

// В этом примере демонстрируется динамическая
// инициализация переменных
public class DynInt {
    public static void main(String[] args) {
        double a = 3.0, b = 4.0;

        // динамическая инициализация переменной c
        double c = Math.sqrt(a * a + b * b);
        System.out.println("Гипотенуза равна " + c);
    }
}
