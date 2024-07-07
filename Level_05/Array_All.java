package Java.Level_05;

import java.util.Scanner;


public class Array_All {
    public static void main(String[] args) {
        ArrayFull AF=new ArrayFull();
        Scanner sc=new Scanner(System.in);
        float[] arr=new float[5];
        System.out.println("Enter float array of length 5 :");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextFloat();
        }
        // System.out.print("Sum of the given array : ");
        // System.out.println(AF.elementSum(arr));

        // System.out.println("Enter element to search :");
        // float x=sc.nextFloat();
        // boolean ans_01=AF.searchElement(x, arr);
        // if(ans_01) System.out.println(x+ " is present in the array.");
        // else System.out.println(x+ " is not present in the array.");

        // float[][] arr1=new float[2][3];
        // float[][] arr2=new float[2][3];
        // System.out.println("Enter elements of the first matrix with 2 rows and 3 columns : ");
        // for(int i=0;i<2;i++){
        //     for(int j=0;j<3;j++){
        //         arr1[i][j]=sc.nextFloat();
        //     }
        // }

        // System.out.println("Enter elements of the second matrix with 2 rows and 3 columns : ");
        // for(int i=0;i<2;i++){
        //     for(int j=0;j<3;j++){
        //         arr2[i][j]=sc.nextFloat();
        //     }
        // }

        // AF.sumOfMatrix(arr1,arr2);

        // System.out.println("After reversing the given array we get : ");
        // float[] ans=AF.reverseArray(arr);
        // for(int i=0;i<ans.length;i++){
        //     System.out.print(ans[i] +" ");
        // }

        // System.out.print("Maximum element in given array is : ");
        // System.out.print(AF.maximumElement(arr));

        // System.out.println();

        // System.out.print("Minimum element in given array is : ");
        // System.out.println(AF.minimumElement(arr));

        boolean flag=AF.isSorted(arr);
        if(flag) System.out.println("Given array is sorted.");
        else System.out.println("Given array is not sorted.");
        sc.close();
    }
}

class ArrayFull{
    //Question_01
    //Take float array and calculate the sum of all elements.

    public float elementSum(float[] arr){
        float ans=0;
        for(float ele:arr){
            ans+=ele;
        }
        return ans;
    }

    //Question_02 
    //To check whether the element is present in array or not.

    public boolean searchElement(float x,float[] arr){
        for(float ele:arr){
            if(ele==x){
                return true;
            }
        }
        return false;
    }

    //Question_03
    //to add two given matrix

    public void sumOfMatrix(float[][] arr1,float[][] arr2){
        System.out.println("Sum of the given two matrix is :");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                System.out.print((arr1[i][j]+arr2[i][j]) + " ");
            }
            System.out.println();
        }
    }

    //Question_04
    //To reverse the given number

    public float[] reverseArray(float[] arr){
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            float temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        return arr;
    }
    
    //Question_05
    //Maximum element in given array.

    public float maximumElement(float[] arr){
        float Max=arr[0];  //we can start with Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(Max<arr[i]){
                Max=arr[i];
            }
        }
        return Max;
    }

    //Question_06
    //Minimum element in given array.

    public float minimumElement(float[] arr){
        float Min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(Min>arr[i]){
                Min=arr[i];
            }
        }
        return Min;
    }

    //Question_07
    //For checking that given array is sorted or not.

    public boolean isSorted(float[] arr){
        //for increasing array.
        boolean flag_01=true;
        boolean flag_02=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                flag_01=false;
            }
        }
        //For decreasing array.
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                flag_02=false;
            }
        }

        if(flag_01 || flag_02){
            return true;
        }else{
            return false;
        }
    }

}