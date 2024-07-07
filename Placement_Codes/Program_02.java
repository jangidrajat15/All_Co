//Find sides that can form a triangle.

package Placement_Codes;

import java.util.Scanner;

public class Program_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n=sc.nextInt();
        System.out.println("Enter elements: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        CountTriangle obj=new CountTriangle();
        int ans=obj.triangleCount(arr);
        System.out.println("Number of all Possible triangles from given array: " + ans);
        sc.close();
    }
}

class CountTriangle{
    int count=0;
    public int triangleCount(int[] arr){
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    // System.out.println("(" + i +"," + j + "," + k + ")" + "\n");
                    if(isTriangle(arr[i], arr[j], arr[k])){
                        count++;
                        System.out.println("Triangle Set :-- (" + arr[i] +"," + arr[j] + "," + arr[k] + ")");
                    }
                }
            }
        }
        return count;
    }

    public boolean isTriangle(int a,int b,int c){
        int Max=a;
        if(a<b){
            if(b<c){
                Max=c;
            }else{
                Max=b;
            }
        }else{
            if(a>c){
                Max=a;
            }else{
                Max=b;
            }
        }
        if(Max==a && (b+c)>Max){
            return true;
        }else if(Max==b && (a+c)>Max){
            return true;
        }else if(Max==c && (a+b)>Max){
            return true;
        }else{
            return false;
        }
    }
}