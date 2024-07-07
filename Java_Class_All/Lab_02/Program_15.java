//Program to convert hours into minutes.

package Java_Class_All.Lab_02;

import java.util.Scanner;

public class Program_15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter time in hours: ");
        float H=sc.nextFloat();
        float M=(H*60);
        System.out.println("Here given Time in Minutes: " + M);
        sc.close();
    }
}
