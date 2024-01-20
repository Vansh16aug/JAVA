package basics.AccessSpecifiers.package1;

public class C1 {
    private int privateC1=1;
    public int publicC1=2;
    protected int protectedC1=3;
    int defaultC1=4;

    public void printValues(){
        System.out.println(protectedC1);
        System.out.println(publicC1);
        System.out.println(defaultC1);
        System.out.println(privateC1);
    }

}
