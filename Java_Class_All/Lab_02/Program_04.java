//Program to find Product of given two numbers.

package Lab_02;

import java.util.Scanner;

public class Program_04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1=sc.nextInt();
        System.out.print("Enter num2: ");
        int num2=sc.nextInt();
        int ans=num1*num2;
        System.out.printf("Product of %d and %d is %d",num1,num2,ans);   
        sc.close();     
    }
}
