package part1.chapter7;

// Применение аргументов переменной длины
public class VarArgs {
    static void vaTest(int ... v) {
        System.out.print("Количество аргументов: " + v.length + " Содержимое: ");
        for(int x:v){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(10);         // 1 аргумент
        vaTest(1, 2, 3);    // 3 аргумента
        vaTest();               // без аргументов
    }
}
