package part2.chapter18;

// Применение методов isInfinite() и isNaN()
public class InfNaN {
    public static void main(String[] args) {
        Double d1 = Double.valueOf(1/0.);
        Double d2 = Double.valueOf(0/0.);
        System.out.println(d1 + ": " + d1.isInfinite() + ", " + d1.isNaN());
        System.out.println(d2 + ": " + d2.isInfinite() + ", " + d2.isNaN());
    }
}
