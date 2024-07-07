package Java_Class_All.Lab_02;

import java.util.Scanner;

public class Program_08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of the rectangle: ");
        int l=sc.nextInt();
        System.out.print("Enter width of the rectangle: ");
        int w=sc.nextInt();
        System.out.println("Area of the given rectangle: " + (l*w));
    }
}
