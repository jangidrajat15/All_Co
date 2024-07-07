
#include<stdio.h>
#include<string.h>

typedef struct student{
    int num1;
    float cgpa;
    char name[100];
}std;

void PrintInfo(std obj);

int main(){
    std obj={89,8.9,"Rajat Jangid"};
    // printf("Student Details: ");
    PrintInfo(obj);
    return 0;
}

void PrintInfo(std obj){
    printf("Student Info \n");
    printf("Name: %s\n",obj.name);
    printf("Age: %d\n",obj.num1);
    printf("CGPA in sem 1: %f\n",obj.cgpa);
}
