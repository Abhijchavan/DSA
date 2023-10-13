import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of strings in the array
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Create an array to store the strings
        String[] strings = new String[n];

        // Input the strings
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string #" + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }

        // Compare and find the largest string
        String largestString = strings[0];
        for (int i = 1; i < n; i++) {
            if (strings[i].compareTo(largestString) > 0) {
                largestString = strings[i];
            }
        }

        // Display the largest string
        System.out.println("The largest string is: " + largestString);

        // Close the scanner
        scanner.close();
    }
}
