import java.util.Scanner;

public class Uppercase {
    public static String Upper(String str) {
        StringBuilder sc = new StringBuilder();
        char ch = Character.toUpperCase(str.charAt(0));
        sc.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sc.append(str.charAt(i));
                i++;
                sc.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sc.append(str.charAt(i));
            }

        }
        return sc.toString();
    }

    public static void main(String[] args) {
        String str = "hello, i'm abhijeet chavan";
        System.out.println(Upper(str));
    }
}
