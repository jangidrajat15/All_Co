package Java.Rajat_Level;

import java.util.Scanner;

public class RajatFactOwn{
    public static void main(String[] arg){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter no. N: ");
        int N=scanner.nextInt();
        int[] Arr=new int[796999999];    //Max_Length of array--> 2147483647
        Arr[0]=1;
        int size=1;
        MathNew M=new MathNew();
        for(int i=2;i<=N;i++){
            //System.out.println("i: "+ i);
            size = M.Fact(Arr,i,size);
        
        }
        for(int i=(size-1);i>=0;i--){
            System.out.print(Arr[i] + "");
        }
        System.out.println();
        System.out.println("No. of characters are : " + (size));
        scanner.close();
    }
}

class MathNew{
    public int Fact(int[] arr,int N,int Size){
        //System.out.println("Start");
        int carry=0;
        for(int i=0;i<Size;i++){
            int pro=N*arr[i]+carry;
            arr[i]=pro%10;
            carry=pro/10;
        }
        while(carry!=0){
            arr[Size]=carry%10;
            carry/=10;
            Size++;
        }
        //System.out.println("Size: "+Size);
        return Size;
    }
}