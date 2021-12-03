public class test {
    public static void main(String[] args) {
        A a = new A();
        A b = new A();
        a.x = 10;
        System.out.println(b.x);
    }
}

class A {
    static int x;
}

