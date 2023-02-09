package homework.lesson47;

public class Snake {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int col = Integer.parseInt(args[1]);
        int strNumber = n/col;
        int lastNumber = 0;
        int firstNumber = 1;

        for (int i = 1; i <= strNumber; i++){

            if (i %2 == 0) {
                firstNumber = firstNumber + col;
                for (int x = lastNumber; x > lastNumber - col ; x--) {
                    System.out.print(x + " ");
                    firstNumber++;
                }
            } else {
                lastNumber = lastNumber + col;
                for (int x = firstNumber; x < firstNumber + col; x++) {
                    System.out.print(x + " ");
                    lastNumber++;
                }
            }

            System.out.print("\n");
        }
    }


}
