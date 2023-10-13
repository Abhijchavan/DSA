import java.util.*;

public class LargestStrg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array size : ");
        int n = sc.nextInt();
        sc.nextLine();
        String Str[] = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the string " + (i + 1) + ":");
            Str[i] = sc.nextLine();

        }
        String largest = Str[0];
        for (int i = 1; i < n; i++) {
            if (Str[i].compareTo(largest) > 0) {
                largest = Str[i];
            }
        }
        System.out.println("The largest string is : " + largest);
        sc.close();
    }
}
