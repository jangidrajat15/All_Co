package Java.Level_02;
//Strings
//Strings in java are immutable.

import java.util.Scanner;

public class code_05 {
    public static void main(String[] args){
        System.out.print("Enter your name: ");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("Your name is " + name);
        System.out.println("Length of your name is: " + name.length());
        //to print all character in name
        System.out.print("All Characters in your name are: ");
        for(int i=0;i<name.length();i++){
            System.out.print(name.charAt(i) + " ");
        }
        //to compare two strings.
        System.out.println();
        System.out.print("Enter second name: ");
        String name2=sc.nextLine();
        /*
        compare function gives three output
        1. 0 when two given string is equal
        2. +ve when first is greater then other string 
        3. -ve when first is smaller then other string.
         */
        if(name.compareTo(name2)==0){
            System.out.println("Both the given names are same.");
        }else{
            System.out.println("Both the names are not same.");
        }
        sc.close();
        //substrings
        String new_name=name.substring(0, name.length());
        System.out.println("substring: " + new_name);
    }
}