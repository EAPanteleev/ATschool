package homework.lesson57;



import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] a = new int[20];
        fillArray(a);
    }

    static void fillArray(int[] a) {
        Random generator = new Random();
        Arrays.stream(a).forEach(value -> System.out.print(9 - generator.nextInt(19) + " "));
    }
}
