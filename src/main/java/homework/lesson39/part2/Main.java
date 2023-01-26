package homework.lesson39.part2;

public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        double x = 2.5;
        double y = 3.5;
        double z = 4.5;

        System.out.println(Summa.sum(a, b));
        System.out.println((int) Summa.sum(a, b, a));
        System.out.println(Summa.sum(x, y, z));
        System.out.println(Summa.sum(x, y));
        System.out.println(Summa.sum(a, x, y));
        System.out.println(Summa.sum((Integer) a, (Integer) b));
    }
}
