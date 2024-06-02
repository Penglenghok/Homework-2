package lesson4;

public class Prob1 {
    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }
    public static double power(double x, int n){
        if(n == 1)
        {
            return x;
        }
        else
        {
            x *= power(x, n-1);
            return x;
        }
    }
}
