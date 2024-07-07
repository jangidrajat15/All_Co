//Code for finding average of the given 5 subject's marks.

package Java.Level_02;

import java.util.Scanner;

public class code_08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of all 5 subjects: ");
        byte[] arr=new byte[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextByte();
        }
        Average obj_01=new Average();
        float ans=obj_01.average(arr);
        System.out.println("Average of the given marks is : "+ ans);
        sc.close();
    }
}

class Average{
    public float average(byte ...Arr){
        float ans=0;
        for(byte ele:Arr){
            ans+=ele;
        }
        return (ans/Arr.length);
    }
}