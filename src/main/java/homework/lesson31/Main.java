package homework.lesson31;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        Main.reverse(a, b);
        Main.reverseWithoutVariable(a, b);
        Main.divisionWithoutRemainder(a, b);
    }

    public static void reverse(int a, int b) {
        System.out.println("a =" + a + " " + "b=" + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("a =" + a + " " + "b=" + b);
    }

    public static void reverseWithoutVariable(int a, int b) {
        System.out.println("a =" + a + " " + "b=" + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a =" + a + " " + "b=" + b);
    }

    public static void divisionWithoutRemainder(int a, int b) {
        System.out.println(a % b == 0);
    }


}
