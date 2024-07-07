//Program to print twin prime pairs in given range by Rajat Jangid.

package All_01_18_Program;

import java.util.Scanner;

public class Program_01_b{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your email_id : ");
        String email=sc.nextLine();
        //Condition_01 
        boolean C1=true;

        int idx_01=0;
        int idx_02=0;
        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                idx_01=i;
            }
            if(email.charAt(i)=='.'){
                idx_02=i;
            }
        }
        if(idx_01>idx_02){
            C1=false;
        }

        //Condition_02
        boolean C2=true;

        if(idx_01<1 || idx_01>email.length()-1){
            C2=false;
        }

        //Condition_03
        boolean C3=true;
        if(idx_02 != email.length()-4){
            C3=false;
        }

        //Full Check
        if(C1==true && C2==true && C3==true){
            System.out.println("Yes, you enter the correct email id");
        }else{
            System.out.println("No, you have entered wrong email id");
        }

        System.out.println(email);
        sc.close();
    }
}