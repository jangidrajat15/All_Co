// Sorting Algorithm by using Selection Sort.

#include<stdio.h>

int main(){
    int n;
    printf("Enter length of the array: ");
    scanf("%d",&n);
    int arr['n'];
    printf("Enter elements of the array : ");
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    //Selection Sort 

    // for(int i=0;i<(n-1);i++){
    //     int idxmin=i;
    //     for(int j=i+1;j<n;j++){
    //         if(arr[idxmin]>arr[j]){
    //             idxmin=j;
    //         }
    //     }
    //     if(idxmin!=i){
    //         // arr[i]=arr[i]+arr[idxmin];
    //         // arr[idxmin]=arr[i]-arr[idxmin];
    //         // arr[i]=arr[i]-arr[idxmin];
    //         int temp=arr[i];
    //         arr[i]=arr[idxmin];
    //         arr[idxmin]=temp;
    //     }
    // }

    for(int i=0;i<(n-1);i++){
        int minidx=i;
        for(int j=i+1;j<n;j++){
            if(arr[minidx]>arr[j]) minidx=j;
        }
        if(minidx!=i){
            int temp=arr[i];
            arr[i]=arr[minidx];
            arr[minidx]=temp;
        }
    }

    printf("Given Array After Sorting: ");
    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
    return 0;
}