#include<stdio.h>
#include<Windows.h>
#include<conio.h>

void test(int a, int b) {
    printf("a: %d, b: %d\n", a, b);
}


int main(){
    printf("%d",printf("%d",124) + printf("%s","Hello"));
    printf("\n%10s","Rajat jangid how are you");
    char ch=255;
    ch = ch + 10;
    printf("\n%d",ch);
    signed num=10;
    printf("\n%li",num);

    // unsigned i=1;
    // int j=(-4);
    // printf("\n%d",i+j);

    int var=0x43FF;
    printf("\n%X",var);

    printf("\a");
    int main=10;
    printf("\n%d",main);

    // int num1=5;
    int num1=1;
    printf("\n%d %d",num1,num1++);
    int n = 1;
    test(n++, n++);
    
    int i=1;
    if(i++ && i==2)
    printf("\nTrue");
    else
    printf("\nFalse");

    getch();  // it will stop the program till any key pressed by user.

    return 0;
}