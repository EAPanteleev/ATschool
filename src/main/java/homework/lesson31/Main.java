package homework.lesson31;

public class Main {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
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
