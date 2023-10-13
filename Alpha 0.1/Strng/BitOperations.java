public class BitOperations {
    public static void CheckBit(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;

        }
        System.out.println(count);

    }

    public static int FastExpo(int n, int pow) {
        int ans = 1;
        while (pow > 0) {
            if ((pow & 1) != 0) {
                ans = ans * n;
            }
            n = n * n;
            pow = pow >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(FastExpo(5, 3));
    }
}
