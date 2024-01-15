package basics;

import java.util.*;

public class multiplyTwoNum {
    public static int multiply(int a,int b){
         return a*b;
    }
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int ans=multiply(a,b);
        System.out.println(ans);
        sc.close();
    }
}
