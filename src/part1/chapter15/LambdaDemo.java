package part1.chapter15;

// Продемонстрировать применение простого лямбда-выражения

// функциональный интерфейс
interface MyNumber {
    double getValue();
}

public class LambdaDemo {
    public static void main(String[] args) {
        MyNumber myNum; // объявить ссылку на функциональный интерфейс
        // здесь лямбда выражение просто является константным выражение. Когда оно присваивается ссылочной переменной
        // myNum, получается экземпляр класса, в котором лямбда-выражение реализует метод getValue() из функционального
        // интерфейса MyNumber
        myNum = () -> 123.45;

        // вызвать метод getValue(), предоставляемый присвоенным ранее лямбда-выражением
        System.out.println("Фиксированное значение: " + myNum.getValue());

        // а здесь используется более сложное выражение
        myNum = () -> Math.random() * 100;

        // в следующих строках кода вызывается лямбда-выражение из предыдущей строки кода

        System.out.println("Случайное значение : " + myNum.getValue());
        System.out.println("Еще одно случайное значение : " + myNum.getValue());

        // лямбда=выражение должно быть совместимо по типу данных с абстрактным методом, определяемым в функциональном
        // интерфейсе. Поэтому следующая строка кода ошибочна
        // myNum = () -> "123.45" // Ошибка!
    }
}
