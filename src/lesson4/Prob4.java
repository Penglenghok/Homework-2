package lesson4;

public class Prob4 {
    public static void main(String[] args) {
        int n = 121;
        System.out.println(isPalindrome(n));
    }

    public static boolean isPalindrome(int n) {
        if (n < 0) {
            return false;
        }
        return n == recursive(n, 0);
    }

    private static int recursive(int n, int k) {
        if (n == 0) {
            return k;
        }
        k = (k * 10) + (n % 10);
        return recursive(n / 10, k);
    }
}
