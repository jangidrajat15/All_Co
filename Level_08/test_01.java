package Level_08;

import java.util.Scanner;

public class test_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your first subject marks : ");
        float S1=sc.nextFloat();
        System.out.print("Enter your second subject marks : ");
        float S2=sc.nextFloat();
        System.out.print("Enter your Third subject marks : ");
        float S3=sc.nextFloat();
        float ans=(S1+S2+S3)/3;
        System.out.println("Your percentage is "+ ans);
        sc.close();
    }
}
