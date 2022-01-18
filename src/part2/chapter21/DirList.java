package part2.chapter21;

import java.io.File;
import java.util.Arrays;

/**
 * @author Anatoly Tsybulya
 */
// Использовать каталоги
public class DirList {
    public static void main(String[] args) {
        String dirName = "C:\\test\\";
        File file = new File(dirName);

        if (file.isDirectory()) {
            System.out.println("Каталог " + dirName);
            String s[] = file.list();

            for (int i = 0; i < s.length; i++) {
                File file1 = new File(dirName + "\\" + s[i]);
                if (file1.isDirectory()) {
                    System.out.println(s[i] + " является каталогом");
                } else {
                    System.out.println(s[i] + " не является каталогом");
                }
            }
        } else {
            System.out.println(dirName + " не является каталогом");
        }
    }
}
