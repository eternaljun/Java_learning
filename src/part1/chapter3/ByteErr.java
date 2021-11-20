package part1.chapter3;

//Ошибка в вычислении значения переменной типа Byte
public class ByteErr {
    public static void main(String[] args) {
        byte b = 50;
        //b = b * 2; // ОШИБКА! Значение типа int не может быть
                     // присвоено переменной типа byte!
                     // (b продвигается к типу int)

        b *=  2; // ошибки не будет
        b = (byte) (b * 2); // ошибки также не будет
    }
}
