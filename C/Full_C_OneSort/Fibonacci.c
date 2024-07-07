#include <stdio.h>

int NFibonacciNumber(int N);

int main(){
    int n=7;
    printf("Fibonacci Number at %d position is :%d",n,NFibonacciNumber(n));
    return 0;
}

int NFibonacciNumber(int N){
    if(N==0 || N==1){
        return N;
    }
    int fibN1 = NFibonacciNumber(N-1);
    int fibN2 = NFibonacciNumber(N-2);
    int fibN = fibN1 + fibN2 ;

    // printf("%d %d",N,fibN);
    return fibN;
}