package part1.chapter3;

// Вычислить расстояние, проходимое светом
// используя перменные типа long
public class RayOfLight {
    public static void main(String[] args) {
        // Приблизительная скорость света, миль в секунуд
        int lightspeed = 186000;
        long days, seconds, distance;

        // указатель количества дней
        days = 1000;

        seconds = days * 24 * 60 * 60;
            // Преобразовать в секунды

        distance = lightspeed * seconds;
            // вычислить расстояние

        System.out.print("За " +days);
        System.out.print(" дней свет проходит около ");
        System.out.println(distance + " миль.");
    }
}
