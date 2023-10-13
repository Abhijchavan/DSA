import java.util.Arrays;
import java.util.Scanner;

class Anagrams {
    public static void main(String args[]) {
        String str1 = "Earth";
        String str2 = "Heart";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.length() == str2.length()) {
            char[] str1CharArray = str1.toCharArray();
            char[] str2CharArray = str1.toCharArray();
            Arrays.sort(str1CharArray);
            Arrays.sort(str2CharArray);
            boolean sorting = Arrays.equals(str1CharArray, str2CharArray);
            if (sorting) {
                System.out.println("String1 " + str1 + " and String2 " + str2 + " is Anagrams");
            } else {
                System.out.println("String1 " + str1 + " and String2 " + str2 + " is not Anagrams");
            }
        } else {
            System.out.println("String1 " + str1 + " and String2 " + str2 + " is not a Anagrams");
        }
    }
}