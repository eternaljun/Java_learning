package part2.chapter23;

/**
 * @author Anatoly Tsybulya
 */
public class test {

    public static int calculateSqrt(int input) {
        if (input == 0) {
            return 0;
        }
        int NOD = 1;
        for (int i = 1; i <= input / 2; i++) {
            if ((i * i) <= input) {
                NOD = i;
            } else {
                return NOD;
            }
        }
        return NOD;
    }

    public static void main(String[] args) {
        System.out.println(calculateSqrt(15));
    }
}
