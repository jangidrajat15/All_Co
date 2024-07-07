//Program to calculate the percentage of the given subjects.

package Java_Class_All;

import java.util.Scanner;
// import java.math.*;

public class Program_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your first subject marks : ");
        float S1=sc.nextFloat();
        System.out.print("Enter your second subject marks : ");
        float S2=sc.nextFloat();
        System.out.print("Enter your Third subject marks : ");
        float S3=sc.nextFloat();
        float ans=(S1+S2+S3)/3;
        // double P=Math.pow(S1,3);
        // System.out.println(Math.pow(S1, 2));
        System.out.println("Your percentage is "+ ans);
        sc.close();
    }
}
