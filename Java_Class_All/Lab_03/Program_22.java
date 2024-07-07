// program to verify vote cast eligibility of a person.

package Java_Class_All.Lab_03;

import java.util.Scanner;

public class Program_22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter age of the person: ");
        int Age=sc.nextInt();
        if(Age>=18){
            System.out.println("Person with age "+ Age + " is eligible for vote.");
        }else{
            System.out.println("Person with age "+ Age + " is not eligible for vote.");
        }
    }
}
