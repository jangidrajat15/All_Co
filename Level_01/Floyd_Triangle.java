public class Floyd_Triangle {
    public static void main(String[] args){
        int n=5;
        int count=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                //for printing binary triangle
                // if((i+j)%2 == 0){
                //     count=1;
                // }else{
                //     count=0;
                // }
                // System.out.print(count + " ");
                
                //for floyd Triangle
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
        // int a=9;
        // char ch='a';
        // ch = (char)(ch + a );
        // System.out.println(ch);
        // int ans=ch;
        // System.out.println("Ans: "+ ans);
        int x=2;
        int y=1;
        System.out.println("&: " + (x & y));
    }
}
