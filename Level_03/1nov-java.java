import java.util.Scanner;

class Test{

public static void main(String args[ ]){

System.out.print(" please enter size of array");

Scanner sc=new Scanner(System.in);

int size = sc.nextInt();

try{

int a[ ] = new int[size];

     System.out.println(" size of array is :"+a.length);

     System.out.println(a[5]); 

}catch(Exception e)

{

   System.out.println(" array size is negative: not allowed");

}



}

}



