//Program to make calculator application using java constructs.

package Java_Class_All;

import java.util.Scanner;

public class Program_25 {
    float num1,num2;
    int op;
    public Program_25(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1=sc.nextFloat();
        // System.out.println();
        System.out.print("Enter second number: ");
        num2=sc.nextFloat();
        // System.out.println();
        System.out.println("Enter \n -> 1 for '+' \n -> 2 for '-' \n -> 3 for '*' \n -> 4 for '/' \n");
        op=sc.nextInt();
        sc.close();
    }
    public static void main(String[] args) {
        System.out.println("--------Calculator-------");
        Program_25 obj=new Program_25();
        switch (obj.op) {
            case 1:
                System.out.println("Addition of the given two number is : "+ (obj.num1+obj.num2));
                break;
            case 2:
                System.out.println("Substraction of the given two number is : "+ (obj.num1-obj.num2));
                break;
            case 3:
                System.out.println("Product of the given two number is : "+ (obj.num1*obj.num2));
                break;
            case 4:
                System.out.println("Division of the given two number is : "+ (obj.num1/obj.num2));
                break;
            
            default:
            System.out.println("Enter valid operator");
                break;
        }
        // System.out.println("Hello");
    }
}
