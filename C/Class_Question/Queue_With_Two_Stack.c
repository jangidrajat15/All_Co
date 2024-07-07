// #include <stdio.h>
// #include <stdlib.h>

// // Structure for stack node
// struct StackNode {
//     int data;
//     struct StackNode* next;
// };

// // Structure for stack
// struct Stack {
//     struct StackNode* top;
// };

// // Function to create a new node
// struct StackNode* newNode(int data) {
//     struct StackNode* stackNode = (struct StackNode*)malloc(sizeof(struct StackNode));
//     stackNode->data = data;
//     stackNode->next = NULL;
//     return stackNode;
// }

// // Function to create an empty stack
// struct Stack* createStack() {
//     struct Stack* stack = (struct Stack*)malloc(sizeof(struct Stack));
//     stack->top = NULL;
//     return stack;
// }

// // Function to push an item to stack
// void push(struct Stack* stack, int data) {
//     struct StackNode* stackNode = newNode(data);
//     stackNode->next = stack->top;
//     stack->top = stackNode;
// }

// // Function to pop an item from stack
// int pop(struct Stack* stack) {
//     if (stack->top == NULL) {
//         printf("Stack underflow\n");
//         return -1;
//     }
//     struct StackNode* temp = stack->top;
//     int popped = temp->data;
//     stack->top = stack->top->next;
//     free(temp);
//     return popped;
// }

// // Function to enqueue an item to queue
// void enqueue(struct Stack* stack1, int data) {
//     push(stack1, data);
// }

// // Function to dequeue an item from queue
// int dequeue(struct Stack* stack1, struct Stack* stack2) {
//     if (stack1->top == NULL && stack2->top == NULL) {
//         printf("Queue is empty\n");
//         return -1;
//     }

//     if (stack2->top == NULL) {
//         while (stack1->top != NULL) {
//             push(stack2, pop(stack1));
//         }
//     }
//     return pop(stack2);
// }

// int main() {
//     // Create two stacks to simulate queue
//     struct Stack* stack1 = createStack();
//     struct Stack* stack2 = createStack();

//     // Enqueue some elements
//     enqueue(stack1, 1);
//     enqueue(stack1, 2);
//     enqueue(stack1, 3);

//     // Dequeue elements
//     printf("%d\n", dequeue(stack1, stack2)); // Output: 1
//     printf("%d\n", dequeue(stack1, stack2)); // Output: 2

//     // Enqueue more elements
//     enqueue(stack1, 4);
//     enqueue(stack1, 5);

//     // Dequeue remaining elements
//     printf("%d\n", dequeue(stack1, stack2)); // Output: 3
//     printf("%d\n", dequeue(stack1, stack2)); // Output: 4
//     printf("%d\n", dequeue(stack1, stack2)); // Output: 5

//     // Try to dequeue from empty queue
//     printf("%d\n", dequeue(stack1, stack2)); // Output: Queue is empty

//     return 0;
// }


#include<stdio.h>  
#define N 5  
int stack1[N], stack2[N]; // declaration of two stacks  
// declaration of top variables.  
int top1=-1, top2=-1;   
int count=0;  
// inserting the elements in stack1.  
void push1(int data)  
{  
// Condition to check whether the stack1 is full or not.    
 if(top1==N-1)  
{  
   printf("\n Stack is overflow...");  
}  
else  
{  
   top1++;                                         // Incrementing the value of top1  
   stack1[top1]=data;                            // pushing the data into stack1  
}  
}  
                                                  // Removing the elements from the stack1.  
int pop1()  
{  
                                                // Condition to check whether the stack1 is empty or not.    
if(top1==-1)  
{  
   printf("\nStack is empty..");  
}  
else  
{  
   int a=stack1[top1];                           // Assigning the topmost value of stack1 to 'a' variable.   
   top1--;                                       // decrementing the value of top1.  
   return a;   
}  
}   
                                            // pushing the data into the stack2.  
void push2(int x)  
{  
                                            //  Condition to check whether the stack2 is full or not  
if(top2==N-1)  
{  
   printf("\nStack is full..");  
}  
else  
{  
    top2++;                                  // incrementing the value of top2.  
    stack2[top2]=x;                          // assigning the 'x' value to the Stack2  
  
}  
}   
// Removing the elements from the Stack2  
int pop2()  
{  
   int element = stack2[top2];               // assigning the topmost value to element  
   top2--;                                  // decrement the value of top2  
   return element;  
}   
void enqueue(int x)  
{  
    push1(x);  
    count++;  
}  
void dequeue()  
{  
   if((top1==-1) && (top2==-1))  
{  
   printf("\nQueue is empty");  
}  
else  
{  
  for(int i=0;i<count;i++)  
  {  
     int element = pop1();  
     push2(element);  
  }  
int b= pop2();  
printf("\nThe dequeued element is %d", b);  
printf("\n");  
count--;  
for(int i=0;i<count;i++)  
{  
   int a = pop2();  
   push1(a);   
}  
}}   
void display()  
{  
   for(int i=0;i<=top1;i++)  
  {  
     printf("%d , ", stack1[i]);  
  }  
}  
void main()  
{  
   enqueue(10);  
   enqueue(20);  
   enqueue(30);  
   dequeue();  
   enqueue(40);  
   display(); 
}  