#include<stdio.h>

int main(){
    int N;
    printf("Enter any year: ");
    scanf("%d",&N);
    
    //Checking leap year or not

    //Method_01
    // if((N%4 == 0) && ((N%100 != 0) || (N%400 == 0))){
    //     printf("%d is a Leap Year.",N);
    // }else{
    //     printf("%d is not a Leap Year.",N);
    // }

    //Mathod_02
    if((N%400 ==0) || (N%4 == 0) && (N%100 != 0)){
        printf("%d is Leap Year.",N);
    }else{
        printf("%d is not a Leap Year.",N);
    }
    return 0;
}