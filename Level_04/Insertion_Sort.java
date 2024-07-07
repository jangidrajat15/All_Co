package Java.Level_04;

import java.util.Scanner;

public class Insertion_Sort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //Insertion Sort
        //Time Complexity is O(n^2)

            //Method_01
        // for(int i=0;i<n-1;i++){
        //     for(int j=i+1;j>0;j--){
        //         if(arr[j]<arr[j-1]){
        //             int temp=arr[j];
        //             arr[j]=arr[j-1];
        //             arr[j-1]=temp;
        //         }
        //     }
        // }

            //Method_02
        for(int i=1;i<n;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current <arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        sc.close();
        System.out.println("After sorting we get: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
