package Java.Level_03;

import java.util.Scanner;

//How to make our own exception class.

public class Exception_01 {
    public static void main(String[] args)throws MyArithmeticException{
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter n1: ");
       int n1=sc.nextInt();
       System.out.print("Enter n2: ");
       int n2=sc.nextInt();
       MyDivision md=new MyDivision(n1, n2);
       md.doDivision();
       sc.close();
    }
}

class MyDivision{
    int a,b;
    public MyDivision(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void doDivision() throws MyArithmeticException{
        if(b==5){
            throw new MyArithmeticException();
        }
        else{
            int result=a/b;
            System.out.println("Division Result: " + result);
        }
    }
}

class MyArithmeticException extends Exception{
    public MyArithmeticException(){
        System.out.println("Division by 5 is not allowed");
    }
}