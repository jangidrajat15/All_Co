//A Program to replace the content of the file to sum of the given two numbers which are given in the file.

#include<stdio.h>

int main(){
    FILE *fptr;
    int num1;
    int num2;
    fptr = fopen("add.txt","r");
    fscanf(fptr,"%d",&num1);
    fscanf(fptr,"%d",&num2);
    fclose(fptr);
    fptr = fopen("add.txt","w");
    printf("ch1: %d and ch2: %d",num1,num2);
    int num3=num1+num2;
    fprintf(fptr,"Sum of %d and %d is %d",num1,num2,num3);
    fclose(fptr);
    return 0;
}