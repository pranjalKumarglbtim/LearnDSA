import java.util.*;

public class Pow {
    public static double myPow(double x, long n) {
        if (n == 0)
            return 1;
        if (n < 0) {
            
            return 1 / myPow(x, -n);
        }
        double half=myPow(x,n/2);
        if(n%2==0){
            return half*half;
        }
        return half*half*x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        long n = sc.nextLong();
        double res = myPow(x, n);
        System.out.println(res);
    }
}
