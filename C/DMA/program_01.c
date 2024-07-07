#include<stdio.h>
#include<stdlib.h>

int main(){
    int n;
    int* ptr;
    printf("Enter size of array:");
    scanf("%d",&n);
    ptr=(int*)malloc(n*sizeof(int));
    printf("Enter values:");
    for(int i=0;i<n;i++){
        scanf("%d",&ptr[i]);
    }
    printf("Given Array:\n");
    for(int i=0;i<4;i++){
        printf("%d and %d\n",ptr,*ptr);
        ptr++;
    }
    free(ptr);
    printf("Now Array:\n");
    for(int i=0;i<4;i++){
        printf("%d\n",ptr++);
    }
    return 0;
}