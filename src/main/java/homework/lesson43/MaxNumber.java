package homework.lesson43;

public class MaxNumber {
    public static void main(String[] args) {
        System.out.println(maxNumberRecuclc(args));
    }

    public static Integer maxNumberRecuclc(String[] x) {
        int max = Integer.parseInt(x[0]);
        for (int i = 1; i < x.length; i++) {
            if (Integer.parseInt(x[i]) > max) {
                max = Integer.parseInt(x[i]);
            }
        }
        return max;
    }
}
