//program to get factorial of a given number

package Java_Class_All.Lab_03;

import java.util.Scanner;

public class Program_24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N: ");
        int N=sc.nextInt();
        float ans=1;
        for(int i=1;i<=N;i++){
            ans*=i;
        }
        System.out.println("Factorial of the given number "+ N +" is: "+(ans));
    }
}
