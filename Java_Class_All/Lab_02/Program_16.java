//Program to convert Fahrenheit to Celsius.

package Java_Class_All.Lab_02;

import java.util.Scanner;

public class Program_16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter temperture in Fahrenheit: ");
        float F=sc.nextFloat();
        float C=((F-32)*5)/9;
        System.out.println("Here given Temperature in Celsius: " + C);
        sc.close();
    }
}

