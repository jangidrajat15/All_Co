//Finding area of he

package Java_Class_All.Lab_02;

import java.util.Scanner;

public class Program_09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        int r=sc.nextInt();
        System.out.println("Area of the given circle: "+ (Math.PI*r*r));
    }
}
