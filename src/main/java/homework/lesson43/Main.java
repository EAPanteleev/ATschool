package homework.lesson43;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        maxNumber(args);
        Stream.of(args).forEach(a -> getDay(Integer.parseInt(a)));
        leapYear(Integer.parseInt(args[0]));
        triangle(args);
        change(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]));

    }

    public static void maxNumber(String[] x) {
        System.out.println(Stream.of(x).max(Comparator.naturalOrder()).get());

    }

    public static void getDay(int dayNumber) {

        switch (dayNumber) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенья");
                break;
            default:
                break;
        }
    }

    public static void leapYear(Integer year) {

        if (java.time.Year.of(year).isLeap()) {
            System.out.println("Высокосный");
        } else System.out.println("Не высокосный");
    }

    public static void triangle(String[] x) {

        Integer max = Integer.parseInt(Stream.of(x).max(Comparator.naturalOrder()).get());
        List<String> list = Stream.of(x).filter(y -> !y.equals(max)).collect(Collectors.toList());
        Integer SideOne = Integer.parseInt(list.get(1));
        Integer SideTwo = Integer.parseInt(list.get(1));
        if (max + SideOne >= SideTwo) {
            if (SideOne + SideTwo >= max)
                if (max + SideTwo >= SideOne)
                    System.out.println("Треугольник существует.");
        } else {
            System.out.println("impossible");
            return;
        }

        if (max * max == SideOne * SideOne + SideTwo * SideTwo) {
            System.out.println("right");
        } else if (max * max > SideOne * SideOne + SideTwo * SideTwo) {
            System.out.println("obtuse");
        } else System.out.println("acute");
    }

    public static void change(Integer a, Integer b, Integer c, Integer d) {

        int[] money = new int[]{a, b, c, d};

        if (Arrays.stream(money).anyMatch(x -> x < 0)) {
            System.out.println("Ошибка в входных данных");
            return;
        } else if (a + b / 100 >= c + d / 100) {
            System.out.println("Не хватает денег");
            return;
        }
        int e = c - a;
        int f = d - b;
        System.out.println("Ваша сдача " + e + " рублей " + f + " копеек");

    }
}
