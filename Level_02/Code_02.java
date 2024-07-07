package Java.Level_02;
import java.util.Scanner;

public class Code_02 {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter n: ");
            int n=sc.nextInt();
            Math x= new Math();
            int ans=x.fact(n);
            System.out.println("Factorical of "+ n + " is : "+ ans);
            sc.close();
        }    
}

class Math{
    public int fact(int n){
        int ans=1;
        for(int i=2;i<=n;i++){
            ans=ans*i;
        }
        return ans;
    }
}