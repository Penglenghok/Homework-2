package lesson4;

public class Prob1 {
    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }
    private static double power(double x, int n){
        if (n > 1){
            x += x;
            return power(x, n - 1);
        }
        return x;
    }
}
