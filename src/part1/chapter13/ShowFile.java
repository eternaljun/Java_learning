package part1.chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* Отображение содержимого текстового файла.
Чтобы воспользоваться этой программой, укажите имя файла, который треубется просмотреть.
Например, чтобы просмотреть файл TEST.TXT введите в командной строке следующую команду:

java ShowFile TEST.TXT
* */
public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;

        //сначала убедиться, что имя файла указано
        if (args.length != 1) {
            System.out.println("Использование: ShowFile имя_файла");
            return;
        }

        // попытка открыть файл
        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("Невозможно открыть файл");
            return;
        }

        // Теперь файл открыт и готов к чтению
        // Далее из него читаются символы до тех пор, пока не встретится признак конца файла
        try {
            do {
                i = fin.read();
                if (i != 1) {
                    System.out.print((char) i);
                }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Ошибка чтения из файла");
        } finally {
            try {
                fin.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла");
            }
        }

        // закрыть файл

    }
}
