//Program to find Area of triangle with given height and base.

package Java_Class_All.Lab_02;

import java.util.Scanner;

public class Program_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter height and base of the triangle : ");
        int h=sc.nextInt();
        int b=sc.nextInt();
        float ans=(b*h)/2;
        System.out.printf("Area of the given triangle with height: %d and base: %d is %f",h,b,ans);
    }
}
