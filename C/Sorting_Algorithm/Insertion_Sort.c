#include<stdio.h>

int main(){
    int n;
    printf("Enter length of the array: ");
    scanf("%d",&n);
    int arr['n'];
    printf("Enter elements of the array: ");
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }

    // Insertion Sort
    
    // for(int i=1;i<n;i++){
    //     int k=i;
    //     while(k>0 && arr[k]<arr[k-1]){
    //         int temp=arr[k];
    //         arr[k]=arr[k-1];
    //         arr[k-1]=temp;
    //         k--;
    //     }
    // }

    for(int i=1;i<n;i++){
        int j=i-1;
        int temp=arr[i];
        while(j>=0 && arr[j]>temp){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=temp;
    }

    // for(int i=0;i<n;i++){
    //     printf("%d ",arr[i]);
    // }
    // printf("\n");
    // }

    printf("Given array after sorting: ");
    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }

    return 0;
}