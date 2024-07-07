package Lab_02;

import java.util.Scanner;

public class Program_06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your num1: ");
        int num1=sc.nextInt();
        System.out.print("Enter your num2: ");
        int num2=sc.nextInt();
        System.out.println();
        System.out.printf("Your num1 is %d and num2 is %d before swaping.",num1,num2);
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println();
        System.out.printf("After swaping we have num1 = %d and num2 = %d.",num1,num2);
        sc.close();
    }
}
