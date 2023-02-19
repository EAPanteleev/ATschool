package homework.lesson54;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Task2 {
    public static void main(String[] args) {
        String str = args[0];
         str = str.replace("\\","/");
        char[] strChar = str.toCharArray();

        if (strChar[strChar.length-1] == '/') {
            System.out.println("Введен некорректный путь до файла.");
            System.exit(1);
        }
        pathAndFile(str);
    }

    public static void pathAndFile(String path) {
        Path testFilePath = Paths.get(path);
        System.out.println("Имя файла: " + testFilePath.getFileName());
        System.out.println("Путь: " + testFilePath.getParent());
    }
}
