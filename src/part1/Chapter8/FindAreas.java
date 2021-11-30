package part1.Chapter8;

// Применение динамического полиморфизма
abstract class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }
    abstract double area();
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a,b);
    }

    // переопределить метод area() для четырехугольника
    double area() {
        System.out.println("В области четырехугольника");
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle (double a, double b) {
        super(a,b);
    }

    // переопределить метод area() для прямоугльного треугольника
    double area(){
        System.out.println("В области треугольника");
        return dim1 * dim2 / 2;
    }
}
public class FindAreas {
    public static void main(String[] args) {
       // Figure f = new Figure(10,10);
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,8);
        Figure figref; // верно, хотя объект не создается

        figref = r;
        System.out.println("Площадь равна " + figref.area());
        figref = t;
        System.out.println("Площадь равна " + figref.area());
//        figref = f;
//        System.out.println("Площадь равна " + figref.area());
    }
}
