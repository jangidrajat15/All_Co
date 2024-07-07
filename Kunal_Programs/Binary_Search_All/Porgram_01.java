// package Kunal_Programs.Binary_Search_All;

import javax.swing.CellEditor;

public class Porgram_01{
    
    //Ceiling of the number is given by Minimum number which is greater then or equal to target.
    static int Ceiling(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        int ans=(-1);
        while (low <= high) {
            int mid=low + (high-low)/2;
            if(arr[mid]==target){
                return arr[mid];
            }else if(arr[mid]>target){
                ans=arr[mid];
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }




    //floor of the arr is given by Maximum number which is less then or equal to the target.
    static int Floor(int[] arr,int target){
        //Without using extra variable ans
        int low=0;
        int high=arr.length-1;
        // int ans=(-1);
        if(target < arr[low]){
            return (-1);
        }
        while (low <= high) {
            int mid=low + (high-low)/2;
            if(arr[mid]==target){
                return arr[mid];
            }else if(arr[mid]<target){
                // ans=arr[mid];
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return arr[high];
    }




    //Finding element in infinte array(i.e. we are not allowed to use length method anywhere in the code).

    static int elementInInfinite(int[] arr,int target){
        if(target < arr[0]){
            return (-1);
        }
        int end=1;
        while(arr[end]<target){
            end *= 2;
        }
        int start=0;
        while (start<=end) {
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return (-1);
    }




    public static void main(String[] args) {
        // System.out.println("Hello");
        int n=2;
        int[] arr={1,3,6,8,9};
        int x=1;
        // System.out.println("Enter length of the array: ");
        // int[] arr=new int[n];
        
        
        // int ans=Floor(arr,x);
        // System.out.println("Ceiling of the given number is: " + ans);


        int ans=elementInInfinite(arr,x);
        if(ans!=(-1)) System.out.println("Target element is present at place " + (ans+1) + " in the given array");
        else System.out.println("Element is not present in the given array.");

    }
}