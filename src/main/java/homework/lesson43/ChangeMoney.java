package homework.lesson43;

import java.util.Arrays;

public class ChangeMoney {
    public static void main(String[] args) {
        change(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]));

    }

    public static void change(Integer a, Integer b, Integer c, Integer d) {

        int[] money = new int[]{a, b, c, d};

        if (Arrays.stream(money).anyMatch(x -> x < 0)) {
            System.out.println("Ошибка в входных данных");
            return;
        } else if (a + b / 100 > c + d / 100) {
            System.out.println("Не хватает денег");
            return;
        }
        int e = c - a;
        int f = d - b;
        if (f < 0) {
            e--;
            f = 100 + f;
        }
        System.out.println("Ваша сдача " + e + " рублей " + f + " копеек");

    }
}
