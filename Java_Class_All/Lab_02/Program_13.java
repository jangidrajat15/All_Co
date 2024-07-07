//Program to find Compound interset for given amount, rate, time.

package Java_Class_All;

import java.util.Scanner;

public class Program_13 {
    public static void main(String[] args) {
        CI obj=new CI();
        System.out.println("Compound interset is : "+ obj.CompoundI());
    }
}

class CI{
    double P,r,n;

    public double CompoundI(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter amount: ");
        P=sc.nextDouble();
        System.out.print("Enter rate of interset : ");
        r=sc.nextDouble();
        System.out.print("Enter time : ");
        n=sc.nextDouble();
        sc.close();
        double ans=P * Math.pow((1+r/100),n);
        return ans;
    }
}