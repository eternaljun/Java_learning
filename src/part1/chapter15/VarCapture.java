package part1.chapter15;

// Пример захвата локальной переменной из объемлющей области видимости

interface MyFunc {
    int func(int n);
}

public class VarCapture {
    public static void main(String[] args) {
        // Локальная переменная, которая может быть захвачена
        int num = 10;

        MyFunc MyLambda = (n) -> {
            // Такое применение переменной num не допустимо, поскольку она не видоизменится
            int v = num + n;
            // но следующая строка кода недопустима, поскольку в ней предпринимается попытка видоизменить значение
            // переменной num
            // num++;
            return v;
        };
        // И следующая строка кода приведет к ошибке, поскольку в ней нарушается действительно конечно состояние переменной num
        // num = 9;
    }
}
