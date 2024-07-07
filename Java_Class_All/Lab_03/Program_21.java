// Program to check given year is leap or not. 

package Java_Class_All.Lab_03;

import java.util.Scanner;

public class Program_21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any year: ");
        int Y=sc.nextInt();
        if((Y%400==0) || (Y%4==0 && Y%100!=0)){
            System.out.println("Given year: "+ Y + " is a Leap year.");
        }else{
            System.out.println("Given year "+ Y +" is not a Leap Year.");
        }
    }
}