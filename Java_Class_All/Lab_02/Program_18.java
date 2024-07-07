// Program to convert speed in Km/h to Meter/sec.

package Java_Class_All.Lab_02;

import java.util.Scanner;

public interface Program_18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter speed in km/h: ");
        float Speed=sc.nextFloat();
        float speed=((Speed*1000)/3600);
        System.out.println("After converting given Speed in meter/sec : "+speed);        
        sc.close();
    }
}
