import java.util.*;
public class Trailing {
    public static int trailingZeroes(int n) {
        int flag=0;
        while(n>0){
              n/=5;
              flag+=n;

        }
        return flag;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int zeros=trailingZeroes(number);
        System.out.println(zeros);
    }
}