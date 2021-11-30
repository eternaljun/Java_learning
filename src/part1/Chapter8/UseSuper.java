package part1.Chapter8;

// Использовать ключевое слово super с целью предотвратить сокрытие имен
class A1 {
    int i;
}

// создать подкласс путем расширения класса A1
class B1 extends A1 {
    int i; // этот член скрывает член i из класса A1

    B1(int a, int b) {
        super.i = a; // член i из класса A1
        i = b;       // член i из класса B1
    }

    void show() {
        System.out.println("Член i в суперклассе: " + super.i);
        System.out.println("Член i в подклассе: " + i);
    }
}
public class UseSuper {
    public static void main(String[] args) {
        B1 subOb = new B1(1,2);

        subOb.show();
    }
}
