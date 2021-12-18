package part1.chapter15;

// Применение ссылки на конструктор
// В функциональном интерфейсе MyFunc определяется метод, возвращающий ссылку на класс MyClass
interface MyFunc3 {
    MyClass1 func(int n);
}
class MyClass1 {
    private int val;

    // Этот конструктор принимает один аргумент

    MyClass1(int v) {
        val = v;
    }
    // А это конструктор по умолчанию
    MyClass1() {
        val = 0;
    }
    int getVal() {
        return val;
    }
}
public class ConstructorRefDemo {
    public static void main(String[] args) {
        // Создать ссылку на конструктор класса MyClass. Метод func() из интерфейса MyFunc принимает
        // аргумент, поэтому в операции new вызывается параметризованный конструктор класса MyClass,
        // а не к его конструктору по умолчанию
        MyFunc3 myClassCons = MyClass1::new;
        // создать экземпляр класса MyClass1 по ссылке на его конструктор
        MyClass1 mc = myClassCons.func(100);

        // использовать только что созданный экземпляр класса MyClass
        System.out.println("Значение val в объекте mc равно " + mc.getVal());
    }
}
