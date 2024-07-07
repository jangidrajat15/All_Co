package Java.Level_03;

import java.util.Scanner;

public class Bit_Code_01 {
    public static void main(String args[]){
        int n=5;
        int pos=1;
        int bitmask=1<<pos;
        
        //Get bit
        if ((bitmask & n) == 0 ){
            System.out.println("Bit was Zero");
        }else{
            System.out.println("Bit was One");
        }
        
        //set bit
        int newNumber=bitmask | n;
        System.out.println("After setting bit number is : " + newNumber);

        //clear bit
        int m=5;
        int position=2;
        int bitmask1=1<<position;
        int notbitmask1=~(bitmask1);
        int ans=notbitmask1 & m;
        System.out.println("After clearing bit: " + ans);

        //To Update bit
        int num=5;
        int position2=1;
        Scanner scannner=new Scanner(System.in);
        System.out.print("Enter value to which we have to update: ");
        int Ch=scannner.nextInt();
        int bitmask2=1<<position2;
        if(Ch==1){
            int ans2=bitmask2 | num;
            System.out.println("After updating : " + ans2);
        }else{
            int notbitmask2=~(bitmask2);
            int ans3=notbitmask2 & num;
            System.out.println("After updating :" + ans3);
        }
        scannner.close();
    }
}