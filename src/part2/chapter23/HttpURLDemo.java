package part2.chapter23;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Anatoly Tsybulya
 */

// Применение класса HttpURLConnection
public class HttpURLDemo {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://google.com");
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

        // вывести метод запроса
        System.out.println("Метод запроса: " + urlConnection.getRequestMethod());

        // вывести код ответа
        System.out.println("Код ответа: " + urlConnection.getResponseCode());

        // вывести ответное сообщение
        System.out.println("Ответное сообщение: " + urlConnection.getResponseMessage());

        // получить список полей и множество ключей из заголовка
        Map<String, List<String>> hdrMap = urlConnection.getHeaderFields();
        Set<String> hdrFields = hdrMap.keySet();
        System.out.println("\nДалее следует заголовок:");

        // вывести все ключи и значения из заголовка
        for(String k : hdrFields) {
            System.out.println("Ключ: " + k + " Значение: " + hdrMap.get(k));
        }
    }
}
