#include <stdio.h>

int main(){
    printf("Enter two numbers: ");
    int num1,num2;
    scanf("%d %d",&num1 , &num2);
    printf("%d + %d = %d",num1,num2,(num1+num2));
    return 0;
}