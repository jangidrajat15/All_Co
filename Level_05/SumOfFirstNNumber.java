import java.util.Scanner;

public class SumOfFirstNNumber {
    static int Sum(int N){
        if(N==0){
            return 0;
        }
        int ans=N + Sum(N-1);
        return ans;
    }
    public static void main(String[] args) {
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("you have to enter N upto which you want to find the sum \n This process will run until you enter N as 1");
        do{
        System.out.print("Enter N: ");
        int N=sc.nextInt();
        sc.nextLine();
        count=N;
        //sc.close();
        int ans=Sum(N);
        System.out.println(ans);
        }while(count!=1);
        sc.close();
    }    
}
