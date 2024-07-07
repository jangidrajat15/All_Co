//Program to add given two numbers.

package Lab_02;

import java.util.Scanner;

public class Program_02 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1=sc.nextInt();
        System.out.print("Enter Second number : ");
        int num2=sc.nextInt();
        int result = num1 + num2;
        System.out.printf("Addition of  %d and %d is %d", num1, num2, result);
        sc.close();
    }
}
