package part1.chapter15;

// Реализовать простую фабрику классов, используя ссылку на конструктор
interface MyFunc4<R, T> {
    R func(T n);
}

// Простой обобщенный класс
class MyClass2<T> {
    private T val;

    // конструктор, принимающий один параметр
    MyClass2(T v) {
        val = v;
    }

    // Конструктор по умолчанию. Этот конструктор в данной программе не используется
    MyClass2() {
        val = null;
    }

    T getVal() {
        return val;
    }
}

// Простой не обобщенный класс
class MyClass3 {
    String str;

    // конструктор, принимающий один аргумент
    MyClass3(String s) {
        str = s;
    }

    public String getVal() {
        return str;
    }

    // Конструктор по умолчанию. Этот конструктор в данной программе не используется
    MyClass3() {
        str = "";
    }
}
public class ConstructorRefDemo3 {
    // Фабричный метод для объектов разных классов. У каждого класса должен быть свой конструктор, принимающий один
    // параметр типа T. А параметр R обозначает тип создаваемого объекта
    static <R, T> R myClassFactory(MyFunc4<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String[] args) {
        // Создать ссылку на конструктор класса MyClass2. Здесь в операции new вызывается конструктор, принимающий аргумент
        MyFunc4<MyClass2<Double>, Double> myClassCons = MyClass2<Double>::new;
        // создать экземпляр типа класса MyClass2, используя фабричный метод
        MyClass2<Double> mc = myClassFactory(myClassCons, 100.1);
        // использовать только что созданный экземпляр класса MyClass2
        System.out.println("Значение val в объекте mc равно " + mc.getVal() );
        // А теперь создать экземпляр другого класса, используя метод myClassFactory()
        MyFunc4<MyClass3,String> myClassCons2 = MyClass3::new;
        // создать экземпляр класса MyClass3, используя фабричный метод
        MyClass3 mc2 = myClassFactory(myClassCons2, "Лямбда");
        // использовать только что созданный экземпляр класса MyClass2
        System.out.println("Значение str в объекте mc2 равно " + mc2.getVal() );
    }
}
