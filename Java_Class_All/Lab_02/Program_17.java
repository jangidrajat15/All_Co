//Program to convert Celsius to Fahrenheit.

package Java_Class_All.Lab_02;

import java.util.Scanner;

public class Program_16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter temperture in Celsius: ");
        float C=sc.nextFloat();
        float F=((C-32)*5)/9;
        System.out.println("Here given Temperature in Fahrenheit to : " + F);
        sc.close();
    }
}