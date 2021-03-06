package part2.chapter23;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

/**
 * @author Anatoly Tsybulya
 */

// Применение класса URLConnection
public class UCDemo {
    public static void main(String[] args) throws Exception {
        int c;
        URL hp = new URL("http://www.internic.net");
        URLConnection urlConnection = hp.openConnection();

        // получить дату
        long d = urlConnection.getDate();
        if (d == 0) {
            System.out.println("Сведения о дате отсутствуют.");
        } else {
            System.out.println("Дата: " + new Date(d));
        }

        // получить тип содержимого
        System.out.println("Тип содержимого: " + urlConnection.getContentType());

        // получить дату срока действия ресурса
        d = urlConnection.getExpiration();
        if (d == 0) {
            System.out.println("Сведения о сроке действия отсутствуют");
        } else  {
            System.out.println("Срок действия истекает: " + new Date(d));
        }

        // получить дату последней модификации
        d = urlConnection.getLastModified();
        if (d == 0) {
            System.out.println("Сведения о дате последней модификации действия отсутствуют");
        } else {
            System.out.println("Дата последней модификации: " + new Date(d));
        }

        // получить длину содержимого
        long len = urlConnection.getContentLengthLong();
        if (len == -1) {
            System.out.println("Длина содержимого недоступна");
        } else {
            System.out.println("Длина содержимого: " + len);
        }

        if (len != 0) {
            System.out.println("=== Содержимое ===");
            InputStream input = urlConnection.getInputStream();
            while (((c = input.read()) != -1)) {
                System.out.print((char) c);
            }
            input.close();
        } else {
            System.out.println("Содержимое недоступно");
        }
    }
}
