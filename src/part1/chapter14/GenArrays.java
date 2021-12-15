package part1.chapter14;

// Обобщения и массивы
class Gen4<T extends Number> {
    T ob;

    T vals[]; // Верно!

    Gen4(T o, T[] nums) {
        ob = o;

        // этот оператор неверен,
        // vals = new T[10]; // нельзя создать массив объектов типа T
        // тем не менее этот оператор верен
        vals = nums; // можно приссвоить ссылку существущему массиву
    }
}
public class GenArrays {
    public static void main(String[] args) {
        Integer n[] = { 1, 2, 3, 4, 5};

        Gen4<Integer> iOb = new Gen4<>(50,n);

        // Нельзя создать массив специфических для типа обобщения ссылок
        // Gen<Integer> gens[] = new Gen<Integer>[10]; // Неверно
        Gen<?> gens[] = new Gen<?>[10]; // А это верно
    }
}
