package homework.lesson47;


public class Task6 {
    public static void main(String[] args) throws InterruptedException {
        if (Integer.parseInt(args[0]) <= 0) {
            System.out.println("Не верное число");
            System.exit(0);
        }
        Timer timer = new Timer(Integer.parseInt(args[0]));
        timer.start();
    }
}
