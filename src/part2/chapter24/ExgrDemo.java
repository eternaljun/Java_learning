package part2.chapter24;

import java.util.concurrent.Exchanger;

/**
 * @author Anatoly Tsybulya
 */

// Применение класса Exchanger
public class ExgrDemo {
    public static void main(String[] args) {
        Exchanger<String> exgr = new Exchanger<>();

        new Thread(new UseString(exgr)).start();
        new Thread(new MakeString(exgr)).start();
    }
}

// Поток типа Thread, формирующий символьную строку
class MakeString implements Runnable {
    Exchanger<String> ex;
    String str;

    public MakeString(Exchanger<String> ex) {
        this.ex = ex;
        this.str = "";
    }

    @Override
    public void run() {
        char ch = 'A';

        for (int i = 0; i < 3; i++) {
            // заполнить буфер
            for (int j = 0; j < 5; j++) {
                str += (char) ch++;
            }
            try {
                // обменять заполненный буфер на пустой
                str = ex.exchange(str);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Поток типа Thread, использующий символьную строку
class UseString implements Runnable {
    Exchanger<String> ex;
    String str;

    public UseString(Exchanger<String> ex) {
        this.ex = ex;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                // обменять пустой буфер на заполненный
                str = ex.exchange("");
                System.out.println("Получено: " + str);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
