//Program to find differnce of given two numbers.

package Lab_02;

import java.util.Scanner;

public class Program_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number which is larger: ");
        int num1=sc.nextInt();
        System.out.print("Enter second number : ");
        int num2=sc.nextInt();
        int result=num1-num2;
        System.out.printf("Substracting %d from %d we get %d ",num2,num1,result);
        sc.close();
    }
}