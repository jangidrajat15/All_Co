
#include<stdio.h>
#include<stdlib.h>

typedef struct NodeFull{
    int data;
    struct NodeFull* next;
}Node;


//Case1: Insert in Start of LinkedList. Time Complexity is O(1).

Node* insertValueAtStart(int data,Node* head){
    Node* temp=(Node*)malloc(sizeof(Node));
    temp->data=data;
    temp->next=head;
    head=temp;
    return temp;
}

//Case2: Insert in between of LinkedList. Time Complexity is O(n).

Node* insertValueAtIndex(int data,Node* head,int idx){
    if(idx==0){
        Node* temp=insertValueAtStart(data,head);
        head=temp;
        return head;
    }else{
        int count=1;
        Node* temp=head;
        while(count<idx && temp!=NULL){
            temp=temp->next;
            count++;
        }
        if(temp==NULL){
            printf("We can't add at the given index\n");
            return head;
        }
        Node* newNode=(Node*)malloc(sizeof(Node));
        newNode->data=data;
        Node* tempnext=temp->next;
        temp->next=newNode;
        newNode->next=tempnext;
        return head;
    }
}

//Case3: Insert At end of the LinkedList. Time Complexity is O(n).

void insertValueAtEnd(int data,Node* head){
    Node* temp=head;
    while(temp->next!=NULL){
        temp=temp->next;
    }
    Node* newNode=(Node*)malloc(sizeof(Node));
    newNode->data=data;
    newNode->next=NULL;
    temp->next=newNode;
    // return head;
}


int main(){
    printf("Linked List Program_01\n");
    Node* head;
    Node* second;
    Node* third;

    head=(Node*)malloc(sizeof(Node));
    second = (Node*)malloc(sizeof(Node));
    third = (Node*)malloc(sizeof(Node));
    
    head->data=10;
    head->next=second;
    
    second->data=20;
    second->next=third;

    third->data=30;
    third->next=NULL;

    head=insertValueAtStart(40,head);
    insertValueAtEnd(50,head);
    head=insertValueAtIndex(60,head,5);

    Node* temp=head;
    while(temp!=NULL){
        printf("%d ",temp->data);
        temp=temp->next;
    }

    return 0;
}