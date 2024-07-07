package Level_09;

import java.util.Scanner;

public class Exception_Calc {
    public static void main(String[] args) {
        Calc obj=new Calc();
        System.out.println("------- Calculator --------");
        do{
        try{
            if(obj.getFlag()!=(-1))   obj.startAgain();
            if(obj.getFlag()==2)    break;
            obj.setNum1();
            obj.setOp();
            obj.setNum2();
            obj.getOutput();
            if(obj.getFlag()==(-1)) obj.setFlag(0);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }while(obj.getFlag()!=2);
        System.out.println("Ok Done.");
    }
}
class Calc{
    private float num1;
    private float num2;
    private int op;
    private int flag=(-1);
    Scanner sc=new Scanner(System.in);

    public void setNum1() throws MyException_003{
        System.out.print("Enter num1: ");
        num1=sc.nextFloat();
        if(num1>100000){
            throw new MyException_003();
        }
    }
    public void setOp() throws MyException_001{
        System.out.println("Enter \n 1. for Addition\n 2. for Subtraction\n 3. for multiplication\n 4. for division ");
        op=sc.nextInt();
        if(op!=1 && op!=2 && op!=3 && op!=4 && op!=5){
            throw new MyException_001();
        }
    }

    public void setNum2() throws MyException_003{
        System.out.print("Enter num2: ");
        num2=sc.nextFloat();
        if(num2>100000){
            throw new MyException_003();
        }
    }

    public int getFlag(){
        return flag;
    }
    public void setFlag(int n){
        flag=n;
    }
    public void getOutput() throws MyException_004,MyException_002{
        switch (op) {
            case 1:
                System.out.println(num1+" + "+num2+" = "+(num1+num2));
                break;
            case 2:
                System.out.println(num1 + " - "+num2+ " = " + (num1-num2));
                break;
            case 3:
                if(num1>7000 || num2>7000){
                    throw new MyException_004();
                }else{
                System.out.println(num1 + " * " +  num2 + " = " + (num1*num2));
                }
                break;
            case 4:
                if(num2!=0){
                    System.out.println(num1 + " / " + num2 +" = "+ (num1/num2) );
                }else{
                    throw new MyException_002();
                }
                break;
            default:
                System.out.println("Invalid Opertion.");
                break;
        }    
    }

    public void startAgain(){
        System.out.println("Enter \n 1. for again testing Calculator. \n 2. for Exit.");
        flag=sc.nextInt();
    }

}

//Exception for Invalid input.

class MyException_001 extends Exception{
    public String toString() {
        return "Invalid Input. \n Enter Valid Input.";
    }
}

//Exception for cannot divide by zero.

class MyException_002 extends Exception{
    public String toString() {
        return "Sorry we cannot divide any number by zero.";
    }
}

//Max Input Exception if any of the input is greater then 100000.

class MyException_003 extends Exception{
    public String toString() {
        return "Sorry, You cannot enter number greater then 100000.";
    }
}

//Max Multiplier reached Exception i.e. Don't allow any multiplication input to be greater then 7000.

class MyException_004 extends Exception{
    public String toString() {
        return "Max Multiplier Reached i.e. you are not allowed to enter multiplier greater then 7000.";
    }
}