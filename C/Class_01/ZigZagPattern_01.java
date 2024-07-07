import java.util.Scanner;

class ZigZagPattern_01{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,m;
        System.out.println("Enter order of the matrix: ");
        n=sc.nextInt();
        m=sc.nextInt();
        int[][] arr=new int[n][m];

        System.out.println("Enter elements of the matrix row wise: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        //Print matrix
        // for(int l=0;l<n;l++){
        //     for(int p=0;p<m;p++){
        //         System.out.print(arr[l][p] + " ");
        //     }
        //     System.out.println();
        // }

        System.out.println();
        
        //Printing in Zig Zag Pattern
        int i=0;
        int j=0;
        int check=0;
        System.out.println(arr[0][0]);
        while(i!=(n-1) || j!=(m-1)){
            if(j==(m-1) && i==0){
                i++;
                check=0;
                System.out.println("1. " + arr[i][j] + " ");
            }else if(i==(n-1) && j==0){
                j++;
                check=1;
                System.out.println("3 " + arr[i][j] + " ");
            }else if(j<m && (i==0 || i==(n-1))){
                j++;
                check=0;
                System.out.println("2 " + arr[i][j] + " ");
            }else if(i<n && (j==0 || j==(m-1))){
                i++;
                check=1;
                System.out.println("4 " + arr[i][j] + " ");
            }
            if(check==0){
                i++;
                j--;
            System.out.println("5 " + arr[i][j] + " ");
            }
            if(check==1){
                i--;
                j++;
            System.out.println("6 "  + arr[i][j] + " ");
            }
             
        }


        
        sc.close();
    }
}