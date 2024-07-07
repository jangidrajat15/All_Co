import java.util.ArrayList;

public class Try_Code {
    static int a=10;
    int b=20;
    public static void main(String[] args) {
        // System.out.println("a= " + a +" b= " + b);
        ArrayList<Integer> A=new ArrayList<>(); 
        A.add(1);
        A.add(2);
        A.add(3);
        //Lambda Expression
        A.forEach((n) -> {System.out.println(n);});

        // numbers.forEach( (n) -> { System.out.println(n); } );

    }

}