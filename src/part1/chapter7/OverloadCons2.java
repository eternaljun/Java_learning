package part1.chapter7;

// Конструкторы ккласса бокс определяются тремя разными способами
class BoxOverload2 {
    double width;
    double height;
    double depth;

    // конструктор, использует объект типа BoxOverload2
    BoxOverload2( BoxOverload2 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    // конструктор, используемый, когда указываются все размеры
    BoxOverload2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор, используемый, когда ни один из размеров не указан
    BoxOverload2() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // конструктор, используемый при создании куба
    BoxOverload2(double len) {
        width = height = depth = len;
    }

    // рассчитать и возвратить объем
    double volume() {
        return width * depth * height;
    }
}

class OverloadCons2 {
    public static void main(String[] args) {
        // создать параллелепипеды, используя разные конструкторы
        BoxOverload2 mybox1 = new BoxOverload2(10, 20, 15);
        BoxOverload2 mybox2 = new BoxOverload2();
        BoxOverload2 mybox3 = new BoxOverload2(7);

        BoxOverload2 myclone = new BoxOverload2(mybox1);

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

        // получить объем клона
        vol = myclone.volume();
        System.out.println("Объем клона равен " + vol);
    }
}