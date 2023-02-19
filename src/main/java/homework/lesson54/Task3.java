package homework.lesson54;

public class Task3 {
    public static void main(String[] args) {
        String str = args[0];
        StringBuilder sb = new StringBuilder(str);
        char[] strChar = str.toCharArray();

        for (int i = 0; i < strChar.length; i++) {
            switch (strChar[i]) {
                case '0':
                    sb.replace(i, i + 1, "1");
                    break;
                case '1':
                    sb.replace(i, i + 1, "0");
                    break;
                default:
                    break;
            }
        }

        System.out.println(sb);
    }
}
