package basics.Learning;
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

        //Switch

        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // switch(n) {
        // case 1 :
        //     System.out.println("Monday");
        //     break;
        // case 2 :
        //     System.out.println("Tuesday");
        //     break;
        // case 3 :
        //     System.out.println("Wednesday");
        //     break;
        // case 4 :
        //     System.out.println("Thursday");
        //     break;
        // case 5:
        //     System.out.println("Friday");
        //     break;
        // case 6 :
        //     System.out.println("Saturday");
        //     break;
        // default :
        //     System.out.println("Sunday");
        // }
        // sc.close();

    }
}