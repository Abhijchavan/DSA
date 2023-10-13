// import java.util.*;

// public class Prime {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number ");
//         int n = sc.nextInt();
//         int counter = 0;
//         // if (n == 2) {
//         // System.out.println("N is prime Number");
//         // } else {
//         // boolean isprime = true;
//         // for (int i = 2; i <= n - 2; i++) {
//         // if (n % i == 0) {
//         // isprime = false;
//         // }

//         // }
//         // if (isprime == true) {
//         // System.out.println("N is prime number");
//         // } else {
//         // System.out.println("N is not prime number");
//         // }
//         // }
//         // }
//         for (int i = 1; i <= n; i++) {
//             if (n % i == 0) {
//                 counter++;
//             }
//         }
//         if (counter == 2) {
//             System.out.println("Prime");
//         } else {
//             System.out.println("Not prime");
//         }

//     }
// }
import java.util.Scanner;

class Prime {
    public static boolean isprime(int n) {
        boolean isprime = true;
        if (n == 2) {
            System.out.println("Prime Number");
        }
        for (int i = 2; i < n - 2; i++) {

            if (n % i == 0) {
                isprime = false;
            }
        }
        return true;

    }

    public static boolean primerange(int n) {
        for (int i = 2; i <= n - 1; i++) {
            if (isprime(i)) {
                System.out.println(i + "");
            }
        }
        System.out.println();
        return false;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
    }
}
