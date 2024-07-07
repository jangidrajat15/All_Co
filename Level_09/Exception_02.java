package Level_09;

import java.util.Scanner;

public class Exception_02 {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        while(flag){
            System.out.print("Enter any index: ");
        int idx=sc.nextInt();
        try{
            // System.out.println("Hello...........");
            // System.out.println(arr[1]);
            try{
                System.out.println("Array element at index " +  idx + " is: " + arr[idx]);
                flag=false;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Index not found .");
                System.out.println("Exception at Level_02");
            }
        }catch(Exception e){
            System.out.println("Exceptio in Level_01");
        }
    }
    System.out.println("Thanks for using this Program.");
    }
}
