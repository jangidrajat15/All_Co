public class Bit_Manipulation_02 {
    static long pairAndSum(int n,long arr[]){

        long ans=0;
        
        for(int i=0;i<32;i++){
        
        long cnt=0;
        
        for(int j=0;j<n;j++){
        
            if((arr[j]&(1<<i))!=0) cnt++;
        }
        ans+=(1<<i)*(cnt*(cnt-1)/2);
        
        }
        
        return ans;
        
    }
    public static void main(String[] args) {
        int n=4;
        long[] arr={2,5,12,24};
        long ans=pairAndSum(n, arr);
        System.out.println("Ans="+ans);
        return ;
    }
}
