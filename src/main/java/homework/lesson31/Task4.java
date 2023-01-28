package homework.lesson31;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        System.out.println("Введите данные");
        int p = scanner.nextInt();
        double r = scanner.nextInt();
        int t = scanner.nextInt();
        Task4.incomeMoney(p, r, t);
    }

    public static void incomeMoney(int p, double r, int t) {
        double tempP = p;
        double percents;
        for (int i = 0; i < t; i++) {
            percents = tempP * r / 100;
            tempP += percents;
        }
        System.out.println(tempP);
    }
}
