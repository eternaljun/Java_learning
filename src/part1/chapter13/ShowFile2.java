package part1.chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// В этой версии программы применяется try с ресурсами для автоматического закрытия файла
public class ShowFile2 {
    public static void main(String[] args) {
        int i;


        //сначала убедиться, что имя файла указано
        if (args.length != 1) {
            System.out.println("Использование: ShowFile имя_файла");
            return;
        }

        // ниже оператор try с ресурсами применяется сначала для открытия, а затем для автоматического закрытия файла
        try (FileInputStream fin = new FileInputStream(args[0])) {

            do {
                i = fin.read();
                if (i != 1) {
                    System.out.print((char) i);
                }
            } while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");

        } catch (IOException e2) {
            System.out.println("Ошибка ввода=вывода");
        }

    }
}
