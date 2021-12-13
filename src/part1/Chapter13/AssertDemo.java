package part1.Chapter13;

// Применение оператора assert
public class AssertDemo {
    static int val = 3;

    // возвратить целочилсенное значение
    static int getnum() {
        return val--;
    }
    public static void main(String[] args) {
        int n;
        for (int i = 0; i < 10; i++) {
            n = getnum();

            assert n > 0; // не подтвердиться, если n == 0

            System.out.println("n равно " + n);
        }
    }
}
