package Java.Level_04;

import java.util.Scanner;

public class Selection_sort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        //Selection Sort
            //Time Complexity is O(n^2).
        int idx;
        for(int i=0;i<n-1;i++){
            idx=i;
            for(int j=i;j<n-1;j++){
                if(arr[idx]>arr[j+1]){
                    idx=j+1;
                }
            }
            if(idx!=i){
            int temp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=temp;
            }
        }
        System.out.print("After sorting we get: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +  " ");
        }
    }
}
