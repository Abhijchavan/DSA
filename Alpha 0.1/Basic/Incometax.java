import java.util.*;

class incometax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the your income source value ");
        int income = sc.nextInt();
        int tax;

        if (income < 50000) {

            tax = 0;
            System.out.println("There is " + tax + " tax is apply ");
        } else if (income > 50000 && income > 10000) {
            tax = (int) (income * 0.2);
            System.out.println("There is " + tax + " tax is apply");
        } else {
            tax = (int) (income * 0.3);
            System.out.println("There is " + tax + " tax is apply");
        }
    }
}