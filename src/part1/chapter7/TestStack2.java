package part1.chapter7;

// Усовершенствованный класс Stack, в котором используется свойство длины массива
class Stack2 {
    private int[] stck;
    private int tos;

    // выделить память под стек и инициализировать его
    Stack2(int size) {
        stck = new int[size];
        tos = -1;
    }

    // разместить элемент в стеке
    void push(int item) {
        if (tos == stck.length-1) {
            System.out.println("Стек заполнен.");
        } else {
            stck[++tos] = item;
        }
    }

    // извлечь элемент из стека
    int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}

public class TestStack2 {
    public static void main(String[] args) {
        Stack2 mystack1 = new Stack2(5);
        Stack2 mystack2 = new Stack2(8);

        // разместить числа в стеке
        for (int i = 0; i < 5; i++) {
            mystack1.push(i);
        }
        for (int i = 0; i < 8; i++) {
            mystack2.push(i);
        }

        // извлечь эти числа из стека
        System.out.println("Стек в mystack1:");
        for (int i = 0; i < 5; i++) {
            System.out.println(mystack1.pop());
        }
        System.out.println("Стек в mystack2");

        for (int i = 0; i < 8; i++) {
            System.out.println(mystack2.pop());
        }

        // эти операторы не допустимы
        // mystack1.tos = -2;
        // mystack2.stck[3] = 100;

    }
}


