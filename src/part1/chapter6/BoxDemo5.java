package part1.chapter6;

class Box2 {
    double width;
    double height;
    double depth;

    // рассчитать и возвратить объем параллелепипеда
    double volume() {
        return width * height * depth;

    }
     // установить размеры параллелепипеда
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}
public class BoxDemo5 {
    public static void main(String[] args) {
    Box2 mybox1 = new Box2();
    Box2 mybox2 = new Box2();
    double vol;

    // инициализировать каждый экземпляр класса Box
    mybox1.setDim(10, 20, 15);
    mybox2.setDim(3, 6, 9);

        // получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        // получить объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }

}
