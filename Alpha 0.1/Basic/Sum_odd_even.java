import java.util.Scanner;

public class Sum_odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int choice;
        int odd = 0;
        int even = 0;
        do {
            System.out.println("Enter the Num : ");
            n = sc.nextInt();
            if (n % 2 == 0) {
                even = n + even;
            } else {
                odd = n + odd;
            }
            System.out.println("Do you want to continue then press 1 if not press 0 : ");
            choice = sc.nextInt();
        } while (choice == 1);
        {
            System.out.println("Sum of even Number is :" + even);
            System.out.println("Sum of Odd Number is :" + odd);
        }
    }
}
// import java.util.Scanner;
// public class Solution {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int number;
// int choice;
// int evenSum = 0;
// int oddSum = 0;
// do {
// System.out.print("Enter the number ");
// number = sc.nextInt();
// if( number % 2 == 0) {
// evenSum += number; } else {
// oddSum += number; }
// System.out.print("Do you want to continue? Press 1 for yes or 0 for
// no");
// choice = sc.nextInt();
// } while(choice==1);
// System.out.println("Sum of even numbers: " + evenSum);
// System.out.println("Sum of odd numbers: " + oddSum);
// } }