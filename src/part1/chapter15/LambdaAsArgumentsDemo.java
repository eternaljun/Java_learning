package part1.chapter15;

// Передать лямбда-выражение в качестве аргумента вызываемому методу

//interface StringFunc {
//    String func(String n);
//}

public class LambdaAsArgumentsDemo {
    // Первый параметр этого метода имеет тип функционального интерфейса. Следовательно, ему можно передать ссылку на
    // любой экземпляр этого интерфейса, включая экземпляр, создаваемый в лямбда-выражении. А второй параметр обозначает
    // обрабатываемую символьную строку
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда выражения повышают эффективность Java";
        String outStr;
        System.out.println("Это исходна строка: " + inStr);

        // Ниже приведено простое лямбда-выражение, преобразующее в прописные все буквы в исходной строке, передаваемой
        // методу stringOp()
        outStr = stringOp((str) -> str.toUpperCase(),inStr);
        System.out.println("Это строка прописными буквами: " + outStr);

        // А здесь передается блочное лямбда-выражение, удаляющее пробелы из исходной символьной строки
        outStr = stringOp((str) -> {
            String result = "";
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ') {
                    result += str.charAt(i);
                }
            }
            return result;
        }, inStr);
        System.out.println("Это строка с удаленными пробелами: " + outStr);

        // Можно конечно передать и экземпляр функционального интерфейса StringFunc, созданный в предыдущем
        // лямбда-выражении. Например, после следующего объявления ссылка интерфейса StringFunc
        StringFunc reverse = (str) -> {
            String result = "";
            for (int i = str.length() -1 ; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };
        // А теперь ссылку revers можно передать в качестве первого параметра методу stringOp(), поскольку она делается
        // на объект типа StringFunc
        System.out.println("Это обращенная строка: " + stringOp(reverse, inStr));
    }
}
