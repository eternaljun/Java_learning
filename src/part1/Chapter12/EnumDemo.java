package part1.Chapter12;

// Перечисление сортов яблок
enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;
        ap = Apple.RedDel;

        // вывести значение перечисляемого типа
        System.out.println("Значение ap: " + ap);
        System.out.println();

        ap = Apple.GoldenDel;

        // сравнить два значения перечисляемого типа
        if (ap == Apple.GoldenDel) {
            System.out.println("Переменная ap содержит GoldenDel.\n");
            // применить перечисление для управления оператором switch
            switch (ap) {
                case Jonathan:
                    System.out.println("Сорт Jonathan красный.");
                    break;
                case GoldenDel:
                    System.out.println("Сорт Golden Delicious желтый.");
                    break;
                case RedDel:
                    System.out.println("Сорт Red Delicious красный.");
                    break;
                case Winesap:
                    System.out.println("Сорт Winesap красный.");
                    break;
                case Cortland:
                    System.out.println("Сорт Cortland красный.");
                    break;
            }
        }
    }
}
