// import java.util.Scanner;

// public class Factorial {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num; // To hold number
//         int fact = 1; // To hold factorial
//         System.out.print("Enter any positive integer: ");
//         num = sc.nextInt();
//         for (int i = 1; i <= num; i++) {
//             fact *= i;
//         }
//         System.out.println("Factorial: " + fact);
//     }
// }
import java.util.Scanner;

class Factorial {
    public static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {

            f = f * i;
        }
        return f;
    }

    public static void main(String args[]) {
        int choice;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of N factorial");
            int n = sc.nextInt();
            fact(n);
            System.out.println(fact(n));

            System.out.println("Do you want to Continue Again,if yes press 1 otherwise press 0 : ");
            choice = sc.nextInt();
        } while (choice == 1);
    }
}