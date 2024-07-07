//Program to print prime number in pair like 13,31 by Rajat Jangid.

package All_01_18_Program;

import java.util.Scanner;

public class Program_01_a {
    public static boolean checkingPrime(int N){
        boolean check=true;
        for(int i=2;i<N;i++){
            if(N%i==0){
                check =false;
            }
        }
        return check;
    } 
    public static int reverseNumber(int N){
        int ans=0;
        int size=0;
        int n=N;
        while(n>0){
            n/=10;
            size++;
        }
        int i=size-1;
        while(N>0){
            // System.out.print(N%10 + " ");
            ans += ((N%10)*Math.pow(10,i));
            N/=10;
            i--;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner( System.in);
        System.out.print("Give the range in which you want twin primes starting form zero to ");
        int N=sc.nextInt();
        // System.out.println(checkingPrime(N));
        boolean flag1=true;
        boolean flag2=true;
        int reverse;
        for(int i=11;i<=N;i++){
            flag1=checkingPrime(i);
            reverse=reverseNumber(i);
            flag2=checkingPrime(reverse);
            if((flag1 == true) && (flag2 == true )){
            System.out.printf(" Pair (%d,%d) ",i,reverse);
            System.out.println();
            }
        }
        sc.close();
    }
}
