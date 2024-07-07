#include<stdio.h>
#include<malloc.h>

struct node{
    int data;
    struct node* left;
    struct node* right;
    int height;
};

int getHeight(struct node* n){
    if(n==NULL){
        return 0;
    }
    return n->height;
}

struct node* createNode(int data){
    struct node* root=(struct node*)malloc(sizeof(struct node));
    root->data=data;
    root->left=NULL;
    root->right=NULL;
    root->height=1;
    return root;
}

int getBalanceFactor(struct node* n){
    if(n == NULL){
        return 0;
    }
    return getHeight(n->right)-getHeight(n->left);
}

struct node* leftRotate(struct node* x){
    
}

int main(){

    return 0;
}