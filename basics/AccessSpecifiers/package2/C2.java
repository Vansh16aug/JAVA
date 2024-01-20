package basics.AccessSpecifiers.package2;
import basics.AccessSpecifiers.package1.C1;
public class C2 extends C1 {
    public void method2(){
        System.out.println(protectedC1);
        System.out.println(publicC1);
//        System.out.println(defaultC1);
//        System.out.println(privateC1);
    }
}
