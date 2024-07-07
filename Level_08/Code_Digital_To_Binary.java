package Level_08;

public class Code_Digital_To_Binary {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int arr[]=new int[10];
        int n=8;
        int i=n;
        int m=(-1);
        while(m!=0){
            m=n>>0;
            n-= m;
            arr[i--]=(m%2);
            System.out.println(m);
        }
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println(n%2);
    }
}
