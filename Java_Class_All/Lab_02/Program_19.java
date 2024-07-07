//Program to find square of a number.

package Java_Class_All.Lab_02;

import java.util.Scanner;

public class Program_19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number N: ");
        float N=sc.nextFloat();
        double N2=Math.pow(N,2);
        System.out.println("Square of the given number N=" + N + " is : "+ N2);
        sc.close();
    }
}
