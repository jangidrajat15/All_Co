package Java.Level_10;

import java.util.LinkedList;

public class LinkedList_01 {
    public static void main(String[] args) {
        LinkedList<Integer> L1=new LinkedList<>();
        LinkedList<Integer> L2=new LinkedList<>();  

        L2.add(100);
        L2.add(200);
        L2.add(300);
    
        L1.add(1);
        L1.add(3);
        L1.add(2);
        L1.add(3);
        
        L1.addAll(0, L2);

        for(int ele:L1){
            System.out.print(ele + " ");
        }
    }
}
