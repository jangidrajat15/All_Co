#include<stdio.h>
#include<malloc.h>

struct node{
    int data;
    struct node* left;
    struct node* right;
};

struct node* addNewNode(int data){
    struct node* temp=(struct node*)malloc(sizeof(struct node));
    temp->data=data;
    temp->left=NULL;
    temp->right=NULL;
    return temp;
}

void insert(struct node* root,int key){
     struct node* prev=NULL;
     while(root!=NULL){
        prev=root;
        if(key==root->data){
            printf("Allready in BST !!");
            return ;
        }else if(key<root->data){
            root=root->left;
        }else{
            root=root->right;
        }
     }
     struct node* newNode=addNewNode(key);
     if(key<prev->data){
        prev->left=newNode;
     }else{
        prev->right=newNode;
     }
}


int main(){
    struct node* p=addNewNode(4);
    struct node* p1=addNewNode(1);
    struct node* p2=addNewNode(6);
    struct node* p3=addNewNode(5);
    struct node* p4=addNewNode(2);

    p->left=p1;
    p->right=p2;
    p1->left=p3;
    p1->right=p4;

    insert(p,7);
    printf("%d ",p->right->right->data);
    return 0;
}
