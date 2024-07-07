#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main(){
    int *ptr;
    ptr = (int *)calloc(5,sizeof(int));
    ptr[0]=1;
    ptr[1]=2;
    ptr[2]=3;
    printf("ptr: ");
    for(int i=0;i<5;i++){
        printf("%d\t",ptr[i]);
    }




    // char str[]="Rajat ";
    // strcpy(str,"%s Hello");
    // char str2[3];
    // printf("\nEnter your full name:");
    // // gets(str2);  //It will not used as it is not checking length of the string as it will take the whole string.
    // fgets(str2,5,stdin);  //It will go till given length minus one as on the last index we have null character.
    // printf("\nString: %s",str2);




    // char *canChange="Rajat";   //This also char array (i.e. String in C)
    // printf("\nBefor Changing name is %s",canChange);
    // canChange="Chetan";
    // printf("\nAfter Changing it we have name as %s",canChange);
    // printf("Pointer is at Adderess %p",canChange);




    
    return 0;
}