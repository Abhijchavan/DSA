import java.util.*;

class Table {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Which You Want Number Of Table ");
        int Number = sc.nextInt();
        int Counter;
        for (int i = 2; i <= 10; i++) {
            Counter = i * Number;
            System.out.println(Counter);
        }

    }
}