package part1.chapter14;

// Класс NonGen - функциональный эквивалент класса Gen без обобщений
    class NonGen {
        Object ob; // объявить объект типа T

        // передать конструктору ссылку на объект типа T
        NonGen(Object o) {
            ob = o;
        }

        // возвратить объект ob
        Object getob() {
            return ob;
        }

        // показать тип T
        void showType() {
            System.out.println("Объект ob относится к типу " + ob.getClass().getName());
        }
    }

    // Продемонстрировать необощенный класс
    public class NonGenDemo  {
        public static void main(String[] args) {
            // создать ссылку типа Gen для целых чисел
            NonGen iOb;

            // Создать объект типа NonGen и сохранить в нем объект типа Integer. Выполняется автоупаковка
            iOb = new NonGen(88);

            // показать тип данных, хранящихся в переменной iOb
            iOb.showType();

            // получить значение переменной iOb.!Требуется приведение типов!
            int v = (Integer) iOb.getob();
            System.out.println("Значение: " + v);
            System.out.println();

            // создать другой объект типа NonGen и сохранить в нем объект типа String
            NonGen strOb = new NonGen("Текст сообщения");

            // показать тип данных, хранящийся в переменной strOb
            strOb.showType();

            // получить значение переменной strOb. И в этом случае приведение типов потребуется
            String str = (String) strOb.getob();
            System.out.println("Значение: " + str);

            // этот код компилируется, но он принципиально неверный!
            //iOb = strOb;
            //v = (Integer) iOb.getob(); // Ошибка во время выполнения!
        }


}
