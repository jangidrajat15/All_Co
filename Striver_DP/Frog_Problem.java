// package Striver_DP;

import java.util.Arrays;

public class Frog_Problem {
    public static int f(int idx,int[] arr,int[] dp){
        if(idx<=0){
            return 0;
        }        
        if(dp[idx] != -1) return dp[idx];
        int jump1 = f(idx-1 , arr , dp)  + Math.abs(arr[idx]-arr[idx-1]);
        int jump2=Integer.MAX_VALUE;
        if(idx>1)
        jump2 = f(idx-2,arr,dp) + Math.abs(arr[idx] - arr[idx-2]);
        
        return dp[idx]=Math.min(jump1, jump2);
    } 
    public static void main(String[] args) {
        int arr[]={30,10,60,10,60,50};
        int n=arr.length;
        
        // Recursion 
        // int dp[]=new int[n+1];
        // Arrays.fill(dp,-1);
        // int ans= f(n-1,arr,dp);
        // System.out.print("Minimun Cost is : " + ans );
        
        //DP(Space Complexity Optimized)
        int pre=0;
        int prepre=0;
        int curr=0;
        for(int i=1;i<n;i++){
            int f1=pre + Math.abs(arr[i]-arr[i-1]);
            int f2=Integer.MAX_VALUE;
            if(i>1) f2=prepre+ Math.abs(arr[i]-arr[i-2]);
            curr=Math.min(f1,f2);
            f2=f1;
            f1=curr;
        }
        System.out.println(f1);
        
        return ;
    }
}
