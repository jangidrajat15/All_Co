#include<stdio.h>
#include<string.h>

#define MAX_SIZE 100  
typedef struct {  
    int arr[MAX_SIZE];  
    int top;  
} Stack; 

void initialize (Stack *stack) {  
    stack->top = -1;  
}  


void push (Stack *stack, int element) {  
    if (stack->top == MAX_SIZE - 1) {  
        printf("Stack Overflow! Cannot push element %d\n", element);  
        return;  
    }  
    stack->arr[++stack->top] = element;  
}  

int pop (Stack *stack) {  
    if (stack->top == -1) {  
        printf("Stack Underflow! Cannot pop element.\n");  
        return -1; // Return an invalid value to indicate underflow  
    }  
    return stack->arr[stack->top--];  
}  


int peek (Stack *stack) {  
    if (stack->top == -1) {  
        printf("Stack is empty!\n");  
        return -1; // Return an invalid value to indicate an empty stack  
    }  
    return stack->arr[stack->top];  
}  

int main(){
    // Stack stack;

    // char str[]="";
    // gets(str);  // For Taking Input from user
    // puts(str);  // For Printing given string
    // // printf("\n%s",str);
    Stack stack;  
    initialize(&stack);  
  
    // push (&stack, 10);  
    // push (&stack, 20);  
    // push (&stack, 30);  
  
    // printf("Top element: %d\n", peek(&stack));  
  
    // printf("Popped element: %d\n", pop(&stack));
  
    // printf("Top element after popping: %d\n", peek(&stack));

    char str[]="";
    gets(str);  // For Taking Input from user
    puts(str);  // For Printing given string

    for(int i=0;str[i]!='\0';i++){

    }

  
    return 0;  

    return 0;
}