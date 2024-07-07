package Level_09;

import java.util.Scanner;

public class Exception_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value for N: ");
        int N=sc.nextInt();
        if(N<9){
            try{
                throw new MyException();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e);    //it is same as sout(e.toString());
                System.out.println("Finished.");
            }
            finally{
                System.out.println("Finally Completed.");
            }
            System.out.println("Full Finished.");
        }else {
            System.out.println("Hii this is Else part.");
        }
    }
}

class MyException extends Exception{
    public String getMessage() {
        return "I am getMessage from MyException class.";
    }
    public String toString(){
        return "I am toString from MyException class.";
    }
}