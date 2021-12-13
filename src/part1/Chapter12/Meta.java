package part1.Chapter12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// Объявление типа аннтоации
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();
    int val();
}
public class Meta {
    @MyAnno(str = "Пример аннотации", val = 100)
    public static void myMeth() {
        Meta ob = new Meta();

        // получить аннотацию из метода и вывести знеачения ее членов
        try {
            // сначала получить объект типа Class, предоставляющий данный класс
            Class<?> c = ob.getClass();

            //затем получить объект типа Method, представляющий данный метод
            Method m = c.getMethod("myMeth");

            // далее получить аннотацию для данного класса
            MyAnno anno = m.getAnnotation(MyAnno.class);

            // и наконец, вывести значения членов аннотации
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException e) {
            System.out.println("Метод не найден");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
