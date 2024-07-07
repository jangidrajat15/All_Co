//Program to find the average of the given three number.

package Java_Class_All.Lab_02;

import java.util.Scanner;

public class Program_14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your first number : ");
        float S1=sc.nextFloat();
        System.out.print("Enter your second number : ");
        float S2=sc.nextFloat();
        System.out.print("Enter your Third number : ");
        float S3=sc.nextFloat();
        float ans=(S1+S2+S3)/3;
        System.out.println("Your Average is "+ ans);
        sc.close();
    }
}