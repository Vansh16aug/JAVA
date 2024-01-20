package basics.AccessSpecifiers.package2;

import basics.AccessSpecifiers.package1.father;

class B extends father{
    public void xyz(){
        System.out.println(a);
    }
}
public class child2 {
    public static void main(String[]args){
        father obj1=new father();
        System.out.println(obj1.a);
    }
}
