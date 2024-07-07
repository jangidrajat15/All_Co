package Level_09;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Exception_01 {
    public static void main(String[] args) {
        int[] arr=new int[3];
        arr[0]=10;
        arr[1]=100;
        arr[2]=1000;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array index: ");
        int idx=sc.nextInt();
        System.out.print("Enter the number you want to divide the value with : ");
        int num=sc.nextInt();
        try{
            System.out.println("The value at array index " + idx +" is : " + arr[idx]);
            System.out.println("The result array-value/given number= " +  (arr[idx]/num));
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception Occured!");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out of Bound Exception Occured! ");
        }
        catch(Exception e){
            System.out.println("Some other Exception: " + e);
        }
    }
}
