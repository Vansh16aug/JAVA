package basics.Learning;

class Emp{
    int id;
    int salary;
    static String ceo;
    public void show(){
        System.out.println(id+" "+salary+" "+ceo);
    }
    public Emp(){
        id=1;
        salary=3000;
        System.out.println("object");
    }
    static {
        ceo="Vansh";
        System.out.println("In static");
    }
}
public class StaticDemo {
    static int i=1;     // static func can only access static data types .
    public  static void main(String[] args){
        System.out.println(i);
//        Emp rene=new Emp();  // heap space
//        rene.id=10;
//        rene.salary=1000000;
////        rene.ceo="Rene";
//
//        Emp vansh = new Emp();
//        vansh.id=11;
//        vansh.salary=100000000;
////        vansh.ceo="Vansh";
//        Emp.ceo="Vansh";


        //by using constructor
        Emp rene = new Emp();
        Emp vansh = new Emp();

        vansh.show();
        rene.show();

    }
}

//as the code runs all the classes get some space assigned ,
// if there are any static is defined space is also allocated to them and
// value is also assigned first .
// that's when other steps in main func is executed