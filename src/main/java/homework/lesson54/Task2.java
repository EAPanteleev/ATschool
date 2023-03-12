package homework.lesson54;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Task2 {

    private static String lastSymbol = "\\";

    public static void main(String[] args) {
        String str = args[0];
        char[] strChar = str.toCharArray();
        boolean type = true;

        if (strChar[strChar.length-1] == '/' || strChar[strChar.length-1] == '\\') {
            System.out.println("Введен некорректный путь до файла.");
            System.exit(1);
        }

        if (str.contains("/")) {
            type = false;
            pathAndFile(str, type);
        }
        else pathAndFile(str, type);

    }

    public static void pathAndFile(String path, boolean type) {
        Path testFilePath = Paths.get(path);
        String pathName = testFilePath.getParent().toString();
        if (!type) {
            lastSymbol = "/";
            pathName = testFilePath.getParent().toString().replaceAll("\\\\","/");
        }

        System.out.println("Имя файла: " + testFilePath.getFileName());
        System.out.println("Путь: " + pathName +  lastSymbol);
    }
}
