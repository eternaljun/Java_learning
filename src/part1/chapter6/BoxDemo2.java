package part1.chapter6;

public class BoxDemo2 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        // присвоить значения переменным экземпляра mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        // присвоить другие значения переменным экземляра mybox2
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // рассчитать объем первого параллелепипеда
        vol = mybox1.width * mybox1.depth * mybox1.depth;
        System.out.println("Объем равен " + vol);

        // рассчитать объем второго параллелепипеда
        vol = mybox2.width * mybox2.depth * mybox2.depth;
        System.out.println(vol);
    }
}
