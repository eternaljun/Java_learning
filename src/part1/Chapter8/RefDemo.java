package part1.Chapter8;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Box painbox = new Box();
        double vol;

        vol = weightbox.volume();
        System.out.println("Объем weightbox равен " + vol);
        System.out.println("Вес weightbox равен " + weightbox.weight);
        System.out.println();

        // присвоить перменной ссылки на объект типа BoxWeight ссылку на объект типа Box
        painbox = weightbox;
        vol = painbox.volume(); // Верно, так как метод volume() определен в классе Box
        System.out.println("Объем painbox равен " + vol);

        // Следующий оператор ошибочен, поскольку член painbox не определяет член weight
//        System.out.println("Вес painbox равен " + painbox.weight);
    }
}
