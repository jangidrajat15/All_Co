import java.util.Scanner;

public class Fibonacci_Series {
    static int fibonacci(int N){
        if(N==0){
            return 0;
        }
        if(N==1){
            return 1;
        }
        int ans=fibonacci(N-1) + fibonacci(N-2);
        return ans;
    }
    static void Print(int n){
        if(n==0){
            return ;
        }
        else{
            Print(n-1);
            for(int i=0;i<n;i++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N(How many numbers): ");
        int N=sc.nextInt();
        for(int i=0;i<N;i++){

        int arr=fibonacci(i);
        System.out.println(arr);
        }
        Print(5);
    }
}
