//A Program to find a number in given array which is only appearing one time and other elements are repeting 3 times in the given array.

package Placement_Codes;

import java.util.Scanner;

public class Program_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter length of the array: ");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //For finding element which is only one time in array but we have to do it in O(n) time complexity and O(1) space complexity.

        int m=32;
        int result=0;
        int sum,x;
        boolean bool;
        for(int i=0;i<m;i++){
            sum=0;
            x=( 1 << i ) ;
            // System.out.println("x: " + x);
            // if(x==1){
            //     bool=true;
            // }else if(x==0){
            //     bool=false;
            // }
            for(int j=0;j<n;j++){
                // System.out.println("Bool: " + (arr[j] & x));
                if((arr[j] & x)>=1){
                    sum++;
                }
            }
            // System.out.println("sum: "+sum);
            if(sum%3 != 0){
                result = result | x;
                // System.out.println("Ans: " + result);
            }
        }
        System.out.println("Ans: " + result);
    }
}
