//First Program to learn java.

//import java.net.SocketPermission;
import java.util.*;
//import java.util.Scanner;

class FirstClass{
    public static void main(String args[]){
        work W=new work();
        W.input();
        }
}

class work{
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter T: ");
        int count=sc.nextInt();
        //sc.close();
        //int copy=count;
        //Sc.close();
        // int ch[]=new int[count];
        // int i=0;
        
        while(count>0){
            //Sc.reset();
            //System.out.println(i);
            Scanner S = new Scanner(System.in);
            System.out.println("For Addition enter 1\nFor subtaction enter 2\nFor multiply enter 3\nFor Division enter 4");
            System.out.print("Enter : ");
            //Scanner S = new Scanner(System.in);
            //ch[i]=0;
            int ch=0;
            if(S.hasNextInt()){
                ch=S.nextInt();
            }
            //S.close();
            //ch=Sc.nextInt();
            //System.out.println(i);
            //Sc.close();
            //int ch=Ch;
            //sc.nextLine();
            math A=new math();
            switch(ch){
                case 1:{
                    System.out.println("--For Addition--");
                    A.Sum();
                }
                break;
                case 2:{
                    System.out.println("--For Subtraction--");
                    A.Difference();
                }
                break ;
                case 3:{
                    System.out.println("--For Multiplication--");
                    A.Multiply();
                }
                break;
                case 4:{
                    System.out.println("--For Division--");
                    A.Division();
                }
                break;
                default :{
                    System.out.println("Enter valid operator next time .\n Thank You ");
                }
                break;
            }
            count-=1;
            S.close();
        }
        sc.close();
    }
}
class math {
    public void Sum(){
        try (Scanner Sc = new Scanner(System.in)) {
            System.out.print("Enter N1: ");
            int x=Sc.nextInt();
            System.out.print("Enter N2: ");
            int y=Sc.nextInt();
            int z=x+y;
            System.out.println("Sum of " + x + " and " + y + " is :" + z);
        }
    }
    public void Difference(){
        try (Scanner Sc = new Scanner(System.in)) {
            System.out.print("Enter N1: ");
            int x=Sc.nextInt();
            System.out.print("Enter N2: ");
            int y=Sc.nextInt();
            int z=x-y;
            
            System.out.println("Difference of " + x + " and " + y + " is :" + ((z>=0)?(z):(-z)));
        }
    }
    public void Multiply(){
        try (Scanner Sc = new Scanner(System.in)) {
            System.out.print("Enter N1: ");
            int x=Sc.nextInt();
            System.out.print("Enter N2: ");
            int y=Sc.nextInt();
            int z=x*y;
            System.out.println("Multiplaction of " + x + " and " + y + " is :" + z);
        }
    }
    public void Division(){
        try (Scanner Sc = new Scanner(System.in)) {
            System.out.print("Enter N1: ");
            int x=Sc.nextInt();
            System.out.print("Enter N2: ");
            int y=Sc.nextInt();
            int z=x/y;
            System.out.println("when we divide " + x + " by " + y + " we get :" + z);
        }
    }
    public void rajat(){
        System.out.println("My name is Rajat");
    }
}