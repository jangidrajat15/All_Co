#include<stdio.h>

int main(){
    int n;
    printf("Enter your length of the array: ");
    scanf("%d",&n);
    int arr['n'];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }

    for(int i=0;i<(n-1);i++){ 
        for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
                //Alternate method for swaping two numbers
                // arr[j-1]=arr[j]+arr[j-1];
                // arr[j]=arr[j-1]-arr[j];
                // arr[j-1]=arr[j-1]-arr[j];
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }

    printf("Given Array is : ");
    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
    return 0;
}