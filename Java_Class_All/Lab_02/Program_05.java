//Program to divide given two number.

package Lab_02;

import java.util.Scanner;

public class Program_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer num1: ");
        int num1=sc.nextInt();
        System.out.print("Enter your second integer num2 :");
        int  num2=sc.nextInt();
        System.out.printf("Dividing %d by %d we get %d ",num1,num2,(num1/num2));
        sc.close();
    }
}
