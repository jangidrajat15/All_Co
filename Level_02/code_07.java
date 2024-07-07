 package Java.Level_02;
//To reverse the given string

import java.util.Scanner;

class full{
    public String reverse(String inputStr){
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Enter your string: ");
        // StringBuilder Str=new StringBuilder(sc.nextLine());
        // sc.close();
        StringBuilder Str=new StringBuilder(inputStr);
        int n=Str.length();
        for(int i=0;i<n/2;i++){
            char ch=Str.charAt(i);
            Str.setCharAt(i,Str.charAt(n-1-i));
            Str.setCharAt((n-1-i), ch);
        }
        // System.out.println("Reverse for the given string is: " + Str);
        return Str.toString();
    }
}

public class code_07 {
    public static void main(String args[]){
        Scanner hs=new Scanner(System.in);
        System.out.print("Enter no. of test cases: ");
        int n=hs.nextInt();
        hs.nextLine();
        full R=new full();
        for(int i=0;i<n;i++){
            System.out.print("Enter your String for test case "+(i+1) +" : ");
            String input_str=hs.nextLine();
            String Ans=R.reverse(input_str);
            System.out.println("Reverse of the string for test case "+(i+1) + " : " + Ans);
        }
        hs.close();
    }   
    // public static void reverseMain(){
    //     Scanner sc=new Scanner(System.in);
    //     System.out.print("Enter your string: ");
    //     StringBuilder Str=new StringBuilder(sc.nextLine());
    //     sc.close();
    //     int n=Str.length();
    //     for(int i=0;i<n/2;i++){
    //         char ch=Str.charAt(i);
    //         Str.setCharAt(i,Str.charAt(n-1-i));
    //         Str.setCharAt((n-1-i), ch);
    //     }
    //     System.out.println("Reverse for the given string is: " + Str);
    // } 
}



// import java.util.Scanner;

// class StringReverser {
//     public static String reverseString(String input) {
//         StringBuilder reversed = new StringBuilder(input);
//         return reversed.reverse().toString();
//     }
// }

// public class code_07 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the number of test cases: ");
//         int numTestCases = scanner.nextInt();
//         scanner.nextLine(); // Consume the newline character

//         for (int i = 0; i < numTestCases; i++) {
//             System.out.print("Enter a string for test case " + (i + 1) + ": ");
//             String inputString = scanner.nextLine();
//             String reversedString = StringReverser.reverseString(inputString);
//             System.out.println("Reversed string for test case " + (i + 1) + ": " + reversedString);
//         }

//         scanner.close();
//     }
// }
