#include<stdio.h>


//  Recurecive functions.

//  declaration/prototype
int sumN(int N);
int factN(int N);


int main(){
    printf("Sum of first 3 Natural number is : ");
    printf("%d",sumN(3)); //calling function
    printf("\n");
    printf("Factorial of 5: %d",factN(5));      //calling function
    return 0;
}


//  definition of the functions

int sumN(int N){
    if(N==1){
        return 1;
    }
    return sumN(N-1) + N;
}

int factN(int N){
    if(N==1){
        return 1;
    }
    return N*factN(N-1);
}