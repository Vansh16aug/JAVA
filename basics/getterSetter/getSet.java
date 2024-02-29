package basics.getterSetter;

public class getSet {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }
    public static void main(String[] args) {
        getSet obj = new getSet();
        obj.setName("John");
        obj.setAge(25);
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
    }
}
