import java.util.Scanner;

public class pattern_All {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int no=sc.nextInt();
        sc.close();
        all Patt=new all();
        Patt.Pattern_all(no);
        //sc.close();

    }
}

class all{
    public void Pattern_all(int num){
        //Butterfly Pattern 

        int n=num;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            for(int j=0;j<(2*(n-i));j++){
                System.out.print(" ");
            }
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            for(int j=0;j<(2*(n-i));j++){
                System.out.print(" ");
            }
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        
        //solid rhombus

        int m=num;
        for(int i=1;i<=m;i++){
            for(int j=0;j<(m-i);j++){
                System.out.print(" ");
            }
            for(int j=0;j<m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //hollow rhombus

        int num1=num;

        for(int i=1;i<=num1;i++){
            for(int j=0;j<(num1-i);j++){
                System.out.print(" ");
            }
            for(int j=0;j<num1;j++){
                if(j==0 || i==1 || i==num1 || j==num1-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //number pyramid 

        int num2=num;
        
        for(int i=1;i<=num2;i++){
            for(int j=0;j<(num2-i);j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();

        //palindromic Pattern

        int x=num;

        for(int i=1;i<x;i++){
            int z=i;
            for(int j=0;j<(x-i);j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print(z-- );
            }
            z=2;
            for(int j=1;j<i;j++){
                System.out.print(z++);
            }
            System.out.println();
        }
        System.out.println();

        //diamond pattern

        int w=num;

        for(int i=1;i<w;i++){
            for(int j=0;j<(w-i);j++){
                System.out.print(" ");
            }

            for(int j=0;j<(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=w;i>=0;i--){
            for(int j=0;j<(w-i);j++){
                System.out.print(" ");
            }

            for(int j=0;j<(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Number 8 pattern printing 
        int num3=num;
        System.out.println("Printing pattern 8 from * 's  for n="+num3 + '\n');

        for(int i=0;i<num3/2;i++){
            for(int j=0;j<num3/2;j++){
            if(i==0 || i==(num3/2-1) || j==0 || j==(num3/2-1)){
                System.out.print("* ");
            }else{
                System.out.print("  ");
            }
            // System.out.print("*"+" ");
        }
        System.out.println();
    }

    for(int i=1;i<num3/2;i++){
            for(int j=0;j<num3/2;j++){
            if(i==(num3/2-1) || j==0 || j==(num3/2-1)){
                System.out.print("* ");
            }else{
                System.out.print("  ");
            }
            // System.out.print("*"+" ");
        }
        System.out.println();
    }
    }
}