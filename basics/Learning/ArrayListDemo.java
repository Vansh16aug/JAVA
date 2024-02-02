package basics.Learning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        System.out.println(arr.size());

        //new way to iterate
        for(Integer i:arr){
            System.out.print(i+" ");
        }
        System.out.println();

        //in built features
        arr.set(2,7);

        //sorting
        Collections.sort(arr);

        //traditional way
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
    }
}
