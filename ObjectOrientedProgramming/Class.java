package ObjectOrientedProgramming;

public class Class {
    public static class Student{
        String name;
        int rno;
        double percent;
    }
    public static void main(String[] args){
        Student s =new Student();
        s.name="Vansh";
        s.rno=1;
        s.percent=90.0;
        System.out.println(s.name);
        System.out.println(s.rno);
        System.out.println(s.percent+8);
    }
}
