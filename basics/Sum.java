import java.util.*;
public class Sum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first integer");        
        int a=sc.nextInt();
        System.out.println("Enter the second integer");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println(sum);
        sc.close();
    }
}
