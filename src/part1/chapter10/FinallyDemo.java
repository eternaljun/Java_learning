package part1.chapter10;

// Продемонстрировать применение оператора finally
public class FinallyDemo {
    // сгенерировать исключение в методе
    static void procA() {
        try {
            System.out.println("В теле метода procA()");
            throw new RuntimeException("демонстрация");
        } finally {
            System.out.println("Блок оператора finally в методе procA()");
        }
    }
    // возвратить управление из блоков оператора try
    static void procB() {
        try {
            System.out.println("В теле метода procB()");
            return;
        } finally {
            System.out.println("Блок оператора finally  методе procB()");
        }
    }

    // выполнить блок try, как обычно
    static void procC() {
        try {
            System.out.println("В теле метода procC()");
        } finally {
            System.out.println("Блок оператора finally в методе procC()");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        } catch (RuntimeException e) {
            System.out.println("Исключение перехвачено");
        }
        procB();
        procC();
    }
}
