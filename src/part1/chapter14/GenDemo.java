package part1.chapter14;

// Простой обобщенный класс
// Здесь T обозначает параметр типа, который будет заменен реальным типом при создании объекта типа Gen

class Gen<T> {
    T ob; // объявить объект типа T

    // передать конструктору ссылку на объект типа T
    Gen(T o) {
        ob = o;
    }

    // возвратить объект ob
    T getob() {
        return ob;
    }

    // показать тип T
    void showType() {
        System.out.println("Типом T является " + ob.getClass().getName());
    }
}

// Продемонстрировать применение обобщенного класса
public class GenDemo {
    public static void main(String[] args) {
        // создать ссылку типа Gen для целых чисел
        Gen<Integer> iOb;

        // Создать объект типа Gen<Integer> и присвоить ссылку на него переменной iOb. Обратите внимение на
        // применение автоупаковки для инкапсуляции значения 88 в объекте Integer
        iOb = new Gen<Integer>(88);

        // показать тип данных, хранящихся в переменной iOb
        iOb.showType();

        // получить значение переменной iOb.!Не требуется приведение типов!
        int v = iOb.getob();
        System.out.println("Значение: " + v);
        System.out.println();

        // создать объект типа Gen для символьных строк
        Gen<String> strOb = new Gen<String>("Текст сообщения");

        // показать тип данных, хранящийся в переменной strOb
        strOb.showType();

        // получить значение переменной strOb. И в этом случае приведение типов не требуется
        String str = strOb.getob();
        System.out.println("Значение: " + str);
    }
}
