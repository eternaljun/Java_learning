package part2.chapter24;

import java.util.concurrent.*;

/**
 * @author Anatoly Tsybulya
 */

// Пример применения интерфейса Callable
public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);
        Future<Integer> f;
        Future<Double> f2;
        Future<Integer> f3;

        System.out.println("Запуск");

        f = es.submit(new Sum(10));
        f2 = es.submit(new Hypot(3, 4));
        f3 = es.submit(new Factorial1(5));

        try {
            System.out.println(f.get());
            System.out.println(f2.get());
            System.out.println(f3.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        es.shutdown();
        System.out.println("Завершение");
    }
}

// Три потока исполнения вычислений
class Sum implements Callable<Integer> {
    int stop;

    public Sum(int stop) {
        this.stop = stop;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= stop; i++) {
            sum += i;
        }
        return sum;
    }
}

class Hypot implements Callable<Double> {
    double side1, side2;

    public Hypot(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public Double call() throws Exception {
        return Math.sqrt((side1 * side1) + (side2 * side2));
    }
}

class Factorial1 implements Callable<Integer> {
    int stop;

    public Factorial1(int stop) {
        this.stop = stop;
    }

    @Override
    public Integer call() throws Exception {
        int fact = 1;
        for (int i = 2; i <= stop ; i++) {
            fact *= i;
        }
        return fact;
    }
}