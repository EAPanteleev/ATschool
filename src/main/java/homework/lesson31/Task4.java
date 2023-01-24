package homework.lesson31;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        int p = scanner.nextInt();
        int r = scanner.nextInt();
        int t = scanner.nextInt();
        Task4.incomeMoney(p, r, t);
    }

    public static void incomeMoney(int p, int r, int t) {
        int tempP = p;
        int percents;
        for (int i = 0; i < t; i++) {
            percents = tempP * r / 100;
            tempP += percents;
        }
        System.out.println(tempP);
    }
}
