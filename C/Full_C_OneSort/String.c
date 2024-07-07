#include<stdio.h>

void printString(char name[]);

int main(){
    // char name[]="Rajat Jangid";
    // printString(name);
    // char name2[50];
    // printf("\nEnter your name: ");
    // scanf("%s",name2);
    // printf("You entered your name : %s",name2);

    // char name3[100];
    // printf("Enter your name: ");
    // // gets(name3);
    // fgets(name3,100,stdin);
    // puts(name3);
    
    char *canChange="Rajat jangid";
    puts(canChange);
    canChange="Chetan Jangid";
    puts(canChange);

    return 0;
}

void printString(char name[]){
    for(int i=0;name[i]!='\0';i++){
        printf("%c",name[i]);
    }
}