package part1.chapter7;

import javax.swing.*;

// Конструкторы ккласса бокс определяются тремя разными способами
public class BoxOverload {
    double width;
    double height;
    double depth;

    // конструктор, используемый, когда указываются все размеры
    BoxOverload(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор, используемый, когда ни один из размеров не указан
    BoxOverload() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // конструктор, используемый при создании куба
    BoxOverload(double len) {
        width = height = depth = len;
    }

    // рассчитать и возвратить объем
    double volume() {
        return width * depth * height;
    }
}

class OverloadCons {
    public static void main(String[] args) {
        // создать параллелепипеды, используя разные конструкторы
        BoxOverload mybox1 = new BoxOverload(10, 20, 15);
        BoxOverload mybox2 = new BoxOverload();
        BoxOverload mybox3 = new BoxOverload(7);

        double vol;

        // получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Объем первого параллелепипеда равен " + vol);

        // получить объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем второго параллелепипеда равен " + vol);

        // получить объем третьего параллелепипеда
        vol = mybox3.volume();
        System.out.println("Объем третьего параллелепипеда равен " + vol);
    }
}