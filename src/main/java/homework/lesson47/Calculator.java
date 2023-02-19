package homework.lesson47;

public class Calculator {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[2]);
        String sign = args[1];

        switch (sign) {
            case  ("+"):
                System.out.println(add(x,y));
                break;
            case ("-"):
                System.out.println(sub(x,y));
                break;
            case ("*"):
                System.out.println(mult(x,y));
                break;
            case ("/"):
                System.out.println(divide(x,y));
                break;
            default:
                System.out.println("Доступные операции + - * /");
                break;
        }
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int sub(int x, int y) {
        return x - y;
    }

    public static int mult(int x, int y) {
        return x * y;
    }

    public static int divide(int x, int y) {
        if (y == 0) {
            System.exit(0);
        }
        return x / y;
    }
}
