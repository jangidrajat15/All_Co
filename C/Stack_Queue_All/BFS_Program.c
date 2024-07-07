#include<stdio.h>
#include<stdlib.h>

struct Queue{
    int r;
    int f;
    int size;
    int *arr;
};

int isFull(struct Queue *Q){
    if(Q->r == Q->size-1){
        return 1;
    }
    else{
        return 0;
    }
}

int isEmpty(struct Queue *Q){
    if(Q->r == Q->f){
        return 1;
    }
    else{
        return 0;
    }
}

void enqueue(struct Queue *Q,int data){
    if(isFull(Q)){
        printf("Queue is Full");
    }else{
        Q->r++;
        Q->arr[Q->r]=data;
        // printf("Enqueued element as %d",Q->arr[Q->f]);
    }
}

int dequeue(struct Queue *Q){
    int a=(-1);
    if(isEmpty(Q)){
        printf("Queue is Empty");
    }else{
        Q->f++;
        a=Q->arr[Q->f];
        // printf("Dequeued element is %d",Q->arr[Q->f]);
    }
    return a;
}

void printQueue(struct Queue *Q){

    while(!isEmpty(Q)){
        // Q->f++;
        dequeue(Q);
        printf("%d ",Q->arr[Q->f]);
    }
}

int Visited[7]={0};
int A[7][7]={
        {0,1,1,1,0,0,0},
        {1,0,1,0,0,0,0},
        {1,1,0,1,1,0,0},
        {1,0,1,0,1,0,0},
        {0,0,1,1,0,1,1},
        {0,0,0,0,1,0,0},
        {0,0,0,0,1,0,0}
};

void DFS(int j){
    printf("%d",j);
    Visited[j]=1;

    for(int i=0;i<7;i++){
        if(A[j][i]==1 && Visited[i]==0){
            DFS(i);
        }
    }
}

int main(){

    struct Queue Q1;
    Q1.size=100;
    Q1.f=Q1.r=-1;
    // Q1.arr = (int *)malloc(Q1.size*sizeof(int));
    Q1.arr = (int *)malloc(Q1.size*sizeof(int));

    // enqueue(&Q1,10);
    // enqueue(&Q1,20);
    // enqueue(&Q1,30);
    // enqueue(&Q1,40);

    // printQueue(&Q1);
    // printf("\n");

    // enqueue(&Q1,10);
    // enqueue(&Q1,20);
    // enqueue(&Q1,30);
    // dequeue(&Q1);
    // printQueue(&Q1);

    //BFS traversal 
    struct Queue Q2;
    Q2.size=100;
    Q2.r=Q2.f=-1;
    Q2.arr = (int *)malloc(Q2.size*sizeof(int));
    int u;
    int i=1;
    int visited[7]={0};
    int a[7][7]={
        {0,1,1,1,0,0,0},
        {1,0,1,0,0,0,0},
        {1,1,0,1,1,0,0},
        {1,0,1,0,1,0,0},
        {0,0,1,1,0,1,1},
        {0,0,0,0,1,0,0},
        {0,0,0,0,1,0,0}
    };

    printf("%d",i);
    visited[i]=1;
    enqueue(&Q2,i);
    while(!isEmpty(&Q2)){
        int node=dequeue(&Q2);
        for(int j=0;j<7;j++){
            if(a[node][j]==1 && visited[j]==0){
                printf("%d",j);
                visited[j]=1;
                enqueue(&Q2,j);
            }
        }
    }


    printf("\n");

    DFS(0);

    return 0;
}