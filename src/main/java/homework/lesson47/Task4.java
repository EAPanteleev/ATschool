package homework.lesson47;

public class Task4 {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        for (int i = 0; i < 100; i++) {
            int result;
            do {
                result = nextInt(n);
            } while (!isPrime(result) || result == 0);
            System.out.println(result);
        }
    }

    public static boolean isPrime(int x) {
        int temp;
        boolean isPrime = true;
        for (int i = 2; i <= x / 2; i++) {
            temp = x % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static int nextInt(int x) {

        return (int) (Math.random() * ++x);
    }
}
