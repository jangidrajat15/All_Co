
#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node* left;
    struct node* right;
};

struct node* createNewNode(int data){
    struct node* root;
    root=(struct node*)malloc(sizeof(struct node));
    root->data=data;
    root->left=NULL;
    root->right=NULL;
    return root;
}

void inOrder(struct node* root){
    if(root==NULL){
        return;
    }else{
        inOrder(root->left);
        printf("%d ",root->data);
        inOrder(root->right);
    }
}

struct node* inOrderPredecessor(struct node* root){
    root=root->right;
    while(root->left != NULL){
        root=root->left;
    }
    return root;    
}

struct node* deleteNode(struct node* root,int key){
    struct node* iPre;
    if(root==NULL){
        return NULL;
    }
    // if(root->left==NULL && root->right==NULL){
    //     free(root);
    //     return NULL;
    // }

    if(key < root->data){
        root->left=deleteNode(root->left,key);
    }else if(key > root->data){
        root->right=deleteNode(root->right,key);
    }else{
        // Node Found here
        if(root->left==NULL){
            return root->right;
        }else if (root->right == NULL){
            return root->left;
        }

        iPre=inOrderPredecessor(root);
        root->data=iPre->data;
        root->right=deleteNode(root->right,root->data);
    }
    return root;
}

int main(){
    struct node* p=createNewNode(8);
    struct node* p1=createNewNode(3);
    struct node* p2=createNewNode(10);
    struct node* p3=createNewNode(1);
    struct node* p4=createNewNode(6);
    struct node* p5=createNewNode(14);
    struct node* p6=createNewNode(4);
    struct node* p7=createNewNode(7);
    struct node* p8=createNewNode(13);

    /*
            8
           / \
          3  10
        /\     \
       1 6     14
        /\     /
       4 7    13
    */
    p->left=p1;
    p->right=p2;
    p1->left=p3;
    p1->right=p4;
    p2->right=p5;
    p4->left=p6;
    p4->right=p7;
    p5->left=p8;

    // struct node* p=createNewNode(5);
    // struct node* p1=createNewNode(3);
    // struct node* p2=createNewNode(6);
    // struct node* p3=createNewNode(1);
    // struct node* p4=createNewNode(4);

    // p->left=p1;
    // p->right=p2;
    // p1->left=p3;
    // p1->right=p4;

    int key=1;
    // deleteNode(key);

    inOrder(p);
    deleteNode(p,140);
    printf("\n");
    inOrder(p);


    return 0;
}