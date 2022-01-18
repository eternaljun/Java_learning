package part2.chapter23;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author Anatoly Tsybulya
 */

// Оперирование сокетами
public class Whois {
    public static void main(String[] args) throws Exception {
        int c;

        // создать сокетное соединенрие с веб-сайтом internic.net через порт 43
        Socket socket = new Socket("whois.internic.net", 43);

        // получить потоки ввода-вывода
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();

        // сформировать строку запроса
        String str = (args.length == 0 ? "OraclePressBooks.com" : args[0]) + "\n";

        // проеобразовать строку запроса в байты
        byte buf[] = str.getBytes();

        // послать запрос
        outputStream.write(buf);

        // прочитать ответ и вывести его на экран
    while ((c = inputStream.read()) != -1) {
        System.out.print((char) c);
    }
    socket.close();
    }
}
