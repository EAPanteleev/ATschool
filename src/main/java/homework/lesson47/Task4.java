package homework.lesson47;

import java.math.BigInteger;

public class Task4 {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int result;
            do {
                result = nextInt(n);
            } while (!isPrime(result) || result == 0);
            System.out.println(result);
    }

    public static boolean isPrime(int x) {
        BigInteger bigInteger = BigInteger.valueOf(x);
        return bigInteger.isProbablePrime((int) Math.log(x));
    }

    public static int nextInt(int x) {

        return (int) (Math.random() * ++x);
    }
}
