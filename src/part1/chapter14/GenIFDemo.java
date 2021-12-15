package part1.chapter14;

// Обобщенный интерфейс
interface  MinMax<T extends Comparable<T>> {
    T min();
    T max();
}

// реализовать обобщенный интерфейс MinMax
class MyClass<T extends Comparable<T>> implements MinMax {
    T[] vals;

    MyClass(T[] o) {
        vals = o;
    }

    // возвратить минимальное значение из массива vals
    public T min() {
        T v = vals[0];

        for (int i = 1; i < vals.length; i++) {
            if (vals[i].compareTo(v) < 0) {
                v = vals[i];
            }
        }
        return v;
    }

    // возвратить максимальное значение из массива vals
    public T max() {
        T v = vals[0];

        for (int i = 1; i < vals.length; i++) {
            if (vals[i].compareTo(v) > 0) {
                v = vals[i];
            }
        }
        return v;
    }
}
public class GenIFDemo {
    public static void main(String[] args) {
        Integer inums[] = {3, 6, 2, 8, 6};
        Character chs[] = {'b', 'r', 'p', 'w'};

        MyClass<Integer> iob = new MyClass<>(inums);
        MyClass<Character> cob = new MyClass<>(chs);

        System.out.println("Максимальное значение в массиве inums: " + iob.max());
        System.out.println("Минимальное значение в массиве inums: " + iob.min());
        System.out.println("Максимальное значение в массиве chs: " + cob.max());
        System.out.println("Минимальное значение в массиве chs: " + cob.min());
    }
}
