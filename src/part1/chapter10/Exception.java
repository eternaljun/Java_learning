package part1.chapter10;

public class Exception {
    public static void main(String[] args) {
        int d,a;

        try { // проконтролировать блок кода
            d = 0;
            a = 42 / 0;
            System.out.println("Это не будет выведено");
        } catch (ArithmeticException e) {
            // перехватить ошибку деления на ноль
            System.out.println("Деление на ноль");
        }
        System.out.println(" После оператора catch");
    }
}
