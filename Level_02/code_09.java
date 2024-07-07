//Code for checking that the given input is integer or not.

package Java.Level_02;

import java.util.Scanner;

public class code_09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number:");
        System.out.println(sc.hasNextInt());
        int c=sc.nextInt();
        int ans='a'+c;
        System.out.println(ans);
    }
}
