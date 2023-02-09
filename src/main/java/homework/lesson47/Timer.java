package homework.lesson47;

public class Timer {
    Integer second;

    static void waitSecond() throws InterruptedException {
       Thread.sleep(1000);
    }

    void printTime(int s) {
        int min = s / 60 % 60;
                int sec = s % 60;
        System.out.printf("%02d:%02d%n", min, sec);
    }

    void start() throws InterruptedException{
        for (int i = second; i >= 0; i--) {
            printTime(i);
            waitSecond();
            second--;
        }
    }

    public Timer(Integer second) {
        this.second = second;
    }
}
