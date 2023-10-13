import java.util.Scanner;

class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        int Palindrom = n;
        int reverse = 0;
        while (Palindrom != 0) {
            int rem = Palindrom % 10;
            reverse = reverse * 10 + rem;
            Palindrom = Palindrom / 10;
        }
        if (n == reverse) {
            System.out.println("Number is Palindrom ");
        } else {
            System.out.println("Number is not Palindrom ");
        }
    }
}