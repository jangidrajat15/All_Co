package Java.Level_05;

import java.util.Scanner;

public class Loop_Practice_Set {
    public static void main(String[] args) {
        LoopAll LA=new LoopAll();   
        Scanner sc=new Scanner(System.in);


        // System.out.print("Enter n for pattern printing : ");
        // int n=sc.nextInt(); 
        // LA.patternPrinting(n);
        
        
        System.out.print("Enter m for finding sum of even numbers : ");
        int m=sc.nextInt();
        int ans_01=LA.evenSumN(m);
        System.out.println("Even Sum is :" + ans_01);
        
        
        // System.out.print("Enter N for printing multiplication table: ");
        // int N=sc.nextInt();
        // LA.PrintingTable(N);
        
        
        // System.out.println("Printing table of 10 in reverse order: ");
        // LA.printingTableInReverse();
        
        
        // System.out.print("Enter M for finding M! : ");
        // int M=sc.nextInt();
        // long ans_02=LA.findingFactorial(M);
        // System.out.println(M +"! = " + ans_02);
        

        // int ans_03=LA.sumOfElementsInTable8();
        // System.out.println("Sum of Elements occuring in the table of 8 is : " + ans_03);

        sc.close();
    }
}

class LoopAll{

    //Question_01
    //Pattern_Printing 

    public void patternPrinting(int n){
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    //Question_02
    //To find sum of first n even numbers using while loop.

    public int evenSumN(int n){
        int result=0;
        // for(int i=1;i<=n;i++){
        //     result+=(2*i);
        // }
        int i=0;
        while(i<n){
            result+=(2*i);
            i++;
        }
        return result;
    }

    //Question_03
    //Printing multiplication table for given number.

    public void PrintingTable(int N){
        for(int i=1;i<=10;i++){
            // System.out.println(N + "*" + i + "=" + (N*i));
            System.out.printf("%d X %d = %d\n",N,i,(N*i));
        }
    }

    //Question_04
    //Printing Multiplication table of 10 in reverse order.

    public void printingTableInReverse(){
        for(int i=10;i>0;i--){
            System.out.printf("%d X %d = %d \n",10,i,(10*i));
        }
    }

    //Question_05
    //Finding factorial of the given number using for loop.

    public long findingFactorial(int M){
        long ans=1;
        for(int i=1;i<=M;i++){
            ans*=i;
        }
        return ans;
    }

    //Question_06
    //Find sum of all numbers occuring in the table of 8.

    public int sumOfElementsInTable8(){
        int Ans=0;
        for(int i=1;i<=10;i++){
            Ans += (8*i);
        }
        return Ans;
    }

}
