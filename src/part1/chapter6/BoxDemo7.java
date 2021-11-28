package part1.chapter6;

class Box4 {
    double width;
    double height;
    double depth;

    // Это конструктор класса Box
    Box4(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // рассчитать и возвратить объем параллелепипеда
    double volume() {
        return width * height * depth;
    }
}
public class BoxDemo7 {
    public static void main(String[] args) {
        // объявить, выделить память и инициализировать объекты типа Box
        Box4 mybox1 = new Box4(10, 20, 15);
        Box4 mybox2 = new Box4(3, 6, 9);
        double vol;

        // получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        // получить объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
}
