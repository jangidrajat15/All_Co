#include<stdio.h>
int main(){
    int n;
    printf("Enter the size of Array: ");
    scanf("%d",&n);
    int arr[n];
    printf("Enter array elements : ");
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    int min=arr[0];
    int count=0;
for(int i=0;i<n;i++){
    if(arr[i]<min)
    min=arr[i];
}
int flag=0;
while(!flag){
    flag=1;
for(int i=0;i<n;i++){
    if(arr[i]!=min){
    arr[i]=arr[i]-min;
    count++;
    }
    if(arr[i]!=1)
    flag=0;
}
for(int i=0;i<n;i++){
if(arr[i]<min)
    min=arr[i];
}
}
printf("Total Number of Cuts : %d",count);
return 0;
}