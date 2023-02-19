package homework.lesson47;

public class Task2 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        if(n <= 0 || m <= 0) {
            System.out.println("Ошибка в данных");
            System.exit(1);
        }
        int time = m * 60;

        for (int i = 1; i < n; i++) {
            time = time + time + 10 ;
        }
        System.out.println("Бригада работала " +time/60 + " часов " + time % 60 + " минут" );
    }
}
