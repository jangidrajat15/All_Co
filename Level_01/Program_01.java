import java.util.Scanner;

class Program_01 {
    public static void main(String arr[]){
        Anew x=new Anew();
        Scanner sc=new Scanner(System.in);
        // System.out.println(10.0/0);   //Ans is Infinity
        // System.out.println("Enter N1 : ");
        // int num1=sc.nextInt();
        // System.out.println("Enter N2: ");
        // int num2=sc.nextInt();
        // int ans=x.add(num1, num2);
        // System.out.println("Sum: " +ans);
        System.out.println(arr[0] + arr[1]);
        // System.out.println(arr[1]);

        System.out.println("Hello");
        sc.close();
    }
}

class Anew{
    int n;
    public int add(int num1,int num2){
        int ans=num1+num2;
        return ans;
    }
}