// Errors are of three type in java
// 1. Syntax errors
// 2. Logical errors
// 3. RunTime errors


package Level_08;

import java.util.Scanner;

public class Code_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //1. Syntax error 
        // System.out.println("Hallo ")

        //2. Logical error
        // int x=0;  // This is logical error (i.e. we have to start x with 1 ) 
        // System.out.print("Enter N: ");
        // int N= sc.nextInt();
        // for(int i=1;i<N;i++){
        //     x*=i;
        // }
        // System.out.println(N + "! = " + x);
        
        // //3. Runtime error also know as Exceptions.
        // int y;
        // System.out.print("Enter x: ");
        // y=sc.nextInt();
        // System.out.println("Integer part of 1000 divided by y is " + 1000/y);
        

        //Try and Catch block
        System.out.print("Enter num1: ");
        
        try{
            int num1=sc.nextInt();
            System.out.println("Integer part of 1000 divided by "+num1 +" gives "+ 1000/num1);
            int num2=sc.nextInt();
            System.out.println("Integer part of 1000 divided by "+num2 +" gives "+ 1000/num2);

        }
        catch(Exception e){
            System.out.println("Not vaild num1.");
            System.out.println("Error is: " + e);
        }
        System.out.println("End of the code.");
        
        sc.close();
    }
}
