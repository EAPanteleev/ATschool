package homework.lesson54;

public class Task1 {
    static String str = "Циклом называется многократное выполнение одних и тех же действий.";

    public static void main(String[] args) {

        System.out.println(str.replaceAll("\\s","").indexOf(args[0]));
    }
}
