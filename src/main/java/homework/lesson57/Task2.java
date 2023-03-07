package homework.lesson57;

public class Task2 {

    public static void main(String[] args) {
        String wordWithMaxLength = "";
         try {
             if (args[0] == null) {
                 throw new RuntimeException(new ArrayIndexOutOfBoundsException());
             }
            for (String a :
                    args) {
                if (!a.matches("^[a-zA-Z0-9]+$")) {
                    System.out.println("\n" +"Можно вводить только Латинские буквы");
                    System.exit(1);
                } else {
                    if (a.length() == wordWithMaxLength.length()) {
                        System.out.print(a + " ");
                    }
                    wordWithMaxLength = a.length() > wordWithMaxLength.length() ? a : wordWithMaxLength;
                }
            }
            System.out.print(wordWithMaxLength);
        } catch (ArrayIndexOutOfBoundsException e) {
             System.out.println("Введите строку");
         }
    }
}
