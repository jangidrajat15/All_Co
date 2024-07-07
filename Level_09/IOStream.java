/*

Byte Stream and Text Stream.

 */


package Level_09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOStream {
    public static void main(String[] args) throws IOException{
        // InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader brr=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any character: ");
        char ch=(char)brr.read();

        BufferedReader brr2=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any interger: ");
        int A=brr2.read();
        // InputStreamReader isr1=new InputStreamReader(System.in);
        // BufferedReader brr1=new BufferedReader(isr1);
        
        System.out.println("Entered N=" + A +" and ch= " + ch);
    }
}

