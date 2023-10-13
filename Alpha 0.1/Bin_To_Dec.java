import java.util.Scanner;

class Bin_To_Dec {

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the Binary Value");
    // int bin = sc.nextInt();
    // int dec = 0;
    // int pow = 0;
    // while (bin > 0) {
    // int last = bin % 10;
    // dec = dec + (last * (int) Math.pow(2, pow));
    // pow++;
    // bin = bin / 10;

    // }
    // System.out.println("Decimal Number is :" + dec);

    // }
    // }
    // Function

    public static int Dec_To_Binary(int Bin) {
        int Val = Bin;
        int pow = 0;
        int Decimal = 0;
        while (Bin > 0) {
            int last = Bin % 10;
            Decimal = Decimal + (last * (int) Math.pow(2, pow));
            pow++;
            Bin = Bin / 10;

        }

        System.out.println("Binary Value of " + Val + " is " + Decimal);
        return Decimal;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of Binary number : ");

        int Bin = sc.nextInt();
        Dec_To_Binary(Bin);
    }
}