// Tree Sort
// Tree Sort is a sorting algorithm that leverages a binary search tree (BST) to sort elements. Here’s a step-by-step explanation of how it works:

// Insert Elements into the BST: Each element from the input array is inserted into the BST. This insertion process will place smaller elements to the left and larger elements to the right, maintaining the BST property.
// In-order Traversal: Once all elements are inserted, an in-order traversal of the BST is performed. This traversal will visit the nodes in non-decreasing order, effectively sorting the elements.


#include <stdio.h>
#include <stdlib.h>

// Define the structure for the tree node
struct TreeNode {
    int data;
    struct TreeNode* left;
    struct TreeNode* right;
};

// Function to create a new tree node
struct TreeNode* createNode(int data) {
    struct TreeNode* newNode = (struct TreeNode*)malloc(sizeof(struct TreeNode));
    newNode->data = data;
    newNode->left = newNode->right = NULL;
    return newNode;
}

// Function to insert a node into the BST
struct TreeNode* insertNode(struct TreeNode* root, int data) {
    if (root == NULL) {
        return createNode(data);
    }
    if (data < root->data) {
        root->left = insertNode(root->left, data);
    } else {
        root->right = insertNode(root->right, data);
    }
    return root;
}

// Function to perform in-order traversal and store the result in an array
void inorderTraversal(struct TreeNode* root, int* arr, int* index) {
    if (root == NULL) {
        return;
    }
    inorderTraversal(root->left, arr, index);
    arr[(*index)++] = root->data;
    inorderTraversal(root->right, arr, index);
}

// Tree Sort function
void treeSort(int arr[], int n) {
    struct TreeNode* root = NULL;
    for (int i = 0; i < n; i++) {
        root = insertNode(root, arr[i]);
    }
    int index = 0;
    inorderTraversal(root, arr, &index);
}

// Function to print the array
void printArray(int arr[], int size) {
    for (int i = 0; i < size; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

// Main function to test Tree Sort
int main() {
    int arr[] = {5, 3, 7, 2, 8, 1, 9};
    int n = sizeof(arr)/sizeof(arr[0]);
    treeSort(arr, n);
    printf("Sorted array: \n");
    printArray(arr, n);
    return 0;
}
