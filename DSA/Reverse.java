import java.util.*;
public class Reverse {
    public static void reverseString(char[] s) {
         int len=s.length;
         int start=0;
         int end=s.length-1;
         while(start<end){
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
         }
          for(char p:s){
            System.out.print(p);
        }
         
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char m []=str.toCharArray();
        reverseString(m);
       
    }
}