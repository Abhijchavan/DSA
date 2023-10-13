import java.util.Scanner;

class BinCoeff {
    public static int Fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int BinCoeff(int n, int r) {
        int fact_n = Fact(n);
        int fact_r = Fact(r);
        int ncr = Fact(n - r);
        int BinCoff = fact_n / fact_r * ncr;
        return BinCoff;

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n factorial");
        int n = sc.nextInt();
        System.out.println("Enter the value of r factorial");
        int r = sc.nextInt();
        System.out.println("Binomial Factorial:");
        System.out.println(BinCoeff(n, r));

    }
}
