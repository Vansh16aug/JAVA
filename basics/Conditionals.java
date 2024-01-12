package basics;
import java.util.*;
class Conditionals{
    public static void main(String args[]){
        
        //if else
        
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age > 18) {
            System.out.println("This is an adult");
        } 
        else {
            System.out.println("This is not an adult");
        }
        sc.close();

    }
}