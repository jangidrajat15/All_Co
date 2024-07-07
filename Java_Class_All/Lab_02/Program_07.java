// Find the perimeter of rectangle.

package Lab_02;

import java.util.Scanner;

public class Program_07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of the rectangle: ");
        int L=sc.nextInt();
        System.out.print("Enter width of the rectangle: ");
        int W=sc.nextInt();
        System.out.println("Perimeter of the given rectangle is: "+(2*(L+W)));
    }
}
