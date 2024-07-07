import java.util.ArrayDeque;

public class ArrayDeque_01 {
    public static void main(String[] args) {
        ArrayDeque<Integer> D1=new ArrayDeque<>();

        D1.add(1);
        D1.add(2);
        D1.add(3);
        D1.addFirst(5);
        D1.addLast(10);
        
        D1.remove(3);       //we can remove any element this way.
        D1.removeLast();    //This will remove the last element form arraydeque.

        for(int ele:D1){
            System.out.print(ele + " ");
        }
        System.out.println(D1.getFirst());
        System.out.println(D1.getLast());
    }
}
