//Program to find Simple Interset for given amount, time, rate of interset.

package Java_Class_All;

import java.util.Scanner;

public class Program_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float P,r,t,SI;
        System.out.print("Enter Principle amount: ");
        P=sc.nextFloat();
        System.out.print("Enter time : ");
        t=sc.nextFloat();
        System.out.print("Enter rate of interset : ");
        r=sc.nextFloat();
        SI=(P*t*r)/100;
        System.out.print("Simple Interset is : " + SI);
        System.out.println();
        System.out.print("And total amount is : "+ (SI+P));
        sc.close();
    }
}
