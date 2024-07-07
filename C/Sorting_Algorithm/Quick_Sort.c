#include<stdio.h>

int partition(int arr[],int low,int high){
    int pivot=arr[high];
    int i=low-1;
    for(int j=low;j<high;j++){
        if(arr[j]<pivot){
            i++;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }   
    }
    i++;
    int temp=arr[i];
    arr[i]=pivot;
    arr[high]=temp;
    // printf("Pivot:%d i:%d ",pivot,i);
    return i;
}

void quickSort(int arr[],int low,int high){
    if(low<high){
        int pidx=partition(arr,low,high);
        quickSort(arr,low,pidx-1);
        quickSort(arr,pidx+1,high);
    }
}

int main(){
    int n;
    printf("Enter n: ");
    scanf("%d",&n);
    int arr['n'];
    printf("Enter Elements: ");
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    } 
    // for(int i=0;i<n;i++){
    //     printf(arr[i] + " ");
    // }
    quickSort(arr,0,n-1);
    printf("After sorting given array we get : ");
    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
    return 0;
}

