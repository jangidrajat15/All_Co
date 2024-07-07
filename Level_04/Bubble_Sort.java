package Java.Level_04;

import java.util.Scanner;

public class Bubble_Sort {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of the array: ");
        int n=sc.nextInt();
        int[] x=new int[n];
        System.out.println("Enter elements of the array: ");
        for(int i=0;i<n;i++){
            x[i]=sc.nextInt();
        }
        //Bubble Sort 
            //Time Complexity is O(n^2).
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(x[j]>x[j+1]){
                int temp=x[j];
                x[j]=x[j+1];
                x[j+1]=temp;
                }
            }
        }
        printArray(x);
        sc.close();
    }
}
