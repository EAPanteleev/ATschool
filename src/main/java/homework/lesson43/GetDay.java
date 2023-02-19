package homework.lesson43;

import java.util.stream.Stream;

public class GetDay {
    public static void main(String[] args) {
        Stream.of(args).forEach(a -> getDays(Integer.parseInt(a)));
    }

    public static void getDays(int dayNumber) {

        if (dayNumber > 7 || dayNumber < 1) {
            System.out.println("Не подходит");
            return;
        }

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
                System.out.println("Воскресенье");
                break;
            default:
                break;
        }
    }
}
