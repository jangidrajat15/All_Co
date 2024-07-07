//Program to sort an array and search an element inside it.

package Java_Class_All.Lab_05;

import java.util.Scanner;

public class Program_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of your array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<(n);j++){
                if(arr[j]<arr[i]){
                    arr[j]=arr[i]+arr[j];
                    arr[i]=arr[j]-arr[i];
                    arr[j]=arr[j]-arr[i];
                }
            }
        }

        System.out.println("After sorting given array we get : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //printArray(arr);
        System.out.print("Enter elememt to be searched in array: ");
        int ele=sc.nextInt();
        boolean flag=false;

        for(int i=0;i<n;i++){
            if(arr[i]==ele){
                flag=true;
                System.out.println(ele + " is present on the "+ i + " index of array.");
            }
        }
        if(!flag)
        System.out.println(ele + " is not present in the given array.");
    }
}