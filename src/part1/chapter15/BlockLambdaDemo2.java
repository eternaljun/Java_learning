package part1.chapter15;

// Блочное выражение, изменяющее на обратный порядок следования символов в строке

interface StringFunc {
    String func(String n);
}

public class BlockLambdaDemo2 {
    public static void main(String[] args) {
        // Это блочное выражение изменяет на обратный порядок следования символов в строке
        StringFunc reverse = (str) -> {
            String result = "";


            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };
        System.out.println("Лямбда обращается на " + reverse.func("Лямбда"));
        System.out.println("Лямбда обращается на " + reverse.func("Выражение"));
    }
}
