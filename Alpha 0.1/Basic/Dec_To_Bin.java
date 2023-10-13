import java.util.Scanner;

public class Dec_To_Bin {
    public static int Dec_to_Bin(int n) {
        int val = n;
        int dec = 0;
        int pow = 0;
        while (n > 0) {
            int last = n % 2;
            dec = (dec + (last * (int) Math.pow(10, pow)));
            pow++;
            n = n / 2;
        }
        System.out.println("Binary Value of " + val + " is:" + dec);
        return dec;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Decimal  value : ");
        int n = sc.nextInt();
        Dec_to_Bin(n);

    }
}
