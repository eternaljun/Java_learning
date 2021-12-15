package part1.chapter14;

// Применение метасимволов подстановки в качестве аргументов
class Stats2<T extends Number> {
    T[] nums; // массив класса Number или его подкласса

    // передать конструктору ссылку на массив элементов класса Number или его подкласса
    Stats2(T[] o) {
        nums = o;
    }

    // возвратить значение типа double в любом случае
    double average() {
        double sum = 0.0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return sum / nums.length;
    }

    // Определить равенство двух средних значений. Обратите внимание на применение метасимвола подстановки
    boolean sameAvg(Stats2<?> ob) {
        if (average() == ob.average()) {
            return true;
        }
        return false;
    }

}
// Применение метасимвола подстановки
public class WildcardDemo {
    public static void main(String[] args) {
        Integer inums[] = { 1, 2, 3, 4, 5};
        Stats2<Integer> iob = new Stats2<>(inums);
        double v = iob.average();
        System.out.println("Среднее значение iob равно " + v);

        Double dnums[] = { 1.1, 2.2, 3.3, 4.4, 5.5};
        Stats2<Double> dob = new Stats2<>(dnums);
        double w = dob.average();
        System.out.println("Среднее значение dob равно " + w);

        Float fnums[] = { 1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stats2<Float> fob = new Stats2<>(fnums);
        double x = fob.average();
        System.out.println("Среднее значение fob равно " + x);

        // выяснить, какие массивы имеют одинаковые средние значения
        System.out.println("Средние значения iob и dob");
        if (iob.sameAvg(dob)) {
            System.out.println("Равны");
        } else {
            System.out.println("Не равны");
        }
        System.out.println("Средние значения iob и fob");
        if (iob.sameAvg(fob)) {
            System.out.println("Равны");
        } else {
            System.out.println("Не равны");
        }
    }
}
