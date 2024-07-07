//A Program to make file name as odd.txt and in that you have to store odd numbers from 1 to n.

#include<stdio.h>

int main(){
    FILE *fptr;
    fptr=fopen("odd.txt","w");
    int n;
    printf("Enter n:");
    scanf("%d",&n);
    for(int i=1;i<=n;i+=2){
        fprintf(fptr,"%d\t",i);
    }
    fclose(fptr);
    return 0;
}