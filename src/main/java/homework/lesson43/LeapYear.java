package homework.lesson43;

public class LeapYear {
    public static void main(String[] args) {
        isLeapYear(Integer.parseInt(args[0]));
    }

    public static void isLeapYear(Integer year) {

        if (java.time.Year.of(year).isLeap()) {
            System.out.println("Высокосный");
        } else System.out.println("Не высокосный");
    }
}
