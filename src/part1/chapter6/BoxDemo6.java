package part1.chapter6;

// В данном примере программы для инициализации размеров параллелепипеда в классе Box применяется конструктор
class Box3 {
    double width;
    double height;
    double depth;

    // Это конструктор класса Box
    Box3() {
        System.out.println("Конструирование объекта Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    // рассчитать и возвратить объем параллелепипеда
    double volume() {
        return width * height * depth;
    }
}
public class BoxDemo6 {
    public static void main(String[] args) {
        // объявить, выделить память и инициализировать объекты типа Box
        Box3 mybox1 = new Box3();
        Box3 mybox2 = new Box3();
        double vol;

        // получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        // получить объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
}
