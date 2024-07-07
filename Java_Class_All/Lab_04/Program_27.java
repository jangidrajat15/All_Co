// Program to make calculator by Rajat Jangid. 

package Java_Class_All;

import java.security.PublicKey;
import java.util.Scanner;

public class Program_27 {
    public static void main(String[] args){
        float num1,num2;
        int op;
        Math_001 obj=new Math_001();
        Scanner sc=new Scanner(System.in);
        System.out.println("--------Calculator-------");
        do{
        System.out.print("Enter first number: ");
        obj.SetNum1(sc.nextFloat());
        System.out.print("Enter second number: ");
        obj.SetNum2(sc.nextFloat());
        System.out.println("Enter \n -> 1 for '+' \n -> 2 for '-' \n -> 3 for '*' \n -> 4 for '/' \n -> 5 for EXIT");
        obj.SetOp(sc.nextInt());
        switch (obj.GetOp()) {
            case 1:
                System.out.println("Addition of the given two number is : "+ (obj.Addition()));
                break;
            case 2:
                System.out.println("Substraction of the given two number is : "+ (obj.Subtract()));
                break;
            case 3:
                System.out.println("Product of the given two number is : "+ (obj.Multiply()));
                break;
            case 4:
                System.out.println("Division of the given two number is : "+ (obj.Division()));
                break;
            case 5:
                break;

            default:
                System.out.println("Enter valid operator");
                break;
        }
    }while(obj.GetOp()!=5);
    sc.close();
    }
}

class Math_001{
    public float num1,num2;
    public int op;

    public void SetNum1(float num1){
        this.num1=num1;
    }

    public void SetNum2(float num2){
        this.num2=num2;
    }

    public float GetNum1(){
        return num1;
    }

    public float Getum2(){
        return num2;
    }

    public void SetOp(int op){
        this.op=op;
    }

    public int GetOp(){
        return this.op;
    }

    public float Addition(){
        return (num1+num2);
    }

    public float Subtract(){
        return (num1-num2);
    }

    public float Multiply(){
        return (num1*num2);
    }

    public float Division(){
        return (num1/num2);
    }
}