#include<stdio.h>
#include<stdlib.h>

struct queue{
    int size;
    int f;
    int r;
    int *arr;
};

int isFull(struct queue *Q){
    if(Q->r == Q->size-1){
        return 1;
    }else{
        return 0;
    }
}

int isEmpty(struct queue *Q){
    if(Q->r == Q->f){
        return 1;
    }else{
        return 0;
    }
}

void enqueue(struct queue *Q,int val){
    if(isFull(Q)){
        printf("Queue is full.");
    }else{
        Q->r++;
        Q->arr[Q->r]=val;
    }
}

int dequeue(struct queue *Q){
    int a=(-1);
    if(isEmpty(Q)){
        printf("Queue is Empty.");
    }else{
        Q->f++;
        a = Q->arr[Q->f];
    }
    return a;
}
int main(){
    struct queue Q;
    Q.size=100;
    Q.f=Q.r=(-1);
    Q.arr = (int *)malloc(Q.size*sizeof(int));

    if(isEmpty(&Q)) printf("Queue is Empty.");
    enqueue(&Q,10);
    enqueue(&Q,20);
    printf("\nDequeued %d",dequeue(&Q));
    enqueue(&Q,30);
    printf("\nDequeued %d",dequeue(&Q));
    if(isEmpty(&Q)) printf("\nQueue is Empty.");
    else printf("\nQueue is not empty.");


    
    return 0;
}