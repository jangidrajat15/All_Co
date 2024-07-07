#include <stdio.h>

int main(){
    int currSum=0;
    int maxSum=0;
    int n=5;
    int arr[]={-1,-5,-3,-4,-7};
    for(int i=0;i<n;i++){
        currSum += arr[i];
        if(maxSum<currSum){
            maxSum = currSum;
        }
        if(currSum<0){
            currSum=0;
        }
    }
    printf("Max Sum: %d",maxSum);
    return 0;
}