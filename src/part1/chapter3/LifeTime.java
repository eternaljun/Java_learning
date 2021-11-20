package part1.chapter3;

// Продемонстрировать срок действия переменной
public class LifeTime {
    public static void main(String[] args) {

        for (int x = 0; x < 3; x++) {
            int y = -1; // переменная y инициализируется при
                        // каждом вхождении в блок кода
            System.out.println("y равно: " + y);
                //здесь всегда выводится значение -1
            y = 100;
            System.out.println("y теперь равно: " + y);

        }
    }
}
