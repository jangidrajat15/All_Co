#include<stdio.h>

int main(){
    //Types of file
    //1. Text File eg. .txt , .c
    //2. Binary File eg. .exe , .mp3 , .jpg

    FILE *fptr,*fptr2;
    // fptr = fopen("filename",MODE);   to open any file and fclose(fptr) for closing file.
    // fptr = fopen("test_01.txt","r");  //here (when we use MODE="r" or "rb") if file not exists then fptr stores NULL
    // if(fptr == NULL){
    //     printf("File Dost not Exists.");
    // }else{
    //     char ch;
    //     fscanf(fptr,"%c",&ch);
    //     printf("Character = %c \n",ch);
    //     fclose(fptr);
    // }

    // fptr2=fopen("test_02.txt","w"); //here (when we use MODE="w" or "wb") if file does not exist then it will be created.

    fptr = fopen("test_01.txt","w");
    fprintf(fptr,"%c",'D');
    fclose(fptr);
    // fclose(fptr);
    return 0;
}