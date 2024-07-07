package Java.Level_10;

import java.util.HashSet;

public class HashSet_01 {
    public static void main(String[] args) {
        HashSet<Integer> H1=new HashSet<>();   //Here initial capacity is 16 and loadfactor is 0.75.
        HashSet<Integer> H2=new HashSet<>(32);  // we can change the initial capacity this way.
        HashSet<Integer> H3=new HashSet<>(64,0.5f);
        
        H1.add(1);
        H1.add(4);
        H1.add(4);z

        H1.add(3);
        H1.add(3);

        // for(int ele:H1){
        //     System.out.print(ele + " ");
        // }
        System.out.println(H1);
    }
}
