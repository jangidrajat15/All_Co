// program to sort an array and insert an element inside it.

package Java_Class_All.Lab_05;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class Program_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter length of the array N: ");
        int N=sc.nextInt();

        int[] arr=new int[N];

        System.out.println("Enter elements of the array : ");
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }

        //Sorting by Bubble Sort

        // for(int i =0;i<(N-1);i++){
        //     for(int j=0;j<(N-i-1);j++){
        //         if(arr[j]<arr[j+1]){
        //             int temp=arr[j];
        //             arr[j]=arr[j+1];
        //             arr[j+1]=temp;
        //         }
        //     }
        // }
        
        //Sorting by Insertion sort

        // for(int i=1;i<N;i++){
        //     int current=arr[i];
        //     int j=(i-1);
        //     while(j>=0 && arr[j]>current){
        //         arr[j+1]=arr[j];
        //         j--;
        //     }
        //     arr[j+1]=current;
        // }

        //Sorting by Selection Sort.

        int idx;
        for(int i=0;i<(N-1);i++){
            idx=i;
            for(int j=i+1;j<(N);j++){
                if(arr[idx]>arr[j]){
                    idx=j;
                }
            }
            if(idx!=i){
                int temp=arr[idx];
                arr[idx]=arr[i];
                arr[i]=temp;
            }
        }

        System.out.println("After sorting array we get. ");

        //Printing array 
        for(int i=0;i<N;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Enter element for inserting in given array: ");
        int ele=sc.nextInt();

    }
}
