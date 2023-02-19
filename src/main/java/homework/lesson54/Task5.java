package homework.lesson54;

public class Task5 {
    final static String regex = "\\d+";

    public static boolean isInteger(String str) {
        return str.matches(regex);
    }

    public static void main(String[] args) {
        if (isInteger(args[0])) {
            System.out.println("Входная строка: " + args[0] + "\n" + "Вывод: Строка является целым числом");
        } else System.out.println("Входная строка:" + args[0] + "\n" + "Вывод: Строка не является целым числом");
    }
}
