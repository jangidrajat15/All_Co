#include<stdio.h>

int main(){
    printf("Hello World\n");
    int a=2;
    if(a=1){
        printf("a is true");
    }else{
        printf("a is false");
    }
    printf("\n");
    for(int i=0;i<5;++i){
        printf("i: %d\n", i);
    }
    return 0;
}