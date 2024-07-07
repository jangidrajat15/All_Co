package Java.Level_02;
import java.util.Scanner;

public class code_01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num1=sc.nextInt();
        sc.close();
        pop x= new pop();
        int ans=x.display(num1);
        System.out.println("Square: " + ans);
    }
}

class pop{
    public int display(int num1){
        return (num1*num1);
    }
}