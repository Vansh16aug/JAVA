package basics.ObjectOriented;

class Animal{
    String type;
    Animal(String type){
        this.type = type;
        System.out.println("Parent Constructor");
    }
}

class Dog extends Animal{
    String breed;
    Dog(String type,String breed){
        super(type);
        this.breed = breed;
        System.out.println("Child Constructor");
    }
}
public class super_class {
    public static void main(String[] args) {
        Dog myDog = new Dog("Canine","Lab");
    }
}