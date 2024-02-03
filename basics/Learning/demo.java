package basics.Learning;

class Student {
    int rollNo; // Fix typo: "Int" to "int", "rot tho" to "rollNo"
    String name;
    double marks;
}
public class demo {
    public static void main(String[] args) {
        Student a;
        a = new Student();
        System.out.println(a);
        System.out.println(a.marks);
        System.out.println(a.name);
        System.out.println(a.rollNo);
    }
}
