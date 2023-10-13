import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Palindrome String : ");
        String Palindrome = sc.nextLine();
        int n = Palindrome.length();
        boolean isPalindrome = false;
        for (int i = 0; i < Palindrome.length() / 2; i++) {
            if (Palindrome.charAt(i) == Palindrome.charAt(n - 1 - i)) {
                isPalindrome = true;
                break;
            }
        }
        if (isPalindrome == true) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}
