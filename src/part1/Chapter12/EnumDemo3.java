package part1.Chapter12;

// Использовать конструктор, переменную экземпляра и мтедо в перечислении
enum Apple1{
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);

    private int price; // цена яблока каждого сорта

    // Конструктор
    Apple1(int p) {
        price = p;
    }
    int getPrice() {
        return price;
    }
}
public class EnumDemo3 {
    public static void main(String[] args) {
        Apple1 ap;

        // вывести цену на яблоко сорта Winesap
        System.out.println("Яблоко сорта Winesap стоит " + Apple1.Winesap.getPrice());
        // вывести цены на все сорта яблок
        System.out.println("Цены на все сорта яблок:");
        for (Apple1 a : Apple1.values()) {
            System.out.println(a + " стоит " + a.getPrice());
        }
    }
}
