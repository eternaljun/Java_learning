package part1.chapter6;

class Box {
    double width;
    double height;
    double depth;

    // вывести объем параллелепипеда
    void volume(){
        System.out.print("Объем равен ");
        System.out.println(width * height * depth);
    }
}
// В этом классе объявляется объект класса Box
public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;

        // присвоить значение переменным экземляра mybox
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        // рассчитать объем параллелепипеда
        vol = mybox.width * mybox.height * mybox.depth;

        System.out.println("Объем равен " + vol);
    }
}
