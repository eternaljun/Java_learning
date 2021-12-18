package part1.chapter15;

// Применение ссылки на метод экземпляра
// Функциональный интерфейс для операций над символьными строками
//interface StringFunc2 {
//    String func(String n);
//}
// В этом классе определяется статический метод strReverse()
//class MyStringOps {
//    // статический метод, изменяющий порядок следования символов в строке
//    static String strReverse(String str) {
//        String result = "";
//
//        for (int i = str.length() - 1; i >=0 ; i--) {
//            result += str.charAt(i);
//        }
//        return result;
//    }
//}
public class MethodRefDemo2 {
    // В этом методе функциональный интерфейс указывается в качестве типа первого его параметра. Следовательно, ему
    // может быть передан любой экземпляр данного интерфейса, включая и ссылку на метод
    static String stringOp (StringFunc sf, String s) {
        return sf.func(s);
    }
    public static void main(String[] args) {
        String inStr = "Лямбда-выражения повышают эффективность Java";
        String outStr;

        // создать объект типа MyStringOps
        MyStringOps strOps = new MyStringOps();

        // А теперь ссылка на метод экземпляра strReverse() передается методу stringOp()
        outStr = stringOp(MyStringOps::strReverse, inStr);

        System.out.println("Исходная строка: " + inStr);
        System.out.println("Обращенная строка: " + outStr);
    }
}


