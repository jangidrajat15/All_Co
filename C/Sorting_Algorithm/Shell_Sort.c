// Sorting Given array by using shell sorting algorithm.


#include<stdio.h>

void printArray(int a[],int n){
    for(int i=0;i<n;i++){
        printf("%d ",a[i]);
    }
}

int main(){
    int n;
    printf("Enter your length of the array: ");
    scanf("%d",&n);
    int arr['n'];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }

    // Main Logic of this sorting algorithm
    // In this first we taken the integer type variable such that it is starting form n/2 (here n is the length of the given array)
    // Then we are running the loop form size=n/2 upto size>0 and by updating size to size/2 every time.
    // Inside this loop we have to compare all the elements form i=size to i=n.
    int i=0;
    for(int size=n/2;size>0;size/=2){
        for(int i=size;i<n;i+=1){
            int temp=arr[i];
            int j;
            for(j=i;j>=size && arr[j-size]>temp;j-=size){
                arr[j]=arr[j-size];
            }
            arr[j]=temp;
        }
        printf("\nAfter %d iteration we have array as ",++i);
        printArray(arr,n);
    }

    printf("\nGiven Array after sorting : ");
    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
    return 0;
}