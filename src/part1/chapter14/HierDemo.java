package part1.chapter14;

// В подкласс могут быть введены свои параметры типа
class Gen2<T> {
    T ob; // объявить объект типа T

    // передать конструктору ссылку на объект типа T
    Gen2(T o) {
        ob = o;
    }

    // возвратить ссылку ob
    T getOb() {
        return ob;
    }
}

// Подкласс, производный от класса Gen, где определяется второй параметр типа V
class Gen3<T,V> extends Gen<T> {
    V ob2;

    Gen3(T o, V o2) {
        super(o);
        ob2 = o2;
    }

    V getOb2() {
        return ob2;
    }
}

// создать объект типа Gen3
public class HierDemo {
    public static void main(String[] args) {

        // создать объекты типа Gen3 для символьных строк целых чисел
        Gen3<String, Integer> x = new Gen3<>("Значение равно: ", 99);
        System.out.print(x.getob());
        System.out.println(x.getOb2());
    }
}
