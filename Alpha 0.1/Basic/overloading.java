import java.util.Scanner;

class overloading {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static float sum(int a, float b) {
        return a + b;

    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(sum(5, 5));
        System.out.println(sum(5, 5, 5));
        System.out.println(sum(5, 5.1f));
    }
}
