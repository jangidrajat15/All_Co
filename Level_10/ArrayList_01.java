package Java.Level_10;

import java.util.ArrayList;

public class ArrayList_01 {
    public static void main(String[] args) {
        ArrayList<Integer> L1=new ArrayList<>();
        ArrayList<Integer> L2=new ArrayList<>();
        L2.add(10);
        L2.add(20);
        L2.add(30);

        L1.add(1);
        L1.add(3);
        L1.add(2);
        L1.add(3);
        L1.addAll(L2);   //this will append L2 in L1 and if we want to add to starting then give index as 0 i.e. L1.addAll(0,L2);

        System.out.println(L1.contains(3));   //Return ture if contains that element else return false.
        System.out.println(L1.indexOf(3));    //return first index where the element is present.
        System.out.println(L1.lastIndexOf(3));//return the last index where the given element is present.
        //this two return (-1) if the given element is not present in the ArrayList.

        L1.set(2,999);                        //we can set any element in arrayList.
        for(int i=0;i<L1.size();i++){
            System.out.print(L1.get(i)+ " ");
        }
    }
}
