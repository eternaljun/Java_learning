package part1.chapter14;

// В этой версии класса Stats аргумент типа T должен быть классом Number или наследуемым от него классом
class Stats<T extends Number> {
    T[] nums; // это массив класс Number или его подкласса

    // передать конструктору ссылку на массив элементов класса Number или его подкласса
    Stats(T[] o) {
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
}

// Применение класса stats
public class BoundsDemo {
    public static void main(String[] args) {
        Integer inums[] = { 1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<>(inums);
        double v = iob.average();
        System.out.println("Среднее значение iob равно " + v);

        Double dnums[] = { 1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dob = new Stats<>(dnums);
        double w = dob.average();
        System.out.println("Среднее значение dob равно " + w);

        // Этот код не скомпилируется, так как класс String не является производным от класса Number
//        String strs[] = {"1", "2", "3", "4", "5"};
//        Stats<String> strob = new Stats<String>(strs);
//        double x = strob.average();
//        System.out.println("Среднее значение strob равно " + v);
    }
}
