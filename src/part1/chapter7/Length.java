package part1.chapter7;

// Применение свойства length , определяющего длину массива
public class Length {
    public static void main(String[] args) {
        int a1[] = new int[10];
        int a2[] = {3, 5, 7, 1, 8, 99, 44, -10};
        int a3[] = {4, 3, 2, 1};

        System.out.println("длина a1 авна " + a1.length);
        System.out.println("длина a2 авна " + a2.length);
        System.out.println("длина a3 авна " + a3.length);
    }
}
