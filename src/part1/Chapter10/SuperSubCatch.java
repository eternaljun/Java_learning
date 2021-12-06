package part1.Chapter10;

/* Эта программа содержит ошибку. В последовательности операторов catch подкласс исключений должен быть указан
перед его суперклассом, иначе это приведет к недостижимому коду и ошибке во время компиляции.
 */

public class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42 / a;
//        } catch (Exception e) {
            System.out.println("Перехват исключений общего класса Exception.");
        }
        /*
        Этот оператор catch вообще не будет достигнут, так как подкласс ArithmeticException является произовдным
        от класса Exception
         */
        catch (ArithmeticException e) {
            // ОШИБКА: недостежимый код!
            System.out.println("Этот код вообще недостижим.");
        }
    }
}
