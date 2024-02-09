package basics.ObjectOriented;

 class B{
    int a ;
    int b;
    static int c;

    // gets loaded whenever class is loaded
    static {
        System.out.println("in static");
        c=0;
    }
    {
        System.out.println("initializer");
        a=1;
        b=2;
    }
}

public class ques {
    public static void main(String[]args){
//        class will be loaded in memory when its instance is created

//        B b1=new B();
//        B b2=new B();

        // To load a class without instance

        try {
            Class.forName("B");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
