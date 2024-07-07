//Program to find square root of a number.

package Java_Class_All.Lab_02;

import java.util.Scanner;

public class Program_19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number N: ");
        double N=sc.nextFloat();
        double N2=Math.sqrt(N);
        System.out.println("Square root of the given number N=" + N + " is : "+ N2);
        sc.close();
    }
}
