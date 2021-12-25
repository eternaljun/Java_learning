package part2.chapter18;

// Продемонстрировать применение метода clone()
class TestClone implements Cloneable {
    int a;
    double b;
    // В этом методе вызывается метод clone() из класса Object
    TestClone cloneTest() {
        try {
            // вызвать метод clone() из класса Object
            return (TestClone) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Клонирование невозможно");
            return this;
        }
    }
}
public class CloneDemo {
    public static void main(String[] args) {
        TestClone x1 = new TestClone();
        TestClone x2;
        x1.a = 10;
        x1.b = 20.98;
        x2 = x1.cloneTest();
        System.out.println("x1: " + x1.a + " " + x1.b);
        System.out.println("x2: " + x2.a + " " + x2.b);
    }
}
