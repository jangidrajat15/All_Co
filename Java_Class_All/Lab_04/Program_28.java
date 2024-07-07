//Program to make menu based ATM application using OOPS .


package Java_Class_All.Lab_04;

import java.util.Scanner;

public class Program_28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter starting Balance: ");
        float startBalance=sc.nextFloat();
        ATM obj=new ATM(startBalance);
        System.out.println(startBalance + "$ is added to your account.");
        boolean flag=true;
        float Balance_01;
        while(flag){
            System.out.println("Enter: \n 1 for checking balance in your account. \n 2 for adding balance in your account. \n 3 for debiting from your account. \n 4 for Exit. \n 5 for reset acount.");
            int n=sc.nextInt();
            switch (n) {
                case 1:
                    float balance =obj.GetBalance();
                    System.out.println("Balance in your account is "+balance+ "$ only.");                    
                    break;
                
                case 2:
                    System.out.print("Enter Amount: ");
                    Balance_01=sc.nextFloat();
                    obj.AddMoney(Balance_01);                    
                    break;

                case 3:
                    System.out.print("Enter Amount: ");
                    Balance_01=sc.nextFloat();
                    obj.RemovingMoney(Balance_01);                    
                    break;

                case 4:
                    flag =false;                    
                    break;

                case 5:
                    System.out.println("Your Account is closed.");
                    System.out.print("For new Account enter starting Balance: ");
                    float startBalance_01=sc.nextFloat();
                    obj.SetBalance(startBalance_01);
                    System.out.println(startBalance_01 + "$ is added to your account.");
                    break;

                default:
                    System.out.println("Enter valid Number.");
                    break;
            }
        }
    }
}

class ATM{
    float balance;

    ATM(float balance){
        this.balance=balance;
    }

    public void SetBalance(float balance){
        this.balance=balance;
    }

    public float GetBalance(){
        return balance;
    }

    public void AddMoney(float num){
        this.balance+=num;
        System.out.println(num + "$ is Added to your account.");
    }

    public void RemovingMoney(float num){
        if(this.balance > num){
            this.balance-=num;
            System.out.println(num+ "$ is debited from your account.");
        }else{
            System.out.println("Your balance is only " + balance + " $ so you can not debit "+ num +"$ from your account.");
        }
    }
}