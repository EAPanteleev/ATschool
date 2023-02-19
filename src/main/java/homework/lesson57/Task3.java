package homework.lesson57;


import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[][] matrix = new int[(int)(Math.random() * 5)][];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = fillArray();
        }

        Arrays.stream(matrix).sorted((x1,x2) -> sum(x2) -sum(x1)).forEach( a -> System.out.println(Arrays.toString(a)));
    }

    static int[] fillArray() {
        int[] a = new int[(int)(Math.random() * 7)];

        for (int i = 0; i < a.length; i++) {
            a[i] = ((int)(Math.random() * 19) - 9);
        }
         return a;
    }

    static int sum(int[] a) {
        return Arrays.stream(a).sum();
    }
}
