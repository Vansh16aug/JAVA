package basics.ObjectOriented;

class Student{
    int rollNo;
    String name;
    double marks;

    Student(){
        System.out.println("Default constructor");
        rollNo=1;
        name="ABC";
        marks =100;
    }

    Student(int x, String y , double z){
        System.out.println("Parameterized Constructor");
        rollNo=x;
        name=y;
        marks=z;
    }
}
public class constructors {
    public static void main(String[] args){
        Student s1 = new Student();
        System.out.println(s1.rollNo);
        System.out.println(s1.marks);
        System.out.println(s1.name);

        Student s2 = new Student(2,"CDF",100);
        System.out.println(s2.rollNo);
        System.out.println(s2.marks);
        System.out.println(s2.name);
    }
}
