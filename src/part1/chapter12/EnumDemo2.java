package part1.chapter12;

public class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;

        System.out.println("Константы перечисляемого типа Apple:");

        // применить метод values()
        Apple[] allapples = Apple.values();
        for (Apple a : allapples) {
            System.out.println(a);
        }
        System.out.println();

        // применить метод valueOf()
        ap = Apple.valueOf("Winesap");
        System.out.println("Переменная ap содержит " + ap);

    }
}

