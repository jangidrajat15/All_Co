//Program to make ATM application using java constructs.

package Java_Class_All;

import java.util.Scanner;

public class Program_26 {
    float Balance=0;
    int flag;
    public Program_26(float Balance){
        this.Balance=Balance;
    }

    public float RBalance(){
        return this.Balance;
    }

    public void AddMoney(float X){
        Balance+=X;
        System.out.println("-> " + X+" $ is added to your Balance");
    }

    public void DabitAmount(float X){
        if(X>Balance){
            System.out.println("Soory your Balance is not enough \n Add Money First");
        }else{
        Balance-=X;
        System.out.println("-> "+X+" $ is Dabited from your Balance");
        }
    }

    public void setLoopCheck(int x){
        flag =x;
    }
    
    public int getLoopCheck(){
        return flag;
    }
    public static void main(String[] args) {
        System.out.println("-----ATM-----");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Starting Amount: ");
        float A=sc.nextFloat();
        Program_26 obj=new Program_26(A);
        do{
        System.out.println("Enter \n -> 1 for Checking Balance\n -> 2 for Adding Money \n -> 3 for Dabiting Money \n -> 4 for Exit");
        int x=sc.nextInt();
        obj.setLoopCheck(x);
        // sc.close();
        switch (x) {
            case 1:
                System.out.println("Your Balance is : "+ obj.RBalance() + "$");
                break;
            case 2:
                System.out.print("Enter amount for adding money : ");
                float amount=sc.nextFloat();
                obj.AddMoney(amount);
                break;
            case 3:
                System.out.print("Enter amount for Dabiting money : ");
                float amount_01=sc.nextFloat();
                obj.DabitAmount(amount_01);
                break;
            case 4:
                System.out.println("THANK YOU"); 
                break;

            default:
            System.out.println("Enter valid operoter.");
                break;
        }
    }while(obj.getLoopCheck()!=4);
        sc.close();

    }
}
