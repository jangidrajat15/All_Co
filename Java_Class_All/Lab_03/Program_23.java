// program to display table of a given number. 

package Java_Class_All;

import java.util.Scanner;

public class Program_23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N: ");
        int N=sc.nextInt();
        for(int i=1;i<11;i++){
            System.out.print(N+"X"+i+"="+(i*N)+'\n');
        }
    }
}
