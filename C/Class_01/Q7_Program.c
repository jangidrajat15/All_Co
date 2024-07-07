#include <stdio.h>
#include<math.h>


int main(){

    int n;
    printf("Enter length of the array: ");
    scanf("%d",&n);
    int arr[n];
    printf("Enter elements of the array: ");
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    int ans=(-1);


    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]<=arr[j]){
                ans = (ans< arr[j]-arr[i])?(arr[j]-arr[i]):ans;
            }
        }            
    }

    printf("Maximum sum in this array = %d" , ans);

    return 0;
}